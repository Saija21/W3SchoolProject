package testCase;

import org.testng.annotations.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.asserts.SoftAssert;

import pages.HomePage;
import pages.LoginPage;
import pages.MyAccountPage;
import testBase.WebTestBase;

public class TestCases extends WebTestBase{ 
	MyAccountPage myAccountPage; 	
	HomePage homePage; 	
	LoginPage loginPage; 	
//Loading the config file     
	public TestCases()
	{         
	super();    
	}                	
   @BeforeMethod 	
   public void BeforeMethod() 	{ 		
	   //Loading the driver file and eatablishing the connection ,loading the url 	
	   initialization(); 	
	   myAccountPage = new MyAccountPage();	 	 
	   homePage = new HomePage();      
	   loginPage = new LoginPage();       
	   }   
   @Test 
   public void verifyLoginWithValidCredential(){      
	   SoftAssert softAssert = new SoftAssert();      
	   homePage.userSearchClick();
	   
	   loginPage.login(prop.getProperty("mobile"), prop.getProperty("password"));      
	         
	   softAssert.assertAll();
	   }
   @Test  
   public void verifySearchBar(){      
	   SoftAssert softAssert = new SoftAssert();     
	   myAccountPage.search();          
	   softAssert.assertAll();  
	   }  
   @Test 
   public void verifyMouseHover(){      
	   SoftAssert softAssert = new SoftAssert();      
	   myAccountPage.mouseHover();      
	   softAssert.assertAll();
	   } 
   @Test  
   public void verifyScrollup(){     
		
	    JavascriptExecutor javascriptExecutor=(JavascriptExecutor)driver;
	    javascriptExecutor.executeScript("window.scrollBy(0,2000)");
	}
  @Test  
  public void verifyScrollDown(){     

		    JavascriptExecutor javascriptExecutor=(JavascriptExecutor)driver;
		    javascriptExecutor.executeScript("window.scrollBy(0,2000)");
		}
   
   @Test  public void verifyGetWindowHandle(){      
	   SoftAssert softAssert = new SoftAssert();     
	   myAccountPage.windowHandle();     
	   softAssert.assertAll(); 
	   }  
  
   @Test  public void verifyCookiesHandle(){     
	   SoftAssert softAssert = new SoftAssert();     
	   myAccountPage.getCookiesHandle();      
       softAssert.assertAll();  
       }
       
   
  
   @AfterMethod  public void afterMethod(){   
	driver.close();  
	}
}

