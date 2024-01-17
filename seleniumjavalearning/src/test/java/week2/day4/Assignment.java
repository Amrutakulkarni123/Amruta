package week2.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//create object for the chromedriver
		ChromeDriver driver =new ChromeDriver();
		
		//load the application in the browser
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		//maximize the application
		driver.manage().window().maximize();
		
		//identifying the elements
		driver.findElement(By.id("username")).sendKeys("DemoCSR");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.className("inputBox")).sendKeys("abcd");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("abcd");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("abcd");
		driver.findElement(By.className("smallSubmit")).click();
		
		driver.quit();

	}

}
