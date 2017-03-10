package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radiobutton1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("Webdriver.Chrome.driver", "C:\\Chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.echoecho.com/htmlforms10.htm");
		//driver.findElements(By.xpath("//input[@value='Butter']")).click();
		int count =driver.findElements(By.xpath("//input[@name='group1']")).size();
		
		for(int i=0;i<count;i++)
		{
			//driver.findElements(By.xpath("//input[@name='group1']")).get(i).click();
			//System.out.println(driver.findElements(By.xpath("//input[@name='group1']")).get(i).getAttribute("value"));
			
			// Handling the radiobuttons Dynamically
			String text=driver.findElements(By.xpath("//input[@name='group1']")).get(i).getAttribute("value");
			if(text.equals("Cheese"))
			{
				driver.findElements(By.xpath("//input[@name='group1']")).get(i).click();
			}
			
		}

	}

}
