package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {
	
	
	public void funDuplicateLead() throws InterruptedException{
		WebDriverManager.chromedriver().setup();
		//Open Browser
		 ChromeDriver driver = new ChromeDriver();
		//Launch url
		driver.get("http://leaftaps.com/opentaps/control/main");
		//maximize
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//Entering the Username and Password
		//Storing the locator.
		WebElement eleUserName = driver.findElement(By.id("username"));
		eleUserName.sendKeys("Demosalesmanager");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		Thread.sleep(2000);
		//Clicking on Login
		driver.findElement(By.className("decorativeSubmit")).click();
		//Clicking on CRM/SFA
		driver.findElement(By.linkText("CRM/SFA")).click();

		//Creating Lead
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Microsoft");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Priya");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("S");
		WebElement dropSource = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select dd = new Select(dropSource);
		dd.selectByValue("LEAD_CONFERENCE");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Div");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Ad Sales");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("This is Test Description");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("divyas.shanmugam@gmail.com");
		WebElement state = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select ddState = new Select(state);
		ddState.selectByVisibleText("California");
		driver.findElement(By.name("submitButton")).click();
		Thread.sleep(2000);
		String title = driver.getTitle();
		System.out.println("Added Successfully!! Resulting page =	"+title);
		
		//Duplicate Lead
		driver.findElement(By.linkText("Duplicate Lead")).click();
		WebElement companyName = driver.findElement(By.id("createLeadForm_companyName"));
		companyName.clear();
		companyName.sendKeys("AT & T");
		WebElement firstName = driver.findElement(By.id("createLeadForm_firstName"));
		firstName.clear();
		firstName.sendKeys("Divya");
		driver.findElement(By.name("submitButton")).click();
		System.out.println("Record is Duplicated!! Resulting Page = "+driver.getTitle());
		}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub	
       
		DuplicateLead dl = new DuplicateLead();
		dl.funDuplicateLead();;
		

	}

}
