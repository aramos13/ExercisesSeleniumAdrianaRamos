package basicWeb;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Exercise5 {

	public static void main(String[] args) {
		//***************1. Launch  new Firefox browser ********************
		
		System.setProperty("webdriver.gecko.driver","C:\\Ejecutables\\Selenium\\geckodriver-v0.11.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		//***************2. Open URL https://www.toolsqa.com/automation-practice-form/ ********************	
				String baseURL= "https://www.toolsqa.com/automation-practice-form/";
				driver.get(baseURL);
				
		/*
		 * ***************3. Challenge One- Select the deselected Radio button (female)for category Sex
		 * (Use isSelected method)********************
		 */
			
				List<WebElement> oRadioButton =driver.findElements(By.name("Sex"));
				boolean bselected = oRadioButton.get(0).isSelected();
				
				if(bselected==true) {
					oRadioButton.get(1).click();
				}else {
					oRadioButton.get(0).click();
				}
				
		/*
		 * ***************4. Challenge two- Select the Third Radio button for category 'Years of Exp'
		 * (Use Id attribute to select Radio button)********************
		 */
				WebElement radioButtonYear = driver.findElement(By.id("exp-2"));
				radioButtonYear.click();
				
				
		/*
		 * ***************5. Challenge three- Check the check Box "Automation Tester" for category "Profession"
		 * (Use value attribute to match the selection)********************
		*/
				
				WebElement checkBoxProfession = driver.findElement(By.cssSelector("Input[value='Automation Tester']"));
				checkBoxProfession.click();
				
		/*
		* ***************6. Challenge four- Check the check Box "Selenium IDE" for category "Automation tool"
		* (Use cssSelector)********************
		*/
				
				WebElement checkBoxSelenium = driver.findElement(By.cssSelector("Input[value='Selenium IDE']"));
				checkBoxSelenium.click();
	}
}
