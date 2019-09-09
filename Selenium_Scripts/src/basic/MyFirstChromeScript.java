package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyFirstChromeScript {
	public static void main(String[] args) throws InterruptedException {
		// path to the exe file for Chrome
		String path = "E:\\Selenium\\drivers\\chromedriver.exe";
		// setPropert(property,value)
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.co.in");
		driver.close();
		Thread.sleep(10000);
		driver.quit();
	}
}
