package samplePackage;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.way2automation.com/demo.html");

		driver.findElement(By.xpath("//*[@id='wrapper']/div[2]/div[2]/div[5]/ul/li/a/figure/img")).click();
		
		Set <String> windowHandlers = driver.getWindowHandles();
		Iterator <String> handlerID = windowHandlers.iterator();
		//String parentID = handlerID.next();
		String childID = handlerID.next();
		
		driver.switchTo().window(childID);
		
		driver.findElement(By.name("name")).sendKeys("Selenium");
		driver.findElement(By.name("phone")).sendKeys("2241237890");
		driver.findElement(By.name("email")).sendKeys("abc@sampleemail.com");
		driver.findElement(By.name("city")).sendKeys("New York");
		driver.findElement(By.xpath("//*[@id='load_form']/fieldset[6]/input")).sendKeys("SeleniumTester");
		driver.findElement(By.xpath("//*[@id='load_form']/fieldset[7]/input")).sendKeys("Password1");
		
		Select dropdown = new Select(driver.findElement(By.xpath("//*[@id='load_form']/fieldset[4]/select")));
		dropdown.selectByVisibleText("United States");
		
		driver.findElement(By.xpath("html/body/div[4]/div/div/div/div/div/form/div/div[2]/input")).click();
		
		//driver.switchTo().window(parentID);
		
	}
	

}
