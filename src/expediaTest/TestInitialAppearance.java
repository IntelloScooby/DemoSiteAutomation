package expediaTest;

import junit.framework.Assert;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import reusableComponents.ReusableMethods;

@SuppressWarnings("deprecation")
public class TestInitialAppearance {

	String expectedData = "";
	String actualData = "";
	boolean returnValue = false;
	static WebDriver driver = new FirefoxDriver();
	
	
	@Rule
	public ErrorCollector ec = new ErrorCollector();
	
	ReusableMethods reuse = new ReusableMethods(driver);
	
	@BeforeClass
	public static void launchWebsite (){
		driver.get("http://www.expedia.com/");
	}
	
	@Test
	public void testBundleDealTab(){
		
		try{
			returnValue = reuse.testBundleDealsTabState("on");
			Assert.assertTrue(returnValue);
			
		}
		catch (Throwable t){
			ec.addError(t);
		}
		
	}
	
	@Test
	public void testCarTab(){
		
		try{
			
			returnValue = reuse.testCarsTabState("");
			Assert.assertTrue(returnValue);
			
		}
		catch (Throwable t){
			ec.addError(t);
		}
		
	}
	
	@Test
	public void testCruiseTab(){
		
		try{
			
			returnValue = reuse.testCruisesTabState("");
			Assert.assertTrue(returnValue);
			
		}
		catch (Throwable t){
			ec.addError(t);
		}
		
	}
	
	@Test
	public void testFlightsTab(){
		
		try{
			
			returnValue = reuse.testFlightsTabState("");
			Assert.assertTrue(returnValue);
			
		}
		catch (Throwable t){
			ec.addError(t);
		}
		
	}
	
	@Test
	public void testHotelsTab(){
		
		try{
			
			returnValue = reuse.testHotelsTabState("");
			Assert.assertTrue(returnValue);
			
		}
		catch (Throwable t){
			ec.addError(t);
		}
		
	}
	
	@Test
	public void testThingsToDoTab(){
		
		try{
			
			returnValue = reuse.testThingsToDoTabState("");
			Assert.assertTrue(returnValue);
			
		}
		catch (Throwable t){
			ec.addError(t);
		}
		
	}
	
	
	
	@AfterClass
	public static void closeBrowser (){
		driver.quit();
	}
	
}
