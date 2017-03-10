package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FormMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Handling visibility and non-visibility of radio buttons
		System.setProperty("Webdriver.chrome.driver", "C:\\Chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		// Is displayed method is used when particular object is in code based but it is in visible mode or not
		driver.get("http://us.makemytrip.com/flights/");
		System.out.println("Before clicking on multi city Radio Button");
		System.out.println(driver.findElement(By.xpath(".//*[@id='top_content']/div[2]/div[2]/div[2]/div[1]/div[7]/span/span[4]/a")).isDisplayed());
		//driver.findElement(By.xpath(".//*[@id='trip_type']/label[3]")).click();
		
		// Is Enabled method
		//driver.findElement(By.xpath(".//*[@id='trip_type']/label[3]")).isEnabled();
		System.out.println("After clicking on multi city Radio Button");
		driver.findElement(By.xpath(".//*[@id='top_content']/div[2]/div[2]/div[2]/div[1]/div[7]/span/span[2]/a/span[3]")).click();
		driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div[1]/table/tbody/tr[5]/td[2]/a")).click();
		
		
		
		Select dropdown=new Select(driver.findElement(By.xpath(".//*[@id='top_content']/div[2]/div[2]/div[2]/div[1]/div[7]/div[1]/div[2]/div[4]/div[5]/span[2]/span/a")));
		dropdown.selectByIndex(3);
		
		
		//System.out.println(driver.findElement(By.xpath(".//*[@id='top_content']/div[2]/div[2]/div[2]/div[1]/div[7]/span/span[4]/a")).isDisplayed());
		// Using gettext method
		//System.out.println(driver.findElement(By.xpath("html/body/div[1]/div[4]/div[2]/div/div/div/div[2]/h2[1]")).getText());
		
		// If you want to validate the object which is present in web page or code based then you have to use .size
		int count=driver.findElements(By.xpath(".//*[@id='ip_type']/label[3]")).size();
		
		if (count==0)
		{
			System.out.println("Verified");
		}

	}

}
