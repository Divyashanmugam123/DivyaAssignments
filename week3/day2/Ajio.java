package week3.day2;

import java.time.Duration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ajio {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();         
		ChromeOptions option = new ChromeOptions();         
		option.addArguments("--disable-notifications");         
		ChromeDriver driver = new ChromeDriver(option);
		driver.get("https://www.ajio.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//input[@name='searchVal']")).sendKeys("bags",Keys.ENTER);
		driver.findElement(By.xpath("//div[@class='facet-linkfref ']//input[@value='Men']/following-sibling::label")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='facet-linkhead']/label[@for='Men - Fashion Bags']")).click();
		Thread.sleep(2000);
		String items = driver.findElement(By.xpath("//div[@class='length']")).getText();
		System.out.println("Number of Fashion Bags =  "+items);
		List<WebElement> findBrands = driver.findElements(By.xpath("//div[@class='brand']"));
		
		Set<String> uniqueBrand = new HashSet<String>();
		System.out.println("Brands of bags:");
		for(int i=0;i<findBrands.size();i++)
		{
		String brandText = findBrands.get(i).getText();
		boolean add = uniqueBrand.add(brandText);
		if(add)
		{
		uniqueBrand.add(brandText);
		System.out.println(brandText);
		}
		}
				
		List<WebElement> findBagNames = driver.findElements(By.xpath("//div[@class='nameCls']"));
		Set<String> uniqueBagNames = new HashSet<String>();
		System.out.println("Bag Names:");
		for(int i=0;i<findBagNames.size();i++)
		{
		String bagName = findBagNames.get(i).getText();
		boolean add1 = uniqueBagNames.add(bagName);
		if(add1)
		{
		uniqueBagNames.add(bagName);
		System.out.println(bagName);
		}
		}
		
		
	}

}
