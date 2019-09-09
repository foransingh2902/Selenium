package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class QuestionGetTitle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String p = "E:\\Selenium\\drivers\\geckodriver.exe";
		System.setProperty("webdriver.gecko.driver", p);
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.facebook.com");
		String actual = driver.getTitle();
		System.out.println("the name extracted is :" + actual);
		String name = "facebook";
		if (name.equalsIgnoreCase(actual)) {
			System.out.println("the names match");
		} else {
			System.out.println("the names don't match");
		}
		System.out.println("Current URL in browser:" + driver.getCurrentUrl());
	}

}
