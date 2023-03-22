package WebdriverCommands;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchingWindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Windows.html");
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/a[1]/button[1]")).click();
		//System.out.println(driver.getTitle());
		Set <String>s=driver.getWindowHandles();
		for(String i:s)
		{
			String title=driver.switchTo().window(i).getTitle();
			System.out.println(title);	
			if(title.contains("Selenium"))
			{
				driver.close();			}
		}
	}

}
