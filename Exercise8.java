package basicWeb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Exercise8 {

	public static void main(String[] args) {
		//***************1. Launch  new Firefox browser ********************
		
		System.setProperty("webdriver.gecko.driver","C:\\Ejecutables\\Selenium\\geckodriver-v0.11.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
	
		//***************2. Open URL http://demo.automationtesting.in/WebTable.html ********************	
			String baseURL= "http://demo.automationtesting.in/WebTable.html";
			driver.get(baseURL);
		
		//***************3. Get the value from cell '7739995556' and print it on the console ********************
		   System.out.println(driver.findElement(By.id("1555510519774-1-uiGrid-0009-cell")).getText());
			
		//***************4. Click on link "Practice Site ********************
		   	driver.findElement(By.linkText("Practice Site"));
	}

}
