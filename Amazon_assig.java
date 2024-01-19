package week3.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_assig {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver =new ChromeDriver();
		
		//load the application in the browser
		driver.get("https://www.amazon.in/");
		
		//maximize the application //div[@class=\"a-text-center a-spacing-small a-size-mini\"]/a
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[text()='Conditions of Use & Sale']")).click();
		
        // Type "Bags for boys" in the search box and press ENTER

		driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]")).click();
		
		driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]")).sendKeys("bags for boys",Keys.ENTER);
		
        // Print the total number of results
	//	String textcount=driver.findElement(By.xpath("//div[@class=\"a-section a-spacing-small a-spacing-top-small\"]/span")).getText();
	//	System.out.println(textcount);
		
		//Or

		WebElement count = driver.findElement(By.xpath("//div[@class=\"a-section a-spacing-small a-spacing-top-small\"]/span"));
		System.out.println(count.getText());
		
        // Select the first 2 brands in the left menu
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='Brand']/following::i")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='American Tourister']")).click();
		
		driver.findElement(By.xpath("//select[@id=\"s-result-sort-select\"]//following::span[4]")).click();
		
        // Choose New Arrivals (Sort)

		driver.findElement(By.xpath("//a[text()='Newest Arrivals']")).click();
		Thread.sleep(1000);
		
        // Print the first resulting bag info (name, discounted price)
		String bra_name=driver.findElement(By.xpath("//span[@class=\"a-size-base-plus a-color-base\"]")).getText();
		System.out.println("Brand Name :"+ bra_name);
		Thread.sleep(1000);
		String price=driver.findElement(By.xpath("//span[@class=\"a-price-whole\"]")).getText();
		System.out.println("Price of bag : Rs. "+ price);
		String discount=driver.findElement(By.xpath("//a[@class=\"a-link-normal s-no-hover s-underline-text s-underline-link-text s-link-style a-text-normal\"]/following::span[2]")).getText();
		System.out.println("Discount of bag :  "+ discount);
		
        // Get the page title and close the browser //span[@class=\\\"a-letter-space\\\"]/following::span

		String Title = driver.getTitle();
		System.out.println("Title name is :" +Title);
		
        // Close the browser

		driver.close();
		
		

	}

}



