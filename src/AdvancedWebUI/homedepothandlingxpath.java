package AdvancedWebUI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class homedepothandlingxpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("Webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.get("http://www.homedepot.com/");
		
		driver.findElement(By.xpath(".//*[@id='headerSearch']")).sendKeys("Hammer");
		driver.findElement(By.xpath(".//*[@id='headerSearchButton']")).click();
		
		//String str = driver.findElement(By.xpath(".//*[@id='products']/div/div[2]/div/div[4]")).getText();
		
		//driver.findElement(By.xpath(".//*[@id='products']/div/div[2]/div/div[9]/span ")).getText();
		//driver.findElement(By.xpath(".//*[@id='products']/div/div[2]/div/div[10]/div ")).getText();
		//driver.findElement(By.xpath(".//*[@id='products']/div/div[2]/div/div[11]/div/a/span")).click();
	}

}
