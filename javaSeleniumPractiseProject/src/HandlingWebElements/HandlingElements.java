package HandlingWebElements;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;



public class HandlingElements {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//body/section[@id='section']/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/input[1]")).sendKeys("Sunita");
		driver.findElement(By.xpath("//body/section[@id='section']/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/input[1]")).sendKeys("Dash");
		driver.findElement(By.xpath("//body/section[@id='section']/div[1]/div[1]/div[2]/form[1]/div[2]/div[1]/textarea[1]")).sendKeys("Battle");
		driver.findElement(By.xpath("//body/section[@id='section']/div[1]/div[1]/div[2]/form[1]/div[3]/div[1]/input[1]")).sendKeys("ssh@gmail.com");
		driver.findElement(By.xpath("//body/section[@id='section']/div[1]/div[1]/div[2]/form[1]/div[4]/div[1]/input[1]")).sendKeys("1238993879");
		driver.findElement(By.xpath("//body/section[@id='section']/div[1]/div[1]/div[2]/form[1]/div[5]/div[1]/label[2]/input[1]")).click();
		driver.findElement(By.id("checkbox1")).click();
		driver.findElement(By.id("checkbox2")).click();
			   
		WebElement elang=driver.findElement(By.xpath("//*[@id=\"msdd\"]"));
		JavascriptExecutor jse1 = (JavascriptExecutor)driver;
		jse1.executeScript("arguments[0].scrollIntoView()",elang);
		elang.click();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		List<WebElement> langlist=driver.findElements(By.xpath("//ul[@class='ui-autocomplete ui-front ui-menu ui-widget ui-widget-content ui-corner-all']/li"));
		System.out.println("Number of options :"+langlist.size());
		for(WebElement lang:langlist)
		{
			//System.out.println("Values " + lang.getSize());
			if(lang.getText().contentEquals("Arabic"))
			{
				lang.click();
				break;
			}
		
		}
		 WebElement ele=driver.findElement(By.xpath("//select[@id='Skills']"));
			Select Skills=new Select(ele);
		System.out.println("Number of options:  "+	Skills.getOptions().size());
			Skills.selectByValue("Analytics");
		
		WebElement myelement = driver.findElement(By.xpath("//*[@id=\"country\"]"));
		Select countrylist=new Select(myelement);
		System.out.println("Number of country:  "+	countrylist.getOptions().size());
		countrylist.selectByValue("India");
			
		
	WebElement year=driver.findElement(By.xpath("//select[@id='yearbox']"));
	Select yearlist=new Select(year);
	yearlist.selectByValue("1925");
	
	WebElement month=driver.findElement(By.xpath("//select[@placeholder='Month']"));
	Select monthlist=new Select(month);
	monthlist.selectByValue("June");
	
	WebElement day=driver.findElement(By.xpath("//select[@id='daybox']"));
	Select daylist=new Select(day);
	daylist.selectByValue("5");
	
	driver.findElement(By.xpath("//input[@id='firstpassword']")).sendKeys("password");
	driver.findElement(By.xpath("//input[@id='secondpassword']")).sendKeys("password");
	
	driver.findElement(By.xpath("//button[@id='Button1']")).click();
	
	
	
	}
}
	      

