package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownOnPage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String currentDir = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", currentDir + "\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		WebElement dayDD = driver.findElement(By.xpath("//select[@aria-label='Day']"));
		Select day = new Select(dayDD);
		day.selectByIndex(28);
		WebElement monthDD = driver.findElement(By.xpath("//select[@aria-label='Month']"));
		Select month = new Select(monthDD);
		month.selectByVisibleText("Feb");
		Select year = new Select(driver.findElement(By.xpath("//select[@aria-label='Year']")));
		year.selectByValue("1992");
		Thread.sleep(4000);
		driver.close();

	}

}
