package week2.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnLink {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/link.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//div/a[contains(text(),'Dashboard')]")).click();
		driver.navigate().back();
		String linkUrl = driver.findElement(By.xpath("//h5[text()='Find my destination']/following-sibling::div/div/a")).getAttribute("href");
		System.out.println("Destination URL = "+linkUrl);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//h5[text()='Am I broken link?']/following-sibling::div/div/a")).click();
		String msg = driver.findElement(By.xpath("//h2")).getText();
		System.out.println("After clicking on the Broken link"+msg);
		if(msg.contains("ERROR"))
		{
			System.out.println("Link is Broken");
		}
		else
		{
			System.out.println("Link is NOT broken");
		}
		driver.navigate().back();
		List<WebElement> findElements = driver.findElements(By.xpath("//div[@class='layout-main-content']//a"));
		int count =0;
		for(int i=0;i<findElements.size();i++)
		{
			count =0;
			WebElement ele = findElements.get(i);
			String linkU = ele.getAttribute("href");
			for(int j=0;j<findElements.size();j++)
			{
				
				WebElement ele2 = findElements.get(j);
				String linkU2 = ele2.getAttribute("href");
				if(linkU.equals(linkU2))
				{
					count++;
					
				}
				
			}
			if(count>1)
			{
				System.out.println("Duplicate link = "+linkU);
				break;
			}
			else
			{
				System.out.println("No Duplicate links");
			}
			
		}
		List<WebElement> findElements2 = driver.findElements(By.xpath("//a"));
		System.out.println("Number of Links in this Page = "+findElements2.size());
		System.out.println("Number of Links in this Layout = "+findElements.size());

	}

}
