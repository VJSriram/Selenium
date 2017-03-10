package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Staticdrowndown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// Static dropdown using Chrome Browser
		System.setProperty("webderiver.chrome.driver", "C:\\Chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://spicejet.com/");
		
		// Using Select class methods
		/*Select dropdown=new Select(driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_ddl_Adult']")));
		dropdown.selectByIndex(4);
		dropdown.selectByVisibleText("9 Adults");
		dropdown.selectByValue("7"); */
		
		// Handling Checkbox
		System.out.println(driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_chk_IndArm']")).isSelected());
		
		driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_chk_IndArm']")).click();
		System.out.println(driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_chk_IndArm']")).isSelected());
		
		driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_chk_IndArm']")).click();
		
		System.out.println(driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_chk_IndArm']")).isSelected());
		
		

	}

}
