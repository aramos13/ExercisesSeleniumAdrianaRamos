package basicWeb;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Exercise10 {

	public static void main(String[] args) {
		//***************1. Launch  new Firefox browser ********************
		System.setProperty("webdriver.gecko.driver","C:\\Ejecutables\\Selenium\\geckodriver-v0.11.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
				
		//***************2. Open URL https://www.toolsqa.com/automation-practice-switch-windows/ ********************
		String baseURL= "https://www.toolsqa.com/automation-practice-switch-windows/";
		driver.get(baseURL);
				
		//***************3. Get Windows name (Use GetWindowsHandles command) ********************
		String name = driver.getWindowHandle();
		System.out.println(name);
		
		//***************4. Click on Button "New message Window", it ill open a Pop up Window***************
		driver.findElement(By.id("New Message Window")).click();;
	
					
		//***************5. Get all the Windows name (Use GetWindowHandles command)**************
		
		Set<String> windowsName = driver.getWindowHandles();
		System.out.println(windowsName);
		//***************6. Close the Pop Up Window (Use Switch Command to shift window)*********
		
		driver.close();
	}

}
