package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Locator2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Finding element by using xpath
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.tutorialspoint.com/");
		driver.findElement(By.xpath("html/body/div[3]/div[1]/div/div/div/div/span[1]/a/img")).click();

	}

}
