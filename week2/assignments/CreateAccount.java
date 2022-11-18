package week2.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateAccount {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions option = new ChromeOptions();         
		option.addArguments("--disable-notifications");         
		ChromeDriver driver = new ChromeDriver(option);
		driver.get("https://login.salesforce.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
		driver.findElement(By.id("password")).sendKeys("Testleaf$321");
		driver.findElement(By.id("Login")).click();
		driver.findElement(By.className("slds-r5")).click();
		Thread.sleep(10000);
	    driver.findElement(By.xpath("//button[text()='View All']")).click();
	    driver.findElement(By.xpath("//p[text()='Sales']")).click();
	    Thread.sleep(5000);
	    WebElement findElement = driver.findElement(By.xpath("//span[text()='Accounts']"));
        driver.executeScript("arguments[0].click();",findElement);
        driver.findElement(By.xpath("//div[@title='New']")).click();
        driver.findElement(By.xpath("//input[@name='Name']")).sendKeys("Divya S");
         String enteredName = driver.findElement(By.xpath("//input[@name='Name']")).getAttribute("value");
         System.out.println(enteredName);
        driver.findElement(By.xpath("//button[@aria-label='Ownership, --None--']")).click();
        driver.findElement(By.xpath("//span[@class='slds-media__body']/span[text()='Public']")).click();
        driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
        Thread.sleep(5000);
        String msg = driver.findElement(By.xpath("//span[@class='toastMessage slds-text-heading--small forceActionsText']")).getText();
        System.out.println(msg);
        if(msg.contains(enteredName))
        {
        	System.out.println("Account is created");
        }
        else
        {
        	System.out.println("Account is NOT created");
	}
	}

}
