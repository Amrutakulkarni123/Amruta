package week2.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver =new ChromeDriver();
		
		//load the application in the browser
		driver.get("https://www.leafground.com/select.xhtml");
		
		//maximize the application
		driver.manage().window().maximize();
		
		WebElement dropdown=driver.findElement(By.className("ui-selectonemenu"));
		
		Select s = new Select(dropdown);
		
		//s.selectByValue("");
		s.selectByVisibleText("Playwright");
		s.selectByIndex(5);
		
		

	}

}
