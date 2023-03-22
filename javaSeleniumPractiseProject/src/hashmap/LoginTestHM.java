package hashmap;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTestHM {
static HashMap<String,String> loginData()
{
	HashMap<String,String> hm=new HashMap<String,String>();
	hm.put("x", "mercury@mercury");
	hm.put("y", "mercury1@mercury1");
	hm.put("z", "mercury2@mercury2");
	return hm;
}
	
	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://accounts.lambdatest.com/login");
		String credentials=loginData().get("x");
		String arr[]=credentials.split("@");
		driver.findElement(By.name("email")).sendKeys(arr[0]);
		driver.findElement(By.name("password")).sendKeys(arr[1]);
		driver.findElement(By.id("login-button")).click();
		if(driver.getTitle().equals("end of flight"))
		{
			System.out.println("passed");
		}
		else
		{
			System.out.println("passed");	
		}
		driver.close();
	}

}
