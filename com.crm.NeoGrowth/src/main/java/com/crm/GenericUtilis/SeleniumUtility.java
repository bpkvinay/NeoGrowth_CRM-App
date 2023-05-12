package com.crm.GenericUtilis;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.datatable.DataTable;

public class SeleniumUtility extends Driver {
	/**
	 * @author Pavan.Joshi
	 * @return
	 */
	
	public JavascriptExecutor jsExecutor=(JavascriptExecutor)driver;
	
	     
	/**
	 * @author Pavan.Joshi
	 * @return
	 */
	 public String getCurrentURL() {
	        try {
	            String currentURL = driver.getCurrentUrl();
	            System.out.println("Current URL is : " + currentURL);
	            return currentURL;
	        } catch (Exception e) {
	            Assert.fail("Error in getting current URL" + "|Error - " + e);
	            return null;
	        }
	    }
	 
	 /**
	  * @author Pavan.Joshi
	  * @param xpath
	  * @param duration
	  */
	 public void explicitVisibilityWait(String xpath, int duration) {
	        try {
	            WebDriverWait wdWait = new WebDriverWait(driver, Duration.ofSeconds(duration));
	            wdWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
	        } catch (Exception e) {
	            Assert.fail("Element not found :" + xpath + "|Error - " + e);
	        }
	    }
	 
        
	 
      /**
       * @author Pavan.Joshi
       * @param element
       */
	 public void moveToElement(WebElement element) {
	        try {
	           // WebElement element = driver.findElement(By.xpath(xpath));
	            Actions act=new Actions(driver);
	            act.moveToElement(element).click().perform();
	        } catch (Exception e) {
	            Assert.fail("Element not found " + element + "|Error - " + e);
	        }
	    }
	 

     /**
      * @author Pavan.Joshi
      * @param element
      */
	 public void clickElement(WebElement element) {
	        try {
	            element.click();
	        } catch (Exception e) {
	            Assert.fail("Element not found :" + element + "|Error - " + e);
	        }
	    }
   
	 /**
	  * @author Pavan.Joshi
	  * @param classname
	  */
	 public void clickByClass(String classname) {
	        try {
	            driver.findElement(By.className(classname)).click();
	        } catch (Exception e) {
	            Assert.fail("element not found :" + classname + "|Error - " + e);
	        }
	    }

	 
	        
	        
	 /**
	  * @author Vinay.Gaonkar
	  * @param element
	  * @param  to get 
	  */
	        public synchronized void selectByText(WebElement element, String Text) {
	    		try {
	    			Select selecvalue=new Select(element);
	    			selecvalue.selectByVisibleText(Text);
	    		} catch (Exception e) {
	    			Assert.fail("Unable to select  " + Text);
	    		}
	        }
	        
	    		public synchronized void selectByvalue(WebElement element, String value) {
		    		try {
		    			Select selecvalue=new Select(element);
		    			selecvalue.selectByValue(value);
		    		} catch (Exception e) {
		    			Assert.fail("Unable to select  " + value);
		    		}
		    		
	    		
	    	}
	    		
		    		public synchronized void selectByindex(WebElement element, int index) {
			    		try {
			    			Select selecvalue=new Select(element);
			    			selecvalue.selectByIndex(index);
			    		} catch (Exception e) {
			    			Assert.fail("Unable to select  " + index);
			    		}	}
	    		
			    		
			    		public void clickCheckBox(WebElement element, String elementname) {

			    			if (element.isSelected()) {
			                  Assert.assertTrue(elementname, true);;
			    			} else {
			    				element.click();
			    			}
                              
			    			}
			    			
			    		
			    		/**
			    		 * @author Vinay.Gaonkar
			    		 * @param element
			    		 * @param elementName
			    		 */
			    			public void scrollToElement(WebElement element, String elementName)  {
			    				try {
			    					jsExecutor.executeScript("arguments[0].scrollIntoView(true);", element);
			    				} catch (Exception e) {
			    					Assert.fail("unable to scroll" + elementName);
			    				}		
			    			}
			    				
			    				
			    				public void togetoptionspresentindropdown(WebElement element) {
			    					
			    					Select se= new Select(element);
			    					List<WebElement> options = se.getOptions();
			    					System.out.println("Options present in" + element + "dropdown");
									for(WebElement b:options) {
			    						System.out.println(b.getText());
			    					
			    				}}

									public void Alertpopupclickokbutton() {
										driver.switchTo().alert().accept();
									}
									
									public void AlertpopupclickCancelbutton() {
										driver.switchTo().alert().dismiss();
									}
			    				
 	
		/**
		 * @author Pavan.Joshi
		 * This method Used to handle the windows and child windows
		 * 
		 */
      public void windowHandle() {
	    String parent=driver.getWindowHandle();
        Set<String>s=driver.getWindowHandles();
          Iterator<String> I1= s.iterator();{
         while(I1.hasNext())
		{
		String child_window=I1.next();
        if(!parent.equals(child_window))
		{
		driver.switchTo().window(child_window);
        System.out.println(driver.switchTo().window(child_window).getTitle());
		}
		}
}}
		
//	    /**
//	     * @author Pavan.Joshi
//	     * @param dataTable
//	     * @param xpath
//	     */
//      public void compare2Lists(DataTable dataTable, String xpath) {
//        List<String> fieldsExp = dataTable.asList();
//       List<String> fieldsAct = driver.findElements(By.xpath(xpath)).
//                stream().map(element -> element.getText().trim()).toList();
//        System.out.println("Fields size actual"+fieldsAct.size());
//        System.out.println("Fields size expected"+fieldsExp.size());
//        System.out.println("Fields actual"+ fieldsAct);
//        System.out.println("Fields expected"+ fieldsExp);
//        Assert.assertEquals(fieldsExp, fieldsAct);
//    }
         
      /**
       * @author Pavan.Joshi
       * @param calendarpopUpXpath
       * @param nextButtonXpath
       */
      public void clickdatemonthyeartag(String calendarpopUpXpath,String nextButtonXpath,String monthYearXpath,String monthYear,String DaydynamicXpath) {
    	 boolean isDatefound=false;
    	 driver.findElement(By.xpath(calendarpopUpXpath)).click();
    	 WebElement nextButton = driver.findElement(By.xpath(nextButtonXpath));
    	 while (!isDatefound) {
			WebElement monthyearElement = driver.findElement(By.xpath(monthYearXpath));
			if(monthyearElement.getText().equalsIgnoreCase(monthYear)) {
				driver.findElement(By.xpath(DaydynamicXpath)).click();
				isDatefound=true;
			}else {
				nextButton.click();
			}
		}
    	  
    	  
      }


      }
