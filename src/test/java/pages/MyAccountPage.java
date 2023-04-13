package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.WebTestBase;
import util.Utility;

public class MyAccountPage extends WebTestBase { 	
	@FindBy(xpath = "//h1[text()='My Account']")     
	WebElement accountTitle;     
	@FindBy(id = "search2")    
	WebElement searchTextBox;     
	@FindBy(id = "learntocode_searchbtn")    
	WebElement searchBtn;      
	@FindBy(xpath = "//div[@class='search-summary search-heading']")     
	WebElement searchTitle;      
	@FindBy(xpath = "//select[@class='styled']")    
	WebElement dropDown;      
	@FindBy(xpath = "//*[@id=\"main\"]/div[1]/div/a[3]")     
	WebElement hover;  
	@FindBy(xpath = "//*[@id=\"main\"]/footer/div[2]/a[2]")     
	WebElement linkedInOption;      	
	public MyAccountPage(){         
		PageFactory.initElements(driver, this);     
		} 	
	public String getTextOFMYAccountPage(){         
			return accountTitle.getText();     
			} 
	
	public void search(){       
		searchTextBox.click();        
		searchTextBox.sendKeys("the java project");       
		searchTextBox.sendKeys(Keys.ENTER);         
		searchBtn.click();    
		} 
	public void selectDropDown(String term, String value){        
		dropDown.click();        
		Utility.selectValue(dropDown,term,value);     
		}     
	public void mouseHover(){      
		Utility.mouseHover(driver,hover);    
		}  
	
	public String getTextOfSearch(){        
		return searchTitle.getText();    
		}     
	public void scrollDownMethod() {         
		Utility.scrollDownByElement(driver, linkedInOption);         
		linkedInOption.click();     
		}     
	public void windowHandle(){         
		Utility.scrollDownByElement(driver, linkedInOption);       
		linkedInOption.click();        
		Utility.switchToWindows(driver);     
		//accountTitle
		}      
	public void getCookiesHandle(){        
		Utility.getCookies();     
		} 
	}