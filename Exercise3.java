package basicWeb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Exercise3 {
	
	public static void main(String[] args) {
		//***************1. Launch  new Firefox browser ********************
		System.setProperty("webdriver.gecko.driver","C:\\Ejecutables\\Selenium\\geckodriver-v0.11.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
	
		//***************2. Open URL https://www.toolsqa.com/automation-practice-form/ ********************	
		String baseURL= "https://www.toolsqa.com/automation-practice-form/";
		driver.get(baseURL);
	
		//***************3. Type Name & Last Name (Use name locator) ********************
		
		WebElement  element = driver.findElement(By.name("firstname"));
		element.sendKeys("locator");
		
		driver.findElement(By.className("lastname"));
		element.sendKeys("Ramos");
		
		
		
		//***************4. Click on Submit button (Use ID Locator) ********************
		driver.findElement(By.id("submit"));
		element.submit();
	}
}
