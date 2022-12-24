package base;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import io.github.bonigarcia.wdm.WebDriverManager;
import utils.ReadExcel;


public class BaseClass {

	public ChromeDriver driver;
	public String fileName;
	public int sheetIndex;

	@BeforeMethod()
	public void preCondition() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		ChromeOptions option = new ChromeOptions();         
		option.addArguments("--disable-dev-shm-usage");         
		driver = new ChromeDriver(option);
		//Launch url
		driver.get("http://leaftaps.com/opentaps/control/main");
		//maximize
		driver.manage().window().maximize();
		
	}
	@AfterMethod()
	public void postCondition()
	{
		driver.close();
	}
	
	
	
 @DataProvider(name="fetchData")
  public String[][] getData() throws IOException
  {
		//Get into the Workbook
				String[][] data = ReadExcel.readData(fileName, sheetIndex);
				return data;
   }

}
