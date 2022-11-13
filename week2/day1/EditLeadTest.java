package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLeadTest {
	
	
	
	public void funEditLead() throws InterruptedException{
		ChromeDriver driver = new ChromeDriver();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateLeadForm_description")).clear();
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Testing the EditLead screen Automation");
		driver.findElement(By.name("submitButton")).click();
		Thread.sleep(2000);
		System.out.println("Updated successfully- Resulting page= "+driver.getTitle());
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		CreateLead cl = new CreateLead();
		cl.funCreateLead();
		EditLeadTest el= new EditLeadTest();
		el.funEditLead();

	}

}
