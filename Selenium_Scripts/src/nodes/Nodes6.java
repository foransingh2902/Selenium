package nodes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Nodes6 {

	public static void main(String[] args) throws InterruptedException {
		// Preceding-sibling
		String currentDir = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", currentDir + "\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		driver.findElement(By.xpath("// a[text()='Business']//preceding-sibling::a")).click();
		Thread.sleep(4000);
		driver.close();
	}

}
