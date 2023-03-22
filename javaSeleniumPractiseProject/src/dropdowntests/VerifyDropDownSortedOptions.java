package dropdowntests;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class VerifyDropDownSortedOptions {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		WebElement element=driver.findElement(By.id("animals"));
		Select se = new Select(element);
		List originalList=new ArrayList();
		List tempList=new ArrayList();
		List <WebElement>options=se.getOptions();
		for(WebElement e:options)
		{
			originalList.add(e.getText());
			tempList.add(e.getText());
		}
		System.out.println("Before sorting original List :"+originalList);
		
		//tempList=originalList;
		System.out.println("Before sorting tempList:  "+tempList);
		Collections.sort(tempList);
		
		System.out.println("After Sorting original List : " + originalList);
		System.out.println("After sorting tempList : "+tempList);
		if(originalList==tempList)
		{
			System.out.println("DropDown is sorted");
		}
		else
		{
			System.out.println("DropDown is not sorted");
		}
	}

}
