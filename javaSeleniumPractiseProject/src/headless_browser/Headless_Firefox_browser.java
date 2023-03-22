package headless_browser;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Headless_Firefox_browser {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
	FirefoxOptions options=new FirefoxOptions();
		options.setHeadless(true);
	//options.addArguments("--headless");
	WebDriver driver=new FirefoxDriver(options);
	driver.get("http://demo.nopcommerce.com/");
	System.out.println("Title of the page is : "+ driver.getTitle());
	System.out.println("Current url of the page is : "+ driver.getCurrentUrl());
		}
	}


