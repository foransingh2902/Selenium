package nodes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Nodes3 {

	public static void main(String[] args) throws InterruptedException {
		// Parent Node
		String currentDir = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", currentDir + "\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		// if we didn't specify input[1] then it will take the one
		// which comes above the whole block.
		String str = driver
				.findElement(
						By.xpath("//*[@type='radio' and @name='sex']//parent::span//parent::span//parent::div/div"))
				.getText();
		System.out.println("The string returned is :" + str);
		Thread.sleep(4000);
		driver.close();
	}

}
