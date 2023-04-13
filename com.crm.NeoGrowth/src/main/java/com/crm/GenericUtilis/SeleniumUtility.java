package com.crm.GenericUtilis;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumUtility extends Driver {
	/**
	 * @author Pavan.Joshi
	 * @return
	 */
	public String getCurrentUrl() {
        try {
            String title = driver.getCurrentUrl();
            System.out.println("Title is : " + title);
            return title;
        } catch (Exception e) {
            System.out.println("Unable to get title");
            return "Unable to get title";
        }
    }
        
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
          * @param locator
          * @return
          */
	 public WebElement findElementByAnyLocator(String locator) {
	        WebElement element = null;
	        try {
	            if (driver.findElement(By.id(locator)).isDisplayed()) {
	                element = driver.findElement(By.id(locator));
	                return element;
	            }
	        } catch (Exception e) {
	        }
	        try {
	            if (driver.findElement(By.name(locator)).isDisplayed()) {
	                element = driver.findElement(By.name(locator));
	                return element;
	            }
	        } catch (Exception e) {
	        }
	        try {
	            if (driver.findElement(By.className(locator)).isDisplayed()) {
	                element = driver.findElement(By.className(locator));
	                return element;
	            }
	        } catch (Exception e) {
	        }
	        try {
	            if (driver.findElement(By.linkText(locator)).isDisplayed()) {
	                element = driver.findElement(By.linkText(locator));
	                return element;
	            }
	        } catch (Exception e) {
	        }
	        try {
	            if (driver.findElement(By.cssSelector(locator)).isDisplayed()) {
	                element = driver.findElement(By.cssSelector(locator));
	                return element;
	            }
	        } catch (Exception e) {
	        }
	        try {
	            if (driver.findElement(By.partialLinkText(locator)).isDisplayed()) {
	                element = driver.findElement(By.partialLinkText(locator));
	                return element;
	            }
	        } catch (Exception e) {
	        }
	        try {
	            if (driver.findElement(By.xpath(locator)).isDisplayed()) {
	                element = driver.findElement(By.xpath(locator));
	                return element;
	            }
	        } catch (Exception e) {

	        }
	        try {
	            if (driver.findElement(By.tagName(locator)).isDisplayed()) {
	                element = driver.findElement(By.tagName(locator));
	                return element;
	            }
	        } catch (Exception e) {
	            Assert.fail("Element not found | Error - " + e);
	            return null;
	        }
	        if (element == null) {
	            Assert.fail("\n Locator : " + locator + " ************** Not Found");
	        }
	        return null;
	    }
	 
        /**
         * @author Pavan.Joshi
         * @param xpath
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
	  * @author Pavan.Joshi
	  * @param xpath
	  * @return
	  */
	 public List<String> getAllElementsToList(String xpath) {
	        try {
	        	ArrayList<String> AllElementsText=new ArrayList<String>();
	            List<WebElement> AllElements = driver.findElements(By.xpath(xpath));
	            System.out.println("Size of all elements" + AllElements.size());
	            for (int i = 0; i < AllElements.size(); i++) {
	                String aa = AllElements.get(i).getText();
	                AllElementsText.add(aa);
	            }
	            System.out.println("Size of getAllElements ArrayList:" + AllElementsText.size());
	            return AllElementsText;
	        } catch (Exception e) {
	            System.out.println("Element not found | Error - " + e);
	            ArrayList<String> AllElement1 = new ArrayList<String>();
	            AllElement1.add("Unable to get text for all options");
	            return AllElement1;
	        }
	    }














}
