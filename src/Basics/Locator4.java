package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Locator4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// Finding element by Linktext and partialLinkText
		WebDriver driver=new FirefoxDriver();
		driver.get("http://facebook.com");
		driver.findElement(By.id("email")).sendKeys("sreeramvijay120");
		driver.findElement(By.name("pass")).sendKeys("0101010101");
		driver.findElement(By.linkText("Forgot account?")).click();
		driver.findElement(By.partialLinkText("Forgot")).click();
		driver.findElement(By.xpath(".//*[@id='u_0_p']")).click();
	}

}
