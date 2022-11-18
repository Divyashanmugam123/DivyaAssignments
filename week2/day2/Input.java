package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Input {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/input.xhtml;jsessionid=node01j540a7o52can13p945ps0fry4418339.node0");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//div[@class='col-12']/input[@name='j_idt88:name']")).sendKeys("Divya");
		driver.findElement(By.xpath("//div[@class='col-12']/input[@name='j_idt88:j_idt91']")).sendKeys("India");
		boolean txtEnabled = driver.findElement(By.xpath("//div[@class='col-12']/input[@name='j_idt88:j_idt93']")).isEnabled();
		if(txtEnabled==true)
		{
			System.out.println("Text Box is enabled");
		}
		else
		{
		System.out.println("Text box is disabled");
		}
		driver.findElement(By.xpath("//div[@class='col-12']/input[@value='Can you clear me, please?']")).clear();
		System.out.println(driver.findElement(By.xpath("//div[@class='col-12']/input[@name='j_idt88:j_idt97']")).getAttribute("Value"));
		driver.findElement(By.xpath("//div[@class='col-12']/input[@name='j_idt88:j_idt99']")).sendKeys("divyas.shanmugam@gmail.com",Keys.TAB);
		System.out.println(driver.findElement(By.xpath("//div[@class='col-12']/textarea[@name='j_idt88:j_idt101']")).getLocation());
		driver.findElement(By.xpath("//div[@class='ql-editor ql-blank']")).sendKeys("This is Text Area");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='col-12 mb-2 lg:col-8']/input[@name='j_idt106:thisform:age']")).sendKeys(Keys.ENTER);
		String errMsg = driver.findElement(By.xpath("//div[@class='col-12 mb-2 lg:col-4']//span[@class='ui-message-error-detail']")).getText();
		System.out.println(errMsg);
		if(errMsg.equals("Age is mandatory"))
		{
			System.out.println("Error message for Age is displayed correctly");
		}
		else
		{
			System.out.println("Error message for Age is NOT displayed correctly");
		}
		Point location = driver.findElement(By.xpath("//span[@class='ui-float-label']/label[@class='ui-outputlabel ui-widget']")).getLocation();
		System.out.println("Location of Username before clicking"+location);
		driver.findElement(By.xpath("//span[@class='ui-float-label']/input[@name='j_idt106:float-input']")).click();
		Point locationClick = driver.findElement(By.xpath("//span[@class='ui-float-label']/label[@class='ui-outputlabel ui-widget']")).getLocation();
		System.out.println("Location of Username after clicking"+locationClick);
		if(location!=locationClick)
		{
			System.out.println("Label position changed");
		}
		else
		{
			System.out.println("Label position NOT changed");
		}
		
		driver.findElement(By.xpath("//button[@aria-label='Show Options' and @role='button']/preceding-sibling::ul/li/input")).sendKeys("Divya");
		driver.findElement(By.xpath("//span[@role='listbox']/ul/li[3]")).click();
		driver.findElement(By.xpath("//span[@class='p-datepicker ui-calendar ui-trigger-calendar']/input")).sendKeys("11/09/1988");
		Thread.sleep(2000);
		String date = driver.findElement(By.xpath("//div[@class='ui-datepicker-calendar-container']//a[@class=' ui-state-default ui-state-active']")).getAttribute("Value");
		System.out.println(date);
		
	}

}
