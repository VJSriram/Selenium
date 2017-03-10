package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CustomizedXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 
		 Syntax = //tagname[@attribute=”value”]
		 * //input[@name=”email”]	

Input = * (* represent inputtag --- Universal/Global element)
//*[@name=”email”]  ---- For customize xpath we use Name attribute where as firebug/firepath uses ID.
.//*[@id='email']  --- Xpath by firepath 

*/
		
		//Customized Xpath
		WebDriver driver=new FirefoxDriver();
		driver.get("http://facebook.com");
		driver.findElement(By.xpath("//*[@name='email']")).sendKeys("vijaysriram");
		
	}

}
