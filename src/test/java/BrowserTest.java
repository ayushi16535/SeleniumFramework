import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ayjain\\OneDrive - Gap\\SeleniumFramework\\Drivers\\chromeDriver\\chromedriver.exe");
		 
		WebDriver driver = new ChromeDriver();
	
		driver.get("https://www.google.com/");
		
		WebElement textBox = driver.findElement(By.name("q"));
		
		textBox.sendKeys("Life is Good");
		
		textBox.sendKeys(Keys.RETURN);
		
		driver.close();
	}
}
