package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radiobuttons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Handling RadioButtons using Chrome Browser
		System.setProperty("Webdriver.Chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.echoecho.com/htmlforms10.htm");
		driver.findElement(By.xpath("//input[@value='Butter']")).click();
		 // Selecting the total group of radiobuttons using (FindElements)
		System.out.println(driver.findElements(By.xpath("//input[@name='group1']")).size()); 		

	}

}
