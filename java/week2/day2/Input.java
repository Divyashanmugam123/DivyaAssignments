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
		driver.findElement(By.xpath("//div[@class='col-12']/textarea[@name='j_idt88:j_idt101']")).sendKeys("This is Divya, so excited to learn Selenium");
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
		String date = driver.findElement(By.xpath("//div[@class='ui-datepicker-calendar-container']//a[@class=' ui-state-default ui-state-active']")).getText();
		System.out.println("Date chosen is "+date);
		String numStr = "10";
		driver.findElement(By.xpath("//span[contains(@class,'ui-spinner ui-widget ui-corn')]/input")).sendKeys(numStr);
		int num = Integer.valueOf(numStr);
		String finNum;
		if(num<9)
		{
		for(int i=num;i<10;i++)
		{
		driver.findElement(By.xpath("(//span[contains(@class,'ui-spinner ui-widget ui-corn')]/input/following-sibling::a)[1]")).click();
		}
		finNum = driver.findElement(By.xpath("//span[contains(@class,'ui-spinner ui-widget ui-corn')]/input")).getAttribute("Value");
		}
		else
		{
		for(int j=num;j>=2;j--)
		{
		driver.findElement(By.xpath("(//span[contains(@class,'ui-spinner ui-widget ui-corn')]/input/following-sibling::a)[2]")).click();
		}
		finNum = driver.findElement(By.xpath("//span[contains(@class,'ui-spinner ui-widget ui-corn')]/input")).getAttribute("Value");
		}
		if (numStr.equals(finNum))
		{
			System.out.println("Value NOT changed after Spinning");
		}
		else
		{
			System.out.println("Value changed after Spinning");
		}
		driver.findElement(By.xpath("(//h5[contains(text(),'Type random number')]/following-sibling::input)[1]")).sendKeys("70");
		Thread.sleep(2000);
		String stlLocation = driver.findElement(By.xpath("//div[contains(@class,'ui-slider ui-corner-all')]/span")).getAttribute("style");
		System.out.println("Silder position = "+stlLocation);
		if(stlLocation.contains("70"))
		{
			System.out.println("Silder moved correctly");
		}
		else
		{
			System.out.println("Silder NOT moved");
		}
		driver.findElement(By.xpath("(//h5[contains(text(),'Click and Confirm Keyboard')]/following-sibling::input)[1]")).click();
		if(driver.findElement(By.xpath("//div[@class='keypad-row']")).isDisplayed())
		{
			System.out.println("Keyboard is Displayed");
		}
		else
		{
			System.out.println("Keyboard NOT Displayed");
		}

	}

	
}
