package wee4.marathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.sukgu.Shadow;

public class ServiceNow {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		
		//1. Launch ServiceNow application
		driver.get("https://dev138589.service-now.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//2. Login with valid credentials username as admin and password as 
		driver.findElement(By.id("user_name")).sendKeys("admin");
		driver.findElement(By.id("user_password")).sendKeys("mc/-vASs9V1E");
		driver.findElement(By.id("sysverb_login")).click();
		
		//3. Click-All Enter Service catalog in filter navigator and press enter or Click the ServiceCatalog
		Shadow dom = new Shadow(driver);
		dom.setImplicitWait(20);
		dom.findElementByXPath("//div[@id='all']").click();
		Thread.sleep(3000);
		
		WebElement filterTxt = dom.findElementByXPath("//input[@id='filter']");
		filterTxt.click();
		Thread.sleep(3000);
		WebElement txt = dom.findElementByXPath("//span[text()='Service Catalog']");
		txt.click();
		
		Thread.sleep(3000);
		//Switching to frame which is inside the shadow
		WebElement frame = dom.findElementByXPath("//iframe[@id='gsft_main']");
		driver.switchTo().frame(frame);
		
		//4. Click on  mobiles
		WebElement mobiles =  dom.findElementByXPath("//h2[contains(text(),'Mobiles')]");
		mobiles.click();
		
		//5. Select Apple iphone6s
		driver.findElement(By.xpath("//a/strong[text()='iPhone 6s']")).click();
		
		
		//6. Update color field to rose gold and storage field to 128GB
		WebElement color= driver.findElement(By.xpath("(//div[@class='form-group  sc-row sc-row-6']//select)[1]"));
		Select ddColor = new Select(color);
		ddColor.selectByVisibleText("Gold");
		
		WebElement storage= driver.findElement(By.xpath("(//div[@class='form-group  sc-row sc-row-6']//select)[2]"));
		Select ddStorage = new Select(storage);
		ddStorage.selectByValue("onehudred_twentyeight");
		
		//7. Select  Order now option
		driver.findElement(By.id("oi_order_now_button")).click();
		
		String text = driver.findElement(By.xpath("//div[@class='notification notification-success']/span")).getText();
		String reqNum = driver.findElement(By.xpath("//a/b")).getText();
		
		if(text.contains("submitted"))
		{
			System.out.println("Order is placed");
			System.out.println("Request Number = "+reqNum);
		}
		else
		{
			System.out.println("Order NOT placed");
		}
		
		

	}

}
