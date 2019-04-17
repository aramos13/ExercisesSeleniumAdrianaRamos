package basicWeb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Exercise9 {

	public static void main(String[] args) {
		//***************1. Launch  new Firefox browser ********************
		
		System.setProperty("webdriver.gecko.driver","C:\\Ejecutables\\Selenium\\geckodriver-v0.11.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

	//***************2. Open URL http://demo.automationtesting.in/WebTable.html ********************	
		String baseURL= "http://demo.automationtesting.in/WebTable.html";
		driver.get(baseURL);
	
	//***************3. Get the value from cell and print it on the console ********************
		System.out.println(driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[1]/div/div[2]/div/div[5]")).getText());
	//***************4. Click on link 'Register' ********************
		driver.findElement(By.linkText("Register"));
	}

}
