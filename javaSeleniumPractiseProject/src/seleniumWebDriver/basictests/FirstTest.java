package seleniumWebDriver.basictests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
WebDriver driver=new ChromeDriver();
//ChromeDriver driver=new ChromeDriver();
driver.get("http://admin-demo.nopcommerce.com/login");
WebElement username=driver.findElement(By.name("Email"));
username.clear();
username.sendKeys("admin@yourstore.com");
WebElement pwd=driver.findElement(By.name("Password"));
pwd.clear();
pwd.sendKeys("admin");
driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/div[2]/div[1]/div/form/div[3]/button")).click();
String expttitle="Dashboard / nopCommerce administration";
String acttitle=driver.getTitle();
if(expttitle.equals(acttitle))
{
	System.out.println("Test is passed");
}
else
{
	System.out.println("Test is failed");
	
}
driver.close();
	}

}
