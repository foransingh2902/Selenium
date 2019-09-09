package nodes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Nodes1 {

	public static void main(String[] args) throws InterruptedException {
		// Following Node
		String currentDir = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", currentDir + "\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		driver.findElement(By.xpath("//*[@type='email']//following::input")).sendKeys("123");
		Thread.sleep(2000);
		driver.close();
		// //*[@type='email']//following::label/input
	}

}
