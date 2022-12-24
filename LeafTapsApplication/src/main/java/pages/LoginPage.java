package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class LoginPage extends BaseClass{
	
	public LoginPage(ChromeDriver driver)
	{
		this.driver=driver;
	}
	
	public LoginPage enterUserName()
	{
		WebElement eleUserName = driver.findElement(By.id("username"));
		eleUserName.sendKeys("DemoCsr");
		return this;
	}
	
	public LoginPage enterPassword() {
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		return this;
	}

	public HomePage clickLogin()
	{
		driver.findElement(By.className("decorativeSubmit")).click();
		return new HomePage(driver);
	}
}
