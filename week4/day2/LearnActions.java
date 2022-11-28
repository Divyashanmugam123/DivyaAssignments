package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnActions {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();        
		ChromeOptions option = new ChromeOptions();        
		option.addArguments("--disable-notifications");         
		ChromeDriver driver = new ChromeDriver(option);
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement men = driver.findElement(By.xpath("(//div[@class='leftNavigationLeftContainer expandDiv']//span[contains(text(),'Men')])[1]"));
		Actions builder = new Actions(driver);
		builder.moveToElement(men).perform();
		driver.findElement(By.xpath("(//div[@class='colDataInnerBlk']//span[text()='Shirts'])[1]")).click();
		Thread.sleep(5000);
		WebElement img = driver.findElement(By.xpath("(//div[@class='product-tuple-image ']//*[@class='product-image '])[1]"));
		builder.moveToElement(img).perform();
		driver.findElement(By.xpath("(//div[@class='clearfix row-disc']/div)[1]")).click();

	}

}
