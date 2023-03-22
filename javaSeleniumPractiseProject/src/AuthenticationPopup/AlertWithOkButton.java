package AuthenticationPopup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertWithOkButton {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
WebDriver driver= new ChromeDriver();
driver.get("https://demo.automationtesting.in/Alerts.html");
//Alert box with ok button example
driver.findElement(By.xpath("//a[normalize-space()='Alert with OK']")).click();
driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
System.out.println(driver.switchTo().alert().getText());
driver.switchTo().alert().accept();
	}

}
