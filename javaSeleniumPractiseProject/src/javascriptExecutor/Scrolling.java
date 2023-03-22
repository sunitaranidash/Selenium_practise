package javascriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.countries-ofthe-world.com/flags-of-the-world.html");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//1.scrolling down by pixel
		//js.executeScript("window.scrollBy(0,2000)", " ");
		Thread.sleep(2000);
		//scrolling page by visibility of the element
		//WebElement flag=driver.findElement(By.xpath("//img[@alt='Flag of India']"));
		//js.executeScript("arguments[0].scrollIntoView();", flag);
		//scroll down till bottom
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(2000);
		
		driver.close();
	}

}
