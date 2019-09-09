package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSignUp {

	public static void main(String[] args) throws InterruptedException {
		String currentDir = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", currentDir + "\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		driver.findElement(By.xpath("//input[@type='text' and @name='firstname']")).sendKeys("Foran");
		driver.findElement(By.xpath("//input[@type='text' and @name='lastname']")).sendKeys("Singh");
		driver.findElement(By.xpath("//input[@type='text' and @aria-label='Mobile number or email address']"))
				.sendKeys("9417292453");
		driver.findElement(By.xpath("//input[@type='password' and @aria-label='New password']")).sendKeys("2703072@Fs");
		driver.findElement(By.xpath("//select[@aria-label='Day' and @id='day']")).sendKeys("28");
		driver.findElement(By.xpath("//select[@aria-label='Month' and @id='month']")).sendKeys("Feb");
		driver.findElement(By.xpath("//select[@aria-label='Year' and @id='year']")).sendKeys("1992");
		driver.findElement(By.xpath("//label[text()='Male']")).click();
		driver.findElement(By.xpath("//form[@id='reg']")).submit();
		// Thread.sleep(4000);
		// driver.close();

	}

}
