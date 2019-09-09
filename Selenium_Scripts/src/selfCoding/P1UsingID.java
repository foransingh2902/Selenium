package selfCoding;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P1UsingID {

	public static void main(String[] args) {
		// this will give path to the current project
		String currentDir = System.getProperty("user.dir");
		// E:\Selenium-Workspace\Selenium_Scripts
		System.setProperty("webdriver.chrome.driver", currentDir + "\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("news");
		driver.findElement(By.xpath("//input[@class='gNO89b']")).submit();
		driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div[1]/div/div/div[1]/a")).click();
		driver.findElement(By.xpath("//a[@title='TV']")).click();
		driver.navigate().back();
		driver.navigate().back();
		driver.navigate().back();
		driver.close();
	}

}
