package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicPath {

	public static void main(String[] args) {
		// will give current directory
		String directory = System.getProperty("user.dir");
		// System.out.println(directory);
		String driverLocation = "\\Drivers\\chromedriver.exe";
		String path = directory + driverLocation;
		System.out.println(path);
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		// alternate way is to paste driver.exe in bin of jre. Then we don't have to det
		// the property

		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("bebo");

		/*
		 * driver.findElement(By.xpath("//*[@id='email'] [@data-testid=\"royal_email\"]"
		 * )).sendKeys("foran");
		 */
		// driver.findElement(By.xpath("//input[contains(@id,'email')]")).sendKeys("bebo");
		// driver.findElement(By.xpath("//a[text()='Forgotten account?']")).click();
		// driver.findElement(By.xpath("//input[@id='email' and
		// @data-testid=\"royal_email\"]")).sendKeys("foran");

	}

}
