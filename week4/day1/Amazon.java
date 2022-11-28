package week4.day1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.aventstack.extentreports.utils.FileUtil;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon {

	public static void main(String[] args) throws InterruptedException, IOException {
//		1.Load the URL https://www.amazon.in/
		WebDriverManager.chromedriver().setup();        
		ChromeOptions option = new ChromeOptions();        
		option.addArguments("--disable-notifications");         
		ChromeDriver driver = new ChromeDriver(option);
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
//			2.search as oneplus 9 pro 
		driver.findElement(By.xpath("//div[@class='nav-search-field ']/input")).sendKeys("oneplus 9 pro",Keys.ENTER);
		
		//	3.Get the price of the first product
		String price = driver.findElement(By.xpath("(//span[@class='a-price']//span[@class='a-price-whole'])[1]")).getText();
		System.out.println("price of the first product = "+price);
		Thread.sleep(5000);
//			4. Print the number of customer ratings for the first displayed product
		String ratings = driver.findElement(By.xpath("(//span[@class='a-declarative']//span[@class='a-icon-alt'])[1]")).getText();
		System.out.println("Number of customer ratings for the first displayed product = "+ratings);
		
//			5. Click the first text link of the first image
		driver.findElement(By.xpath("(//h2[contains(@class,'a-size-mini')]//span)[1]")).click();
		
		//Switching to the page where Image opened
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> windows = new ArrayList<String>(windowHandles);
		driver.switchTo().window(windows.get(1));
		
//			6. Take a screen shot of the product displayed
		File source = driver.getScreenshotAs(OutputType.FILE);
		File dest = new File("./snaps/OnePlus.png");
		FileUtils.copyFile(source, dest);
		
//			7. Click 'Add to Cart' button
		driver.findElement(By.xpath("//span[@class='a-button-inner']//input[@id='add-to-cart-button']")).click();
		Thread.sleep(7000);
		
//			8. Get the cart subtotal and verify if it is correct.
		String subTotal = driver.findElement(By.id("attach-accessory-cart-subtotal")).getText();
		System.out.println("Cart Sub Total = "+subTotal);
		 if(subTotal.contains(price))
		 {
			 System.out.println("Cart Sub Total is Correct");
		 }
		 else
		 {
			 System.out.println("Cart Sub Total is InCorrect");
		 }
		
//			9.close the browser

	}

}
