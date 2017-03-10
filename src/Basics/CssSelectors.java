package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CssSelectors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// ( Syntax = Tagname[Attribute='value'] or [Attribute='vlaue'])
	
		
		// Finding element using CSSSelectors and Xpath
		WebDriver driver=new FirefoxDriver();
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.cssSelector("[id='username']")).sendKeys("Jaisairam");
		driver.findElement(By.cssSelector("[id='password']")).sendKeys("Sriram");
		driver.findElement(By.xpath(".//*[@id='Login']")).click();
		

	}

}
