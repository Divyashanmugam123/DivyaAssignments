package week2.day2;

import java.time.Duration;
import java.util.List;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnCheckbox {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/checkbox.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement basic = driver.findElement(By.xpath("//div[@class='card']/div/div/div/span[text()='Basic']/preceding-sibling::div/span"));
		driver.executeScript("arguments[0].click();", basic);
		WebElement ajax=driver.findElement(By.xpath("//div[@class='col-12']//span[text()='Ajax']/preceding-sibling::div/following-sibling::div/span"));
		driver.executeScript("arguments[0].click();", ajax);
		String text = driver.findElement(By.xpath("//div[@class='ui-growl-message']/span")).getText();
		if(text.equals("Checked"))
		{
			System.out.println("Ajax is Checked");
		}
		else
		{
			System.out.println("Ajax is Unchecked");
		}
		
		WebElement pn=driver.findElement(By.xpath("//div[@class='col-12']//td/label[text()='Python']/preceding-sibling::div/div/span"));
		driver.executeScript("arguments[0].click();", pn);
		WebElement js=driver.findElement(By.xpath("//div[@class='col-12']//td/label[text()='Javascript']/preceding-sibling::div/div/span"));
		driver.executeScript("arguments[0].click();", js);
		WebElement triState=driver.findElement(By.xpath("//h5[text()='Tri State Checkbox']/following-sibling::div/div/div/div/span"));
		driver.executeScript("arguments[0].click();", triState);
		Thread.sleep(2000);
		String text1= driver.findElement(By.xpath("//div[@class='ui-growl-message']/p")).getText();
		System.out.println(text1);
		if (text1.equals("State = 1"))
		{
			System.out.println("State has been changed (Ticked)");
		}
		else if (text.equals("State = 2"))
		{
			System.out.println("State has been changed (X)");
		}
		else
		{
			System.out.println("State has been changed (Unchecked)");
		}
		driver.findElement(By.xpath("(//div[@class='ui-toggleswitch ui-widget']/div)[2]")).click();
		String text2 = driver.findElement(By.xpath("//div[@class='ui-growl-message']/span")).getText();
		
		if(text2.equals("Checked"))
		{
			System.out.println("Toggle Switch is Checked");
		}
		else
		{
			System.out.println("Toggle Switch is Unchecked");
		}
		if (driver.findElement(By.xpath("//h5[contains(text(),'Verify if check box is')]/following-sibling::div/div/div/span")).isSelected())
		{
			System.out.println("Checkbox is Enabled");
		}
		else
		{
			System.out.println("Checkbox is Disabled");
		}
		driver.findElement(By.xpath("//h5[contains(text(),'Select Multiple')]/following-sibling::div/ul")).click();
		List<WebElement> state = driver.findElements(By.xpath("//div[@class='ui-selectcheckboxmenu-items-wrapper']/ul/li"));
		String txtState;
		for(int i=0;i<state.size();i++)
		{
			if(i%2==0)
			{
				driver.executeScript("arguments[0].click();", state.get(i));
			}
		}

	}

}
