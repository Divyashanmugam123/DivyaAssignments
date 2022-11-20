package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//basic Text based
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		//1 - GrandParent to GrantChild + Basic Attribute based
		driver.findElement(By.xpath("//div[@class='mbm _1iy_ _a4y _3-90 lfloat _ohe']//input[@name='firstname']")).sendKeys("Divyatest123");
		//2 - Elder Sibling to Younger sibling + Partial text based
		driver.findElement(By.xpath("//div[contains(text(),'Sur')]//following-sibling::input[@name='lastname']")).sendKeys("S");
		//3 - Parent to Child
		driver.findElement(By.xpath("//div[@class='uiStickyPlaceholderInput uiStickyPlaceholderEmptyInput']/input[@name='reg_email__']")).sendKeys("8754461373");
		driver.findElement(By.xpath("//div[@class='uiStickyPlaceholderInput uiStickyPlaceholderEmptyInput']/input[@id='password_step_input']")).sendKeys("Cheetah@123");
		//GreatGrandParent to GreatGrandChid
		WebElement day = driver.findElement(By.xpath("//div[@class='_5k_5']//select[@id='day']"));
		Select ddDay = new Select(day);
		ddDay.selectByValue("9");
		//4 - younger Sibling to Elder Sibling
		WebElement month = driver.findElement(By.xpath("//select[@id='year']/preceding-sibling::select[@id='month']"));
		Select ddMonth = new Select(month);
		ddMonth.selectByVisibleText("Nov");
		//5 - Child to Parent
		WebElement year = driver.findElement(By.xpath("//option[@value='2022']/parent::select[@id='year']"));
		Select ddYear = new Select(year);
		ddYear.selectByValue("1988");
		driver.findElement(By.xpath("//label[contains(text(),'Fem')]")).click();
		System.out.println("All fields entered successfully");
	}

}
