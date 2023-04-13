package com.crm.GenericUtilis;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

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

    public Properties readConfig(String key) throws IOException
    {
        try {
            prop=new Properties();
            FileInputStream fis= new FileInputStream(IpathConstant.Proppath);
            prop.load(fis);
            return  prop;

        }
        catch (Exception e)
        {
            return null;

        }


    }

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
  private WebDriver setFireFoxDriverLocal()
  {
      FirefoxOptions options= new FirefoxOptions();
      options.addArguments("-private");

      WebDriverManager.firefoxdriver().setup();
      driver=new FirefoxDriver(options);
      return driver;
  }
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



    public static WebDriver getWebDriver()
    {
        System.out.println("WebDriver "+threadDriver.get());
        return threadDriver.get();
    }
	
}
