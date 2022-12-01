package week2.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateTask {

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
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='headerTrigger  tooltip-trigger uiTooltip']/lightning-icon[@class='slds-icon-utility-add slds-button slds-button--icon slds-button--icon-small slds-button--icon-container slds-button--icon-x-small slds-global-header__button--icon-actions globalCreateButton slds-icon_container']")).click();
		
		driver.findElement(By.xpath("//a[@title='New Task']//span[text()='New Task']")).click();
		driver.findElement(By.xpath("//div[@class='slds-combobox__form-element slds-input-has-icon slds-input-has-icon_right']/input")).sendKeys("Bootcamp");
		String subtext = driver.findElement(By.xpath("//div[@class='slds-combobox__form-element slds-input-has-icon slds-input-has-icon_right']/input")).getAttribute("value");
		System.out.println("Enetered Subject is = "+subtext);
		driver.findElement(By.linkText("Not Started")).click();
		driver.findElement(By.xpath("//a[@title='Waiting on someone else']")).click();
		//driver.findElement(By.xpath("//button[@type='button']/span[text()='Save']")).click();
		WebElement saveEle = driver.findElement(By.xpath("//button[@type='button']/span[text()='Save']"));
		driver.executeScript("arguments[0].click();", saveEle);
		Thread.sleep(5000);
		String finalText = driver.findElement(By.xpath("//span[@class='toastMessage slds-text-heading--small forceActionsText']")).getText();
		System.out.println("Final Text retrived is ="+finalText);
		if (finalText.contains(subtext))
		{
			System.out.println("Task is created");
		}
		else
		{
			System.out.println("Task is NOT created");
		}
	
	
	}

}
