package expediaTest;

import junit.framework.Assert;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import reusableComponents.ReusableMethods;

@SuppressWarnings("deprecation")
public class TestClickFlights {
	
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
	public void testBundleDealTab(){
		
		try{
			returnValue = reuse.testBundleDealsTabState("");
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
			
			returnValue = reuse.testFlightsTabState("on");
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
	
	@Test
	public void testFlyingFrom(){
		try{
			
			Assert.assertTrue(driver.findElement(By.cssSelector("#flight-origin")).isDisplayed());			
			
		}
		catch(Throwable t){
			ec.addError(t);
		}
	}
	
	@Test
	public void testFlyingTo(){
		try{
			
			Assert.assertTrue(driver.findElement(By.cssSelector("#flight-destination")).isDisplayed());			
			
		}
		catch(Throwable t){
			ec.addError(t);
		}
	}
	
	@Test
	public void testDepartingDate(){
		try{
			
			Assert.assertTrue(driver.findElement(By.cssSelector("#flight-departing")).isDisplayed());			
			
		}
		catch(Throwable t){
			ec.addError(t);
		}
	}
	
	@Test
	public void testReturningDate(){
		try{
			
			Assert.assertTrue(driver.findElement(By.cssSelector("#flight-returning")).isDisplayed());			
			
		}
		catch(Throwable t){
			ec.addError(t);
		}
	}
	
	@Test
	public void testAdultsDropdown(){
		try{
			
			Assert.assertTrue(driver.findElement(By.cssSelector("#flight-adults")).isDisplayed());			
			
		}
		catch(Throwable t){
			ec.addError(t);
		}
	}
	
	@Test
	public void testChildrenDropdown(){
		try{
			
			Assert.assertTrue(driver.findElement(By.cssSelector("#flight-children")).isDisplayed());			
			
		}
		catch(Throwable t){
			ec.addError(t);
		}
	}
	
	@Test
	public void testAddHotelChkbox(){
		try{
			
			Assert.assertTrue(driver.findElement(By.cssSelector("#flight-add-hotel-checkbox")).isDisplayed());			
			
		}
		catch(Throwable t){
			ec.addError(t);
		}
	}
	
	@Test
	public void testAddCarChkbox(){
		try{
			
			Assert.assertTrue(driver.findElement(By.cssSelector("#flight-add-car-checkbox")).isDisplayed());			
			
		}
		catch(Throwable t){
			ec.addError(t);
		}
	}
	
	
	@AfterClass
	public static void closeBrowser (){
		driver.quit();
	}
	
		
}
