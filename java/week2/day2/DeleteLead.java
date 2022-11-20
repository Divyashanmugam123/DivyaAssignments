package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Entering the Username and Password
		//Storing the locator.
		WebElement eleUserName = driver.findElement(By.id("username"));
		eleUserName.sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Find')]")).click();
		driver.findElement(By.xpath("//div[@class='x-tab-strip-wrap']//span[text()='Phone']")).click();
		driver.findElement(By.xpath("//div[@class='x-plain-body x-plain-body-noheader x-plain-body-noborder']/input[@name='phoneNumber']")).sendKeys("8754461373");
		driver.findElement(By.xpath("//div[@class='x-panel-btns-ct']//button[text()='Find Leads']")).click();
		Thread.sleep(5000);
		String leadId = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[1]")).getText();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[1]")).click();
		driver.findElement(By.xpath("//a[text()='Edit']/following-sibling::a")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Find')]")).click();
		driver.findElement(By.xpath("//div[@class='x-form-element']/input[@name='id']")).sendKeys(leadId);
		driver.findElement(By.xpath("//td[@class='x-btn-center']//button[text()='Find Leads']")).click();
		Thread.sleep(5000);
		String msg = driver.findElement(By.xpath("//div[@class='x-toolbar x-small-editor']/div[@class='x-paging-info']")).getText();
		System.out.println(msg);
		if (msg.equals("No records to display")) {
			System.out.println(leadId+" is Deleted successfully");
		}
		else {
			System.out.println(leadId+" is NOT Deleted successfully");
		}
	}

}
