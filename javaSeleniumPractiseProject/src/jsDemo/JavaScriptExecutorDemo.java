package jsDemo;

import java.io.File;

//import java.io.File;


import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class JavaScriptExecutorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://twoplugs.com/");
		WebElement joinfree=driver.findElement(By.xpath("//body/div[@class='wrapper']/header/div[@class='container']/ul[@class='control-bar']/li/a[@class='btn green']/span[1]"));
		//flashing
		//JavaScriptUtil.flash(joinfree, driver);
		//drawing border and screenshot
		JavaScriptUtil.drawBorder(joinfree, driver);
		/*File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File trg=new File("c://screenshot/twoplugs.png");
		FileUtils.copyFile(src,trg);*/
		String title=JavaScriptUtil.getTitleByJS(driver);
		System.out.println(title);
		//click on element
		WebElement loginbtn=driver.findElement(By.xpath("//body/div[@class='wrapper']/header/div[@class='container']/ul[@class='control-bar']/li/a[@class='btn border']/span[1]"));
		JavaScriptUtil.clickElementByJS(loginbtn, driver);
		//generate alert
		JavaScriptUtil.generateAlert(driver, "You clicked on login button...");
		
		
	}
	

}
