package basicWeb;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Exercise6 {

	public static void main(String[] args) {
		//***************1. Launch  new Firefox browser ********************
		
		System.setProperty("webdriver.gecko.driver","C:\\Ejecutables\\Selenium\\geckodriver-v0.11.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		//***************2. Open URL https://www.toolsqa.com/automation-practice-form/ ********************	
				String baseURL= "https://www.toolsqa.com/automation-practice-form/";
				driver.get(baseURL);
		
		/*
		 * ***************3. Select 'Continents' Drop Down (Use Id to identify the element)********************
		 */

				WebElement dropDownContinents = driver.findElement(By.id("Continents"));
				Select oSelectContinent = new Select(dropDownContinents);
				
		/*
		 * ***************4. Select Option 'Europe' (Use selectByIndex)********************
		 */
				oSelectContinent.selectByIndex(1);;
				
	
		/*
		 * ***************5. Select Option 'Africa' now (Use selectByVisibleText)********************
		 */
				oSelectContinent.selectByVisibleText("Africa");
				
		/*
		 * ***************6. Print all the options for the selected drop down and select
		 * one option of your choice********************
		 */		
				String sValue;
				List<WebElement>  elementOptions = oSelectContinent.getOptions();
		 		int iSize = elementOptions.size();
		 		for (int i=0; i<iSize; i++) {
		 			sValue = elementOptions.get(i).getText();
		 			System.out.println(sValue);
		 			
		 			if (i==3) {
		 				oSelectContinent.deselectByIndex(i);
		 				System.out.println("The option selected is" + sValue);
		 			}
		 		}
				
		
		//***************7. Close the browser ********************	
		 		driver.close();
				
	
				
	}

}
