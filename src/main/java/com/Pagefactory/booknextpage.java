package com.Pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class booknextpage {

	WebDriver driver;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div/div[3]/div[3]/div[2]/ul[1]/li[2]/span/a/span")
	WebElement attitudebook ;
	
	@FindBy(xpath="//*[@id='leftNavContainer']/ul[1]/div/li[1]/span/ul/div/li[2]/span/a/span")
	WebElement personaldevclick ;
	
	public booknextpage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
		
	}
	
	public void clickonpersonal(){
		personaldevclick.click();
	
	}
	public void clickonbooks(){
		personaldevclick.click();
	
	}
	public void books(){
		this.clickonpersonal();
		this.clickonbooks();
	}
	

	
}
