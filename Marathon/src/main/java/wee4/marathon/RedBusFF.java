package wee4.marathon;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RedBusFF {

	public static void main(String[] args) throws InterruptedException, IOException {
		//01) Launch Firefox / Chrome
				WebDriverManager.chromedriver().setup();
				ChromeOptions options = new ChromeOptions();
				options.addArguments("--disable-notifications");
				ChromeDriver driver = new ChromeDriver(options);
				
				//02) Load https://www.redbus.in/
				driver.get("https://www.redbus.in/");
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
				//03) Type ""Chennai"" in the FROM text box and select the first option
				driver.findElement(By.xpath("//input[@id='src']")).sendKeys("Chennai");
				driver.findElement(By.xpath("//div/input[@id='src']//following-sibling::ul/li[2]")).click();
				
				//04) Type ""Bangalore"" in the To text box and select the first option
				driver.findElement(By.xpath("//input[@id='dest']")).sendKeys("Bangalore");
				driver.findElement(By.xpath("//div/input[@id='dest']//following-sibling::ul/li[2]")).click();
				
				//05) Select tomorrow's date in the Date field
				driver.findElement(By.xpath("//input[@id='onward_cal']")).click();
				String currentDay = driver.findElement(By.xpath("//table[@class='rb-monthTable first last']/tbody/tr/td[@class='current day']")).getText();
				int cur = Integer.parseInt(currentDay);
				cur = cur+1;
				driver.findElement(By.xpath("//table[@class='rb-monthTable first last']/tbody/tr/td[text()='"+cur+"']")).click();
				driver.findElement(By.id("search_btn")).click();
				
				//07) Print the number of buses shown as results
				Thread.sleep(4000);
				String noOfBuses = driver.findElement(By.xpath("//span[@class='f-bold busFound']")).getText();
				System.out.println("Number of Buses Found = " +noOfBuses);
				
				//08) Choose SLEEPER in the left menu 
				driver.findElement(By.xpath("//input[@id='bt_SLEEPER']/following-sibling::label")).click();
				
				//09) Print the name of the second resulting bus 
				String secondBusName = driver.findElement(By.xpath("//ul[@class='bus-items']/div[2]//div[@class='clearfix row-one']/div/div")).getText();
				System.out.println(secondBusName);
				
				WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//				wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='close-primo']/i")));
//				driver.findElement(By.xpath("//div[@class='close-primo']/i")).click();
				wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[text()='IMPORTANT TIP']")));
				driver.findElement(By.xpath("//div[text()='IMPORTANT TIP']/div/i")).click();
				
				
				Thread.sleep(8000);
						
				//10) Click the VIEW SEATS of that bus
				driver.findElement(By.xpath("(//div[text()='View Seats'])[2]")).click();
//				Actions builder = new Actions(driver);
//				WebElement seats = driver.findElement(By.xpath("//ul[@class='bus-items']/div[2]//div[@class='clearfix m-top-16']/div[@class='button view-seats fr']"));
//				builder.scrollToElement(seats).click(seats).perform();
				
				Thread.sleep(5000);
				//11) Take screenshot and close browser
				WebElement ele = driver.findElement(By.xpath("//div[@class='upper-canvas canvas-wrapper']"));
				 Actions builder = new Actions(driver);
				 builder.moveToElement(ele).perform();
						File Source = driver.getScreenshotAs(OutputType.FILE);
						File dest = new File("./snaps/ViewSeats.png");
						FileUtils.copyFile(Source, dest);
	}

}
