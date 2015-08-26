package expediaTest;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import reusableComponents.ReusableMethods;

public class TestFlightBooking {

	String expectedData = "";
	String actualData = "";
	boolean returnValue = false;
	
	static WebDriver driver = new FirefoxDriver();
	ReusableMethods reuse = new ReusableMethods(driver);
	
	@Rule
	public ErrorCollector ec = new ErrorCollector();


	@BeforeClass
	public static void launchWebsite (){
		driver.get("http://www.expedia.com/");
		driver.findElement(By.cssSelector("#tab-flight-tab")).click();
	}
	
	@Test
	public void testBooking() throws Exception{
		driver.findElement(By.cssSelector("//*[@id='flight-origin']")).sendKeys("ORD");
		driver.findElement(By.cssSelector("//*[@id='flight-destination']")).sendKeys("HNL");
		reuse.datePicker("10", "10", "2015");
		reuse.datePicker("15", "10", "2015");
		
	}
	
	
	@AfterClass
	public static void closeBrowser (){
		driver.quit();
	}
}
