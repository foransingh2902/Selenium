package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoLogin {
	public static void main(String[] args) throws InterruptedException {
		String currentDir = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", currentDir + "\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("foran.singh2902@gmail.com");
		// use your valid password with ID
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("*****");
		driver.findElement(By.xpath("//form[@id='login_form']")).submit();
		Thread.sleep(10000);
		// use your name as displayed in your FaceBook account
		if (driver.findElement(By.xpath("//span[text()='Foran']")).isDisplayed()) {
			System.out.println("Script Passes");
		} else
			System.out.println("Script Fails");
	}
}
