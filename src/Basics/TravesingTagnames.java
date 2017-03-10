package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TravesingTagnames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//How to write customized Xpath by using Traversing TagNames
		WebDriver driver=new FirefoxDriver();
		driver.get("http://facebook.com");
		driver.findElement(By.xpath("//*[@id='reg_form_box']/div[1]/div[1]/div[1]/div/div/input")).sendKeys("Aasritha Sriram");

	}

}
