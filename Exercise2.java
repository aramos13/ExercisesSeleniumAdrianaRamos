package basicWeb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Exercise2 {

	public static void main(String[] args) {
		//***************1. Launch  new Firefox browser ********************
		System.setProperty("webdriver.gecko.driver","C:\\Ejecutables\\Selenium\\geckodriver-v0.11.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		//***************2. Open store.demoqa.com ********************	
		//String baseURL ="http://www.google.com";
		//driver.get(baseURL);
		String baseURL= "https://shop.demoqa.com";
		driver.get(baseURL);
		
		//***************3. Get page Title name and Title length ********************
		String titlePrint = driver.getTitle();
		int titleLength = driver.getTitle().length();
		
		//***************4. Print page Title and Title length on the Eclipse Console ********************
		System.out.println("The title is: " + titlePrint);
		System.out.println("The title length is: " + titleLength);
		
		//***************5. Get page URL and verify if the it is a correct page opened ********************
		//***************6. Get page source(HTML Source code) and Page length ********************
		int pageLength = driver.getPageSource().length();
		
		//***************7. Print Page length on Eclipse console ********************
		System.out.println("The page legnth is " + pageLength);

		//***************8. Close the browser ********************
		driver.close();
	}

}
