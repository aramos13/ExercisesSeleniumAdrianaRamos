package basicWeb;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Exercise7 {

	public static void main(String[] args) {
		//***************1. Launch  new Firefox browser ********************
		
		System.setProperty("webdriver.gecko.driver","C:\\Ejecutables\\Selenium\\geckodriver-v0.11.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		//***************2. Open URL https://www.toolsqa.com/automation-practice-form/ ********************	
				String baseURL= "https://www.toolsqa.com/automation-practice-form/";
				driver.get(baseURL);
				
		//***************3. Select 'Selenium Commands' Multiple selection box (Use Name locator to identify element) ********************

				WebElement dropDownContinents = driver.findElement(By.name("selenium_commands"));
				Select oSelectSelenium = new Select(dropDownContinents);
				
		//***************4. Select option 'Browser Commands' and then deselect it (Use selectByIndex and deselectByIndex) ********************
				oSelectSelenium.selectByIndex(0);
				oSelectSelenium.deselectByIndex(0);
				
		//***************5. Select option 'Navigation Commands' and then deselect it (Use selectByVisibleText and deselectByVisibleText))**********
				oSelectSelenium.selectByVisibleText("Navigation Commands");
				oSelectSelenium.deselectByVisibleText("Navigation Commands");
		
		//***************6. Print and select all the options for the selected Multiple selection list ****************
				String sValue ;
				
				List<WebElement>  elementOptions = oSelectSelenium.getOptions();
		 		int iSize = elementOptions.size();
		 		for (int i=0; i<iSize; i++) {
		 			oSelectSelenium.selectByIndex(i);
		 			sValue = elementOptions.get(i).getText();
		 			System.out.println(sValue);
		 			
		 		}
		//***************7. Deselect all option ******************
		 		
		 		for (int i=0; i<iSize; i++) {
		 			oSelectSelenium.deselectByIndex(i);
		 			sValue = elementOptions.get(i).getText();
		 			
		 		}
		 		
				
		//***************8. Close the browser ******************
				driver.close();
	}

}
