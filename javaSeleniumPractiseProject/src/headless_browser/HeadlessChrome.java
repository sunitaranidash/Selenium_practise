package headless_browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessChrome {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
ChromeOptions options=new ChromeOptions();
//options.setHeadless(true);
options.addArguments("--headless");
WebDriver driver=new ChromeDriver(options);
driver.get("http://demo.nopcommerce.com/");
System.out.println("Title of the page is : "+ driver.getTitle());
System.out.println("Current url of the page is : "+ driver.getCurrentUrl());
	}

}
