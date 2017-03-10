package AdvancedWebUI;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingActions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// All the mouse operations can be done using Actions() method.
		System.setProperty("Webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.amazon.in/");
		Actions abc=new Actions(driver);
		WebElement element=driver.findElement(By.xpath(".//*[@id='nav-link-yourAccount']"));
		abc.moveToElement(element).build().perform();
		WebElement xyz=driver.findElement(By.xpath(".//*[@id='twotabsearchtextbox']"));
		abc.keyDown(Keys.SHIFT).moveToElement(xyz).sendKeys("iphone prices").build().perform();
		// contextClick() method is used to rightclick
		abc.contextClick(xyz).build().perform();
		//abc.doubleClick(xyz).build().perform();
		
	}

}
