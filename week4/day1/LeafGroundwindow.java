package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundwindow {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();        
		ChromeOptions option = new ChromeOptions();        
		option.addArguments("--disable-notifications");         
		ChromeDriver driver = new ChromeDriver(option);
		driver.get("https://leafground.com/window.xhtml;jsessionid=node0ssnceyfd5mtq1u38yu3inp0zh436503.node0");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.name("j_idt88:new")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> windows = new ArrayList<String>(windowHandles);
		if (windows.size()>1)
		{
			System.out.println("New window opened");
		}
		else
		{
		System.out.println("New window not opened");
		}
		driver.switchTo().window(windows.get(0));
		driver.findElement(By.id("j_idt88:j_idt91")).click();
		windowHandles=driver.getWindowHandles();
		windows= new ArrayList<String>(windowHandles);
		System.out.println("Number of opened Tabs= "+windows.size());
		driver.findElement(By.id("j_idt88:j_idt93")).click();
		windowHandles=driver.getWindowHandles();
		windows= new ArrayList<String>(windowHandles);
		for (int i=1;i<windows.size();i++)
		{
			driver.switchTo().window(windows.get(i));
			driver.close();
		}
		System.out.println("Switching back to parent window");
		driver.switchTo().window(windows.get(0));
		driver.findElement(By.id("j_idt88:j_idt95")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.numberOfWindowsToBe(3));
		windowHandles = driver.getWindowHandles();
		windows = new ArrayList<String>(windowHandles);
		driver.switchTo().window(windows.get(1));
		driver.manage().window().maximize();
		driver.quit();
		
		
		
	}

}
