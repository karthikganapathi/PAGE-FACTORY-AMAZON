package com.Pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class amazon {

	

	WebDriver driver;
	
	@FindBy(id="twotabsearchtextbox")
	WebElement text ;
	
	@FindBy(xpath="/html/body/div[1]/header/div/div[1]/div[3]/div/form/div[2]/div/input")
	WebElement search;
	
	@FindBy(id="s-result-count")
	WebElement Titlepage;
	
	
	public amazon(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	

	public void Entertext(String value){
		
		text.sendKeys(value);
		
	}

	public void Search(){
		search.click();
		
	}


	public String Titlepage(){
		return Titlepage.getText();
	}

	public void sedkeys(String value){
		this.Entertext(value);
		this.Search();
		System.out.println(this.Titlepage());
	}
}
