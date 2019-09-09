package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigateScript {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String p = "E:\\Selenium\\drivers\\geckodriver.exe";
		System.setProperty("webdriver.gecko.driver", p);
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.google.co.in");
		driver.navigate().to("http://www.facebook.com");
		driver.navigate().back();
		driver.navigate().refresh();

		driver.manage().window().fullscreen();// f11
		driver.manage().window().maximize(); // full window
	}

}
