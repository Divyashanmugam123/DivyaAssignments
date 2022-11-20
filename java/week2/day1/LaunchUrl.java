package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class LaunchUrl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Setup Browser driver
		WebDriverManager.chromedriver().setup();
		
		//Open Browser
		ChromeDriver driver = new ChromeDriver();
		
		//Launch url
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		//maximize
		driver.manage().window().maximize();
		
		

	}

}
