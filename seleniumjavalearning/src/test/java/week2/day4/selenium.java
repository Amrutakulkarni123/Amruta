package week2.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Instantiate the browserdriver 
				//shortcut -->ctrl shift o -->import the packages of the classes
				ChromeDriver driver =new ChromeDriver();
				//load the application in the browser
				driver.get("http://leaftaps.com/opentaps/control/main");
				//maximize the application
				driver.manage().window().maximize();
				//identifying the elements
				driver.findElement(By.id("username")).sendKeys("DemoCSR");
				//NoSuchelement
				driver.findElement(By.id("password")).sendKeys("crmsfa");
				driver.findElement(By.className("decorativeSubmit")).click();

		
	}

}
