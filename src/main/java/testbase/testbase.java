package testbase;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class testbase {
	
	WebDriver driver;
	public Properties OR;
	public File f;
	public FileInputStream input;
	
	public void WebBrowser(){
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\RAKESH\\Desktop\\New folder\\Testing\\jars\\geckodriver-v0.19.1-win64\\geckodriver.exe");
		  driver = new FirefoxDriver();
		 
		driver.get("https://www.amazon.in/");

	}
	

	public void loadproperties() throws IOException{
		
		OR=new Properties();
		File f=new File("C:\\Users\\RAKESH\\Desktop\\Testing\\Pagefactory\\src\\main\\java\\properties\\OR.properties");
		FileInputStream input=new FileInputStream(f);
		OR.load(input);
		System.out.println(OR.getProperty("website"));
	}
	
	public  String screenshot(String imagename) throws IOException{
		
		if(imagename.equals("")){
			imagename="blank";
		}
			
		
		 File image = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 
		 Calendar cal=Calendar.getInstance();
		 SimpleDateFormat format=new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss");
		 
		 String imagepath="C:\\Users\\RAKESH\\Desktop\\Testing\\FRAMEWORK\\src\\main\\java\\screenshot/";
		 String actualpath=imagepath +imagename+ "_" +format.format(cal.getTime())+".png";
		File destFile=new File(actualpath);
		 FileUtils.copyFile(image, destFile);
		 return actualpath ;
		 
	}
	
	public static void main(String[] args) throws IOException {
		
		testbase tb=new testbase();
		tb.WebBrowser();
		tb.loadproperties();
		
	}

}
