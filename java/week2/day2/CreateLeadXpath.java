package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLeadXpath {
		
	
	public static void main(String[] args) throws InterruptedException {
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
		 driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
		
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		Thread.sleep(2000);
		//Clicking on Login
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();;
		//Clicking on CRM/SFA
		driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
		//driver.findElement(By.xpath("//a[text()='CRM/SFA']")).click();

		//Creating Lead
	
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("Microsoft");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Manoj");
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Kumar");
		WebElement dropSource = driver.findElement(By.xpath("//select[@name='dataSourceId']"));
		Select dd = new Select(dropSource);
		dd.selectByValue("LEAD_CONFERENCE");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("Man");
		driver.findElement(By.xpath("//input[@id='createLeadForm_departmentName']")).sendKeys("Ad Sales");
		driver.findElement(By.xpath("//textarea[@id='createLeadForm_description']")).sendKeys("This is Test Description");
		driver.findElement(By.xpath("//input[@id='createLeadForm_primaryEmail']")).sendKeys("divyas.shanmugam@gmail.com");
		WebElement state = driver.findElement(By.xpath("//select[@id='createLeadForm_generalStateProvinceGeoId']"));
		Select ddState = new Select(state);
		ddState.selectByVisibleText("California");
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		Thread.sleep(2000);
		 String title = driver.getTitle();
		 
		 System.out.println("Added Successfully!! Resulting page =	"+title);
		
		/*WebElement dropSource = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select dd = new Select(dropSource);
		dd.selectByValue("LEAD_CONFERENCE");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Div");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Ad Sales");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("This is Test Description");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("divyas.shanmugam@gmail.com");
		WebElement state = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select ddState = new Select(state);
		ddState.selectByVisibleText("California");**/
		 
		
		
		// TODO Auto-generated method stub
       
		
		

	}

}
