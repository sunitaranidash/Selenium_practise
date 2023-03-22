package seleniumWebDriver.basictests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		String exptitle=driver.getTitle();
		String acttitle="Log into Facebook";
		if(exptitle.equals(acttitle))
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
