package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

	public static void main(String[] args) {
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
		//Creating Contact
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Create Contact")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("Divya");
		driver.findElement(By.id("lastNameField")).sendKeys("S");
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Divya_L");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("S_L");
		driver.findElement(By.name("departmentName")).sendKeys("Finance");
		driver.findElement(By.id("createContactForm_description")).sendKeys("Finance team handling Bank transaction");
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("divyas.shanmugam@gmail.com");
		WebElement state = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select ddState = new Select(state);
		ddState.selectByVisibleText("New York");
		driver.findElement(By.xpath("//input[@name='generalPostalCodeExt']//following::input[@name='submitButton']")).click();
		
		 String title = driver.getTitle();
		
		 System.out.println("Added Successfully!! Resulting page =	"+title);
		 
		 driver.findElement(By.linkText("Edit")).click();
		 driver.findElement(By.name("description")).clear();
		 
		 driver.findElement(By.name("importantNote")).sendKeys("Complete the Week 2 assignments");
		 //Elder Cousin to Younger Cousin
		 driver.findElement(By.xpath("//textarea[@name='importantNote']//following::input[@name='submitButton']")).click();
		 title = driver.getTitle();
		 System.out.println("Updated Successfully!! Resulting page =	"+title);
	}
	}


