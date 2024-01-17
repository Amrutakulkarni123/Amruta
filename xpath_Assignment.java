package week3.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium_Assignment {

	public static void main(String[] args) throws InterruptedException {
     
		ChromeDriver driver =new ChromeDriver();
		
		//load the application in the browser
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		//maximize the application
		driver.manage().window().maximize();
		
		//identifying the elements
		driver.findElement(By.xpath("//input[@class='inputLogin']")).sendKeys("DemoCSR");
		
		//NoSuchelement
		driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[contains(@class,'ecor')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Create Lead')]")).click();
		driver.findElement(By.xpath("//input[@class=\"inputBox\"]")).sendKeys("abcd");
		driver.findElement(By.xpath("//input[contains(@id,'fir')]")).sendKeys("abcd");
		driver.findElement(By.xpath("//input[contains(@id,'las')]")).sendKeys("abcd");
		driver.findElement(By.xpath("//input[contains(@name,'sub')]")).click();
		
		driver.close();
		
	}

}
