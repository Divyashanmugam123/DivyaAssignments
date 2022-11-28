package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MergeContact {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();        
		ChromeOptions option = new ChromeOptions();        
		option.addArguments("--disable-notifications");         
		ChromeDriver driver = new ChromeDriver(option);
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Merge Contacts")).click();
		driver.findElement(By.xpath("//input[@id='partyIdFrom']/following-sibling::a/img")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> windows = new ArrayList<String>(windowHandles);
		driver.switchTo().window(windows.get(1));
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[contains(@class,'x-grid3-row')]/table[@class='x-grid3-row-table']/tbody/tr/td//a)[1]")).click();
		Thread.sleep(2000);
		driver.switchTo().window(windows.get(0));
		driver.findElement(By.xpath("//input[@id='partyIdTo']/following-sibling::a/img")).click();
		windowHandles = driver.getWindowHandles();
		windows = new ArrayList<String>(windowHandles);
		driver.switchTo().window(windows.get(1));
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[contains(@class,'x-grid3-row-alt')]/table[@class='x-grid3-row-table']/tbody/tr/td//a)[1]")).click();
		driver.switchTo().window(windows.get(0));
		driver.findElement(By.xpath("//table[@class='twoColumnForm']//tr/td/a[text()='Merge']")).click();
		driver.switchTo().alert().accept();
		System.out.println(driver.getTitle());
	}

}
