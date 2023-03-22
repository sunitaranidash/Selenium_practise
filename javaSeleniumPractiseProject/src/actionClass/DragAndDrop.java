package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		//System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		//WebDriver driver=new FirefoxDriver();
		
		
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
       
        WebElement source=driver.findElement(By.id("box1"));
        Actions act=new Actions(driver);
        WebElement target=driver.findElement(By.id("box103"));
       // act.clickAndHold(source).moveToElement(target).release().build().perform();
        act.dragAndDrop(source, target).build().perform();
        driver.close();
	}

}
