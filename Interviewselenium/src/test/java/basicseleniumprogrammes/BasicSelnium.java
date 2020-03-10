package basicseleniumprogrammes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicSelnium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "/src/main/resources/Executables/chromedriver_linux/chromedriver.exe");
		// Initialize browser
		WebDriver driver=new ChromeDriver();

		// Open facebook
		driver.get("http://www.google.com");	
		
		
		
		
		driver.quit();
		
		
		
		
		
		
	}

	
}
