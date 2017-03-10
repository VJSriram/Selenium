package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CustomizeXpathgmail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://gmail.com");
		//driver.findElement(By.xpath("//*[@name=’email’]")).sendKeys("sriram@gmail.com");
		driver.findElement(By.xpath("//*[@id='link-signup']/a")).click();
		driver.findElement(By.xpath(".//*[@id='name-form-element']/fieldset/legend/label/strong/input/span")).click();

	}

}
