package week3.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Edit_lead_assig {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
ChromeDriver driver =new ChromeDriver();
		
		//load the application in the browser
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		//maximize the application
		driver.manage().window().maximize();
		
		//identifying the elements
		driver.findElement(By.xpath("//input[@class='inputLogin']")).sendKeys("DemoCSR");
		
		driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("crmsfa");
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[contains(@class,'ecor')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Create Lead')]")).click();
		driver.findElement(By.xpath("//input[@class=\"inputBox\"]")).sendKeys("Groupsoft");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.xpath("//input[contains(@id,'fir')]")).sendKeys("Amruta");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[contains(@id,'las')]")).sendKeys("Kulkarni");
		driver.findElement(By.xpath("//input[@name=\"departmentName\"]")).sendKeys("QA");
		driver.findElement(By.xpath("//input[@id=\"createLeadForm_primaryEmail\"]")).sendKeys("AK@gmail.com");
		driver.findElement(By.xpath("//textarea[@id=\"createLeadForm_description\"]")).sendKeys("gfydgdj udho udhu");
		
		WebElement dropdown=driver.findElement(By.xpath("//select[@name=\"generalStateProvinceGeoId\"]"));
		
		Select s = new Select(dropdown);
		
		s.selectByVisibleText("Indiana");
		
		
		driver.findElement(By.xpath("//input[contains(@name,'sub')]")).click();
		
		driver.findElement(By.xpath("//div[@class=\"frameSectionExtra\"]/a[3]")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//textarea[@class=\"inputBox\"]")).clear();
		
		driver.findElement(By.xpath("//textarea[@name=\"importantNote\"]")).sendKeys("abcd");
		
		driver.findElement(By.xpath("//input[@class=\"smallSubmit\"]")).click();
		
		String Title = driver.getTitle();
		System.out.println("Title name is :" +Title);
		
        // Close the browser

		driver.close();
		

	}

}
