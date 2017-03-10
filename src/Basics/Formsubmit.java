package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Formsubmit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Handling Dynamic Dropdowns
		System.setProperty("WebDriver.Chrome.Driver", "C:\\Chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://spicejet.com/");
		
		driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
		driver.findElement(By.xpath("//a[@value='HYD']")).click();
		
		driver.findElement(By.xpath("//a[@value='GOI']")).click();
		
		// Handling Static Dropdown
		// If you want to access any method in class, create object for that class
		// By using (Object.method) property
		
		Select dropdown=new Select(driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_ddl_Adult']")));
		dropdown.selectByIndex(4);

	}

}
