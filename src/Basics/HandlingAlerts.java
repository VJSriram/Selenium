package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlerts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("Webdriver.Chrome.driver", "C:\\Chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.echoecho.com/javascript4.htm");
		driver.findElement(By.xpath("//input[@name='B3']")).click();
		System.out.println(driver.switchTo().alert().getText()); // To get the text form alert box
		driver.switchTo().alert().sendKeys("echoecho");
	    driver.switchTo().alert().accept(); // Accept Method = Yes, OK, Done
	    //driver.switchTo().alert().dismiss(); // Dismiss Method = Cancel

	}

}
