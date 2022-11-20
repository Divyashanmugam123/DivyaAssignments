package week3.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;import org.apache.poi.ss.usermodel.PrintCellComments;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ListPrice {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//div[@class='nav-search-field ']/input")).sendKeys("phones",Keys.ENTER);
		Thread.sleep(10000);
		List<WebElement> findElements = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		System.out.println("Number of Lists = "+ findElements.size());
		List<Integer> priceList = new ArrayList<Integer>();
		
		for(int i=0;i<findElements.size();i++)
		{
			WebElement webElement = findElements.get(i);
			System.out.println(webElement.getText());
			String text = webElement.getText().replace(",", "");
			if (!text.isBlank()) 
			{
			
			int price = Integer.parseInt(text);
			priceList.add(price);
			}
			
		}
		
		Collections.sort(priceList);
		System.out.println("Finding Least price using collection method min"+Collections.min(priceList));
		System.out.println("Least Price = "+priceList.get(0));
		
		

	}

}
