package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1_GoogleSearch {

	public static void main(String[] args) {
		googleSearch();

	}
	
	public static void googleSearch() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ayjain\\OneDrive - Gap\\SeleniumFramework\\Drivers\\chromeDriver\\chromedriver.exe");
		 
		WebDriver driver = new ChromeDriver();
	
		driver.get("https://google.com/");
		
		WebElement textBox = driver.findElement(By.name("q"));
		
		textBox.sendKeys("Life is Good");

	}

}
