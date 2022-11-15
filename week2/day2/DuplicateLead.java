package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
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
		driver.findElement(By.xpath("//div[@class='x-tab-panel-header x-unselectable']//span[text()='Email']")).click();
		driver.findElement(By.xpath("//div[@class='x-form-element']/input[@name='emailAddress']")).sendKeys("divyas.shanmugam@gmail.com");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(5000);
		String leadName = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a[1]")).getText();
		System.out.println("Name of First Resulting Lead= " + leadName);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a[1]")).click();
		driver.findElement(By.linkText("Duplicate Lead")).click();
		String title = driver.getTitle();
		Thread.sleep(5000);
		if (title.equals("Duplicate Lead | opentaps CRM"))
		{
			driver.findElement(By.xpath("//div[@class='fieldgroup-body']//input[@name='submitButton']")).click();
			if (leadName.equals(driver.findElement(By.xpath("//div[@class='fieldgroup-body']//span[@id='viewLead_firstName_sp']")).getText()))
			{
				System.out.println("Lead \"" +leadName+"\" is Duplicated Successfully");
				driver.close();
			}
		}
		
		else
		{
			System.out.println("Lead Not duplicated");
		}
		
	}

}
