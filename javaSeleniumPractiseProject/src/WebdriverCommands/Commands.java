package WebdriverCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Commands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Windows.html");
		System.out.println("Url of the page"+ driver.getCurrentUrl());
		driver.navigate().to("https://google.com");
		System.out.println("Url of the page"+ driver.getCurrentUrl());
		driver.navigate().back();
		System.out.println("Url of the page"+ driver.getCurrentUrl());
		driver.navigate().forward();
		System.out.println("Url of the page"+ driver.getCurrentUrl());
		/*
		 * driver.findElement(By.xpath("//*[@id=\"Tabbed\"]/a/button")).click();
		 * 
		 * System.out.println("Page title is:"+driver.getTitle()); //driver.close();
		 */
		driver.quit();
	}

}
