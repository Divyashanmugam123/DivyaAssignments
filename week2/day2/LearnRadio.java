package week2.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnRadio {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/radio.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//div[@class='col-12']//td/label[text()='Chrome']/preceding-sibling::div/div/span")).click();
		System.out.println("Selecting");
		driver.findElement(By.xpath("//div[@class='col-12']//div/label[text()='Bengaluru']/preceding-sibling::div/div/span")).click();
		System.out.println("Unselecting");
		driver.findElement(By.xpath("//div[@class='col-12']//div/label[text()='Bengaluru']/preceding-sibling::div/div/span")).click();
		String defaultSelected = driver.findElement(By.xpath("//div[@class='card']/h5[contains(text(),'Find the default select radio button')]/following-sibling::div/div//input[@checked='checked']/parent::div/parent::div/following-sibling::label")).getText();
		System.out.println("Default Select Radio Button = "+defaultSelected);
		List<WebElement> findElements = driver.findElements(By.xpath("//div[@class='card']/h5[contains(text(),'Select the age group (only')]/following-sibling::div/div//input/following::span"));
		int count = 0;
		int elePosition;
		for(int i= 0;i<findElements.size();i++)
		{
			WebElement ele = findElements.get(i);
			if(ele.isSelected())
			{
				count++;
				elePosition = i;
				
			}
			
		}
		if (count ==1)
		{
			//ele.click();
			System.out.println("Option was already selected, hence unselecting and selecting 3rd option");
			driver.findElement(By.xpath("(//div[@class='card']/h5[contains(text(),'Select the age group (only')]/following-sibling::div/div//input/following::span)[3]")).click();
		}
		else {
			driver.findElement(By.xpath("(//div[@class='card']/h5[contains(text(),'Select the age group (only')]/following-sibling::div/div//input/following::span)[3]")).click();
		}
		

	}

}
