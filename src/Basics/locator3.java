package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class locator3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Finding element by Id, name, xpath
		WebDriver driver=new FirefoxDriver();
		driver.get("http://facebook.com");
		driver.findElement(By.id("email")).sendKeys("sreeramvijay120");
		driver.findElement(By.name("pass")).sendKeys("12345678");
		driver.findElement(By.xpath(".//*[@id='u_0_p']")).click();
		driver.close();

	}

}
