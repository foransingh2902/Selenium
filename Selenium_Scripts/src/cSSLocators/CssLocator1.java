package cSSLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssLocator1 {

	public static void main(String[] args) {
		String currentDir = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", currentDir + "\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		// . is for class # for ID
		driver.findElement(By.cssSelector("input.inputtext#email")).sendKeys("foran.singh2902@gmail.com");
		driver.findElement(By.cssSelector("input[id*=pa]")).sendKeys("12345");
		// Starts with
		driver.findElement(By.cssSelector("input[name^=firs]")).sendKeys("Foran");
		// Ends With
		driver.findElement(By.cssSelector("input[name$='astname']")).sendKeys("Singh");

	}

}
