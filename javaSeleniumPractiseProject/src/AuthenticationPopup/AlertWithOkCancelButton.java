package AuthenticationPopup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertWithOkCancelButton {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		//Alert with Ok and Cancel button
		driver.findElement(By.xpath("//a[normalize-space()='Alert with OK & Cancel']")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		String expectedOk="You pressed Ok";
		
		driver.switchTo().alert().accept();
		String actualText=driver.findElement(By.xpath("//*[@id=\"demo\"]")).getText();
		
		if(expectedOk.equals(actualText)==true)
		{
			System.out.println("Test is passed");
		}
		String expectedCancel="You Pressed Cancel";
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		
		driver.switchTo().alert().dismiss();
		String actualTextCancel=driver.findElement(By.xpath("//*[@id=\"demo\"]")).getText();
		if(expectedCancel.equals(actualTextCancel)==true)
		{
			System.out.println("Test is passed");
		}
	}

}
