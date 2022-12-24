package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class ViewLeadPage extends BaseClass{

	public ViewLeadPage(ChromeDriver driver)
	{
		this.driver=driver;
	}
	public ViewLeadPage verifyLead() {
		
		String fname = driver.findElement(By.xpath("//div[@class='fieldgroup-body']/table/tbody/tr[2]/td[2]/span")).getText();
		if (fname.equalsIgnoreCase("Divya"))
		{
			System.out.println("Lead is created");
		}
		else
		{
			System.out.println("Lead is NOT created");
		}
		return this;
	}
}
