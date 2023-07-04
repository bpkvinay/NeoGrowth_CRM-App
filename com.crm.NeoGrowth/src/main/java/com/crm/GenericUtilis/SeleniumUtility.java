package com.crm.GenericUtilis;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
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
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class SeleniumUtility extends Driver {
	/**
	 * @author Pavan.Joshi
	 * @return
	 */
	
	public JavascriptExecutor jsExecutor=(JavascriptExecutor)driver;
	public static RequestSpecification Requestspec;
	
	     
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
			    				
  
									public void clickdatefromcalenderpopup(WebElement calenderbutton,WebElement Monthyear,String monthyear,WebElement forwardbutton1,String h) {
										calenderbutton.click();
										while(true) 
										{
											String text = Monthyear.getText();
											if(text.equalsIgnoreCase(monthyear)) {
												break;
											}
											else 
											{
												forwardbutton1.click();
												{
										}
											}}
										WebElement day = driver.findElement(By.xpath("//a[normalize-space()="+h+"]"));
										day.click();
											}
										
										/**
										 * @author Pavan.Joshi
										 * This method Used to handle the windows and child windows
										 * 
										 */
										public void switchTochildwindowHandle() {
										String parent=driver.getWindowHandle();
										Set<String>s=driver.getWindowHandles();
										  Iterator<String> I1= s.iterator();{
										 while(I1.hasNext())
										{
										String child_window=I1.next();
										if(!parent.equals(child_window))
										{
										driver.switchTo().window(child_window);

										//driver.manage().window().maximize();

										driver.manage().window().maximize();

										System.out.println(driver.switchTo().window(child_window).getTitle());
		                               // driver.close();
		                                
										}
										//driver.switchTo().window(parent);
										}

										  }		

										  }

										 


			public void clickdatefromCalenderpopup(WebElement calenderbutton,WebElement Monthyear,String monthyear,WebElement previousbtn,WebElement forwardbutton1,String d) {
				calenderbutton.click();
				WebElement day = driver.findElement(By.xpath("//a[normalize-space()="+d+"]"));
				String Text = Monthyear.getText();
					
				  while(true)  
					if(Text==monthyear) {
						day.click();
						break;
					}else if((Text.compareTo(monthyear))<0) {
						previousbtn.click();
						day.click();
						break;
						
					}else if(Text.compareTo(monthyear)>0) {
						forwardbutton1.click();
						day.click();
						break;
					}
				
			}
				


										 public void swithparentwindow() {
											  String parent = driver.getWindowHandle();
											  driver.switchTo().window(parent);
										  }
										 
										 
										 
								public void getwindowtitle() {
									String parent = driver.getWindowHandle();
							Set<String> ab = driver.getWindowHandles();
									System.out.println(ab);
									//return ab;
									//Iterator<String> I1 = ab.iterator();
									for(String gh:ab) {
							          if(!parent.equals(gh)) {
							        	  driver.switchTo().window(gh);
							        	  
							          }
							          
							          
							          
									}
								}	
			
								
								/**
								 * This method is used to log aswell as to hit the url and contenttype JSON
								 * @return
								 * @throws IOException 
								 */
		public RequestSpecification requestspecifications() throws IOException {
			
			if (Requestspec==null) {
			PrintStream Log= new PrintStream(new FileOutputStream("log.text"));
			Requestspec = new RequestSpecBuilder().setBaseUri(readConfig("api"))
		              .addFilter(RequestLoggingFilter.logRequestTo(Log))
		              .addFilter(ResponseLoggingFilter.logResponseTo(Log))
		    		 .setContentType(ContentType.JSON).build();
		     return Requestspec;
		     
		     
								}
			return Requestspec;
										 
										 
										 
		}				 
		
		public String getJsonPath(Response response,String key)
		{
			  String resp=response.asString();
			JsonPath   js = new JsonPath(resp);
			return js.get(key).toString();
		}

										 
										 
										 
									}
 				



       















