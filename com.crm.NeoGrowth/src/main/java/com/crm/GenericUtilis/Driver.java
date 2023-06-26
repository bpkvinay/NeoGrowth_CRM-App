package com.crm.GenericUtilis;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.Random;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Driver {
	public  WebDriver driver=getWebDriver();
    private static ThreadLocal<WebDriver>threadDriver=new ThreadLocal<WebDriver>();
    private static DesiredCapabilities capabilities;
    public static Properties prop;
    
    /**
     * This Method is used to fetchData From Properties File
     * @param key
     * @return
     * @throws IOException
     * @author Vinay.Gaonkar
     */
    
    public String readConfig(String key) throws IOException
    {
        try {
            prop=new Properties();
            FileInputStream fis= new FileInputStream(IpathConstant.Proppath);
            prop.load(fis);
            return  prop.getProperty(key);

        }
        catch (Exception e)
        {
            return null;

        }
    }
    
    
     /**
      * This Method is used to FetchData From ExcelSheet
      * @param sheetname
      * @param rownum
      * @param colnum
      * @return
      * @throws EncryptedDocumentException
      * @throws IOException
      * @author Vinay.Gaonkar
      */
        public String getexceldata(String sheetname, int rownum,int colnum) throws EncryptedDocumentException, IOException {
        	
        	FileInputStream xls=new FileInputStream(IpathConstant.Excelpath);
        	Workbook wb = (Workbook) WorkbookFactory.create(xls);
        	return wb.getSheet(sheetname).getRow(rownum).getCell(colnum).getStringCellValue();
        }

    

        /**
         * This Method is used to LaunchBrowser
         * @param browser
         * @param URL
         * @author Pavan.Joshi
         */
        
  public void openBrowser(String browser, String URL)
  {
      DesiredCapabilities capabilities;
      switch (browser)
      {
          case ("firefox"):
              threadDriver.set(setFireFoxDriverLocal());
              break;
          case ("chrome"):
              threadDriver.set(setChromeDriverLocal());
              break;

          default:
              Assert.fail("invalid browser");
 }
      driver.manage().deleteAllCookies();
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
      driver.get(URL);
  }
  
  
  /**
   * This Method is used for SetFireFoxDriver
   * @return
   * @author Pavan.Joshi
   */
  
  private WebDriver setFireFoxDriverLocal()
  {
      FirefoxOptions options= new FirefoxOptions();
      options.addArguments("-private");

      WebDriverManager.firefoxdriver().setup();
      driver=new FirefoxDriver(options);
      return driver;
  }
  
  
  
  /**
   * This Method is used for SetChromeDriver
   * @return
   * @author Pavan.Joshi
   */
    private WebDriver setChromeDriverLocal()
    {
        ChromeOptions options= new ChromeOptions();
        options.addArguments("--incognito");
        options.addArguments("--remote-allow-origins=*");
        options.addArguments("--disable-dev-shm-usage");

        WebDriverManager.chromedriver().setup();

        driver=new ChromeDriver(options);

        return driver;
    }


     /**`
      * 
      * @return
      */
    
    public static WebDriver getWebDriver()
    {
        //System.out.println("WebDriver "+threadDriver.get());
        return threadDriver.get();
    }
	
    public long randomnumber(long random) {
    	Random rt=new Random();
    	long fa = rt.nextLong(random);
    	return fa;
    }
    
    public String getrandomnumber() {
    	long random = randomnumber(500000);
    	String convertedlongtoString = String.valueOf(random);
    	String num="95432"+convertedlongtoString;
    	return num;
    	
    }
    
}

