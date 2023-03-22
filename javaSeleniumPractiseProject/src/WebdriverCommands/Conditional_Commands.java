package WebdriverCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Conditional_Commands {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		
		WebDriver driver= new ChromeDriver();
		
		
		/*
		 * boolean emailtext=
		 * driver.findElement(By.xpath("//*[@id=\"Email\"]")).isEnabled(); boolean
		 * pwdtext =driver.findElement(By.xpath("//*[@id=\"Password\"]")).isEnabled();
		 * System.out.println(emailtext); System.out.println(pwdtext);
		 */
		/*
		 * driver.get("https://admin-demo.nopcommerce.com/login"); WebElement
		 * email=driver.findElement(By.xpath("//*[@id=\"Email\"]")); WebElement
		 * pwd=driver.findElement(By.xpath("//*[@id=\"Password\"]"));
		 * if(email.isEnabled()&&pwd.isEnabled()) {
		 * email.sendKeys("admin@yourstore.com"); pwd.sendKeys("admin"); } else {
		 * System.out.println("Text box is not enabled"); } 
		 */
		driver.get("https://login.yahoo.com/");
		WebElement username=driver.findElement(By.xpath("//*[@id=\"login-username\"]"));
		WebElement checkbox=driver.findElement(By.xpath("//*[@id=\"login-username-form\"]/div[3]/div[1]/span/label[1]"));
		System.out.println("Checkbox is selected  " + checkbox.isSelected());
		System.out.println("username is displayed  "+ username.isDisplayed());
		if(checkbox.isSelected()==false)
		{
			checkbox.click();
			driver.wait(2);
			System.out.println("Checkbox is selected  " + checkbox.isSelected());
		}
		
		
		driver.quit();
	}

}
