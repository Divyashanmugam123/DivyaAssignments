package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnWebTable {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();        
		ChromeOptions option = new ChromeOptions();        
		option.addArguments("--disable-notifications");         
		ChromeDriver driver = new ChromeDriver(option);
		driver.get("https://erail.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement from = driver.findElement(By.id("txtStationFrom"));
		from.clear();
		from.sendKeys("MAS");
		Thread.sleep(200);
			from.sendKeys(Keys.ENTER);
		driver.findElement(By.id("txtStationTo")).clear();
		driver.findElement(By.id("txtStationTo")).sendKeys("CBE",Keys.ENTER);
		driver.findElement(By.xpath("//input[contains(@title,'on select date')]")).click();
		List<WebElement> rows = driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']/tbody/tr/td[2]/a"));
		
		Thread.sleep(5000);
		System.out.println(driver.findElement(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']/tbody/tr[2]/td[2]/a")).getText());
		List<String> trainName = new ArrayList<String>();
		
		for(int i=2;i<=rows.size();i++)
		{
			String trainNameTxt = driver.findElement(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']/tbody/tr["+i+"]/td[2]/a")).getText();
			System.out.println(trainNameTxt);
			trainName.add(trainNameTxt);
		}
		Set<String> uniTrain = new LinkedHashSet<String>(trainName);
		System.out.println(uniTrain);
       
      if(rows.size()==uniTrain.size())
      {
    	  System.out.println("There is no duplicate");
      }
      else
      {
    	  System.out.println("There is a duplicate");
      }
       
	}

}
