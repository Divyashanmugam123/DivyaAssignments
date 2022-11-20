package week2.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Button {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/button.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//h5[text()='Click and Confirm title.']/following-sibling::button")).click();
		String title = driver.getTitle();
		if (title.equals("Dashboard"))
		{
			System.out.println("Navigated to right page");
		}
		else
		{
			System.out.println("Navigated to wrong page");
		}
		driver.navigate().back();
		if(driver.findElement(By.xpath("//h5[contains(text(),'Confirm if the button')]/following-sibling::button")).isEnabled())
		{
			System.out.println("Button is Enabled");
		}
		else
		{
			System.out.println("Button is Disabled");
		}
		System.out.println("Location of the button = " +driver.findElement(By.xpath("//h5[contains(text(),'Find the position')]/following-sibling::button")).getLocation());
		System.out.println("Color of the button = " +driver.findElement(By.xpath("//h5[contains(text(),'Find the Save')]/following-sibling::button")).getCssValue("background-color"));
		System.out.println("Height of the button = " +driver.findElement(By.xpath("//h5[contains(text(),'Find the height')]/following-sibling::button")).getSize().getHeight());
		System.out.println("Width of the button = " +driver.findElement(By.xpath("//h5[contains(text(),'Find the height')]/following-sibling::button")).getSize().getWidth());
		
		WebElement l=driver.findElement(By.xpath("//h5[contains(text(),'Mouse over')]/following-sibling::button"));
		String colB = l.getCssValue("background-color");
		System.out.println("Color before Mouse Over= "+colB);
		// Actions class with moveToElement()
	    Actions a = new Actions(driver);
	    a.moveToElement(l).perform();
	    String colA = l.getCssValue("background-color");
	    System.out.println("Color After mouse Over= "+colA);
	    if(colA.equals(colB))
	    {
	    	System.out.println("Color Not changed after Mouse over");
	    }
	    else
	    {
	    	System.out.println("Color changed after Mouse over");
	    }
	    
	    driver.findElement(By.xpath("//div[@class='col-6']/button")).click();
	    driver.findElement(By.xpath("//div[@class='ui-overlaypanel-content']/img")).click();
	    List<WebElement> findElements = driver.findElements(By.xpath("//h5[contains(text(),'How many rounded buttons')]/following-sibling::button"));
        System.out.println("Number of Rounded buttons = "+findElements.size());
	}

}
