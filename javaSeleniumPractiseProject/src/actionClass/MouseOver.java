package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MouseOver {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		//login
		
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		driver.findElement(By.xpath("//a[normalize-space()='']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='User Management']")).click();
		driver.findElement(By.xpath("//ul[@class='oxd-dropdown-menu']//li")).click();
		int rows=driver.findElements(By.xpath("//div[@role='table']")).size();
		int count=0;
		for(int i=1;i<=rows;i++)
		{String status=driver.findElement(By.xpath("//div[@role='rowgroup']//div[1]//div[1]//div[5]//div[1]")).getText();
		if(status.equals("Enabled")) {
			count++;
		}
		}
		System.out.println("number of emp's enabled  :"+count);
		System.out.println("number of emp's disabled :"+(rows-count));
		

	}

}
