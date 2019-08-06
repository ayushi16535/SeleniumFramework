import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_Demo {

	WebDriver driver = null;
	
	@BeforeTest
	public void setUpTest() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ayjain\\OneDrive - Gap\\SeleniumFramework\\Drivers\\chromeDriver\\chromedriver.exe");
		 
		driver = new ChromeDriver();
	
	}
	
	@Test
	public void googleSearch() {
		
		driver.get("https://www.google.com/");
		
		WebElement textBox = driver.findElement(By.name("q"));
		
		textBox.sendKeys("Life is Good");
		
		textBox.sendKeys(Keys.RETURN);
		
	}
	
	@AfterTest
	public void tearDownTest() {
		
		driver.close();
		driver.quit();
		System.out.println("Test Completed Successfully");
	}
}
