package wizeline_google;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GoogleSearch {

	WebDriver driver;
	
	@BeforeClass
	public void browser() {
		
		System.setProperty("webdriver.gecko.driver", "C://Drivers//geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://google.com");
        
	}
	@Test
	public void search() {
		driver.findElement(By.name("q")).sendKeys("Google");
		driver.findElement(By.xpath("(//*[contains(@value,'Buscar con Google')])[2]")).click();
		
	}
	
	@AfterClass
	public void closeBroswser() {
		driver.close();
	}
}
