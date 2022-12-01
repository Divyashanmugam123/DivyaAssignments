package wee4.marathon;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.sukgu.Shadow;

public class SalesForce {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
//		1. Launch Salesforce application https://login.salesforce.com/
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//2. Login with Provided Credentials
		driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
		driver.findElement(By.id("password")).sendKeys("Testleaf$321");
		driver.findElement(By.id("Login")).click();
		
		//3. Click on Learn More link in Mobile Publisher  and click Confirm
		 //and Click Learning and Mouse hover on Learning On Trailhead
		driver.findElement(By.xpath("//span[text()='Learn More']")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> windows= new ArrayList<String>(windowHandles);
		driver.switchTo().window(windows.get(1));
		driver.findElement(By.xpath("//button[2]")).click();
		Shadow dom =new Shadow(driver);
		dom.setImplicitWait(10);
		dom.findElementByXPath("//span[text()='Learning']").click();
		Thread.sleep(2000);
		
       //mouse over on Learning On Trailhead
		Actions builder = new Actions(driver);
		WebElement ele = dom.findElementByXPath("//span[text()='Learning on Trailhead']");
		builder.moveToElement(ele).perform();
		
		//4. Select SalesForce Certification 
		WebElement sales = dom.findElementByXPath("//a[text()='Salesforce Certification']");
		driver.executeScript("arguments[0].click()", sales);
		
		//5. Choose Your Role as Salesforce Architect and verify the URL
		driver.findElement(By.xpath("(//div[@class='roleMenu-item ']/a/img)[1]")).click();
		String textUrl = "https://trailhead.salesforce.com/en/credentials/architectoverview/";
		String getUrl = driver.getCurrentUrl();
		System.out.println("Current Url =" +getUrl);
		if(textUrl.equals(getUrl))
		{
			System.out.println("Redirected to correct page");
		}
		else
		{
			System.out.println("Not Redirected to correct page");
		}
		//6. Get the Text(Summary) of Salesforce Architect 
		System.out.println("Salesforce Architect Summary:");
		String textSales = driver.findElement(By.xpath("//div[contains(@class,'cert-site_text slds-text-align--')]")).getText();
		System.out.println(textSales);
		
		//7. Get the List of Salesforce Architect Certifications Available
		List<WebElement> architects = driver.findElements(By.xpath("//div[@class='credentials-card_title']/a"));
		System.out.println(" ");
		System.out.println("List of Salesforce Architect Certifications Available:");
		for(int i=0;i<architects.size();i++)
		{
			String txtArchitect = architects.get(i).getText();
			System.out.println(txtArchitect);
		}
		//8. Click on Application Architect 
		driver.findElement(By.xpath("(//div[@class='credentials-card_title']/a)[1]")).click();
		
		//9.Get the List of Certifications available
		List<WebElement> appArchitects = driver.findElements(By.xpath("//div[@class='credentials-card_title']/a"));
		System.out.println(" ");
		System.out.println("List of Application Architect Certifications Available:");
		for(int i=0;i<appArchitects.size();i++)
		{
			String txtAppArchitect = appArchitects.get(i).getText();
			System.out.println(txtAppArchitect);
		}
	}

}
