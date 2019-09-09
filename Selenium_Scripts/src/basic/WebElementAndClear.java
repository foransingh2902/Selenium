package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementAndClear {

	public static void main(String[] args) throws InterruptedException {
		String currentDir = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", currentDir + "\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		// driver.findElements(By.xpath("//select[@aria-label='Month']"));
		WebElement name = driver.findElement(By.xpath("//input[@type='email']"));
		name.click();
		Thread.sleep(4000);
		name.sendKeys("Foran");
		Thread.sleep(4000);
		name.clear();
		name.sendKeys("foran.singh");
		Thread.sleep(4000);
		// this will append to the text above
		name.sendKeys("2902@gmail.com");
	}

}
