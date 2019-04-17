package basicWeb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Exercise4 {

	public static void main(String[] args) {
		//***************1. Launch  new Firefox browser ********************
		
		System.setProperty("webdriver.gecko.driver","C:\\Ejecutables\\Selenium\\geckodriver-v0.11.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
			
				//***************2. Open URL https://www.toolsqa.com/automation-practice-form/ ********************	
				String baseURL= "https://www.toolsqa.com/automation-practice-form/";
				driver.get(baseURL);
			
				/*
				 * /***************3. Click on the Link "Partial Link Test (Use 'patialLinkTest'
				 * locator and search by 'Partial'word) ********************
				 */
				
				WebElement  element = driver.findElement(By.linkText("Partial Link Test"));
				element.clear();
								
				/*
				 * ***************4. identify submit button with 'tagName', convert it in to String
				 * and print it on the console ********************
				*/
				WebElement tagName = driver.findElement(By.tagName("Button"));
				System.out.println("The Tag name is " + tagName.toString());
				
				//***************5. Click on the Link "Link Test" (Use 'linkTest' locator) ********************
				driver.findElement(By.linkText("linkTest"));

	}

}
