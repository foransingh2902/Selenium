package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MyFirstFireFoxScript {
	public static void main(String[] args) throws InterruptedException {
		String path = "E:\\Selenium\\drivers\\geckodriver.exe";
		System.setProperty("webdriver.gecko.driver", path);
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.google.co.in");
		Thread.sleep(3000);
		driver.close();
	}
}
