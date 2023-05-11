package com.crm.GenericUtilis;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumUtility extends Driver {
	public JavascriptExecutor jsExecutor=(JavascriptExecutor)driver;
	
	
	/**
	 * This method is used to getCurrentURL 
	 * @return
	 * @author Pavan.Joshi
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
	  * This method is used to for Synchronization between application and Browser by using ExplicityWait
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
       * This Method is used to Mousehover Actions
       * @param element
       * @author Pavan.Joshi
       */
	 public void moveToElement(WebElement element) {
	        try {
	            Actions act=new Actions(driver);
	            act.moveToElement(element).click().perform();
	        } catch (Exception e) {
	            Assert.fail("Element not found " + element + "|Error - " + e);
	        }
	    }
 

	 /**
	  * 
	  * @author Vinay.Gaonkar
	  * @param xpath
	  * @return
	  */
	/* public List<String> getAllElementsToList(String xpath) {
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
	        }*/
	        
	        
	 /**
	  * This method is used ClickByText Present in DropDownOption
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
	        
	        
	        /**
	         * This method is used ClickByValue Present in DropDownOption
	         * @param element
	         * @param value
	         * @author Vinay.Gaonkar
	         */
	        
	    		public synchronized void selectByvalue(WebElement element, String value) {
		    		try {
		    			Select selecvalue=new Select(element);
		    			selecvalue.selectByValue(value);
		    		} catch (Exception e) {
		    			Assert.fail("Unable to select  " + value);
		    		}
		    		}
	    		
	    		
	    		/**
	    		 * This method is used ClickByIndex Present in DropDownOption
	    		 * @param element
	    		 * @param index
	    		 * @author Vinay.Gaonkar
	    		 */
		    		
	    		public synchronized void selectByindex(WebElement element, int index) {
			    		try {
			    			Select selecvalue=new Select(element);
			    			selecvalue.selectByIndex(index);
			    		} catch (Exception e) {
			    			Assert.fail("Unable to select  " + index);
			    		}	}
	    		
			    		
	    		/**
	    		 * This is method is clickCheckbox and also verify the box is selected or not
	    		 * @param element
	    		 * @param elementname
	    		 * @author Pavan.Joshi
	    		 */
			    		public void clickCheckBox(WebElement element, String elementname) {

			    			if (element.isSelected()) {
			                  Assert.assertTrue(elementname, true);;
			    			} else {
			    				element.click();
			    			}
                              
			    			}
			    			
			    		
			    		/**
			    		 * This method is used to Scroll till element address find
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
			    				
			    			
			    			
			    			
			    			/**
			    			 * This method is used to Options present in dropdown
			    			 * @param element
			    			 * @author Vinay.Gaonkar
			    			 */
			    				
			    				public void togetoptionspresentindropdown(WebElement element) {
			    					
			    					Select se= new Select(element);
			    					List<WebElement> options = se.getOptions();
			    					System.out.println("Options present in" + element + "dropdown");
									for(WebElement b:options) {
			    						System.out.println(b.getText());
			    					
			    				}}
			    				
			    				
			    				/**
			    				 * This method is used to Click Ok Button from AlertPopup
			    				 * @author Pavan.Joshi
			    				 */
									public void Alertpopupclickokbutton() {
										driver.switchTo().alert().accept();
									}
									
									
									/**
									 * This method is used to Click Cancel Button from AlertPopup
									 * @author Pavan.Joshi
									 */
									public void AlertpopupclickCancelbutton() {
										driver.switchTo().alert().dismiss();
									}
			    				
						public void clickdatefromcalenderpopup(WebElement calenderbutton,WebElement Monthyear,String monthyear,WebElement forwardbutton) {
							calenderbutton.click();
							while(true) 
							{
								String text = Monthyear.getText();
								if(text.equals(monthyear)) {
									break;
								}
								else 
								{
									forwardbutton.click();
								}
							}
							//day.click();
						}
 				}

       













