package basic;

import java.io.File;
import java.io.IOException;
import java.time.LocalTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TakingScreenshot {

	public static void main(String[] args) throws InterruptedException, IOException {
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
		LocalTime lt = LocalTime.now();
		String temp = lt + "";
		String name = temp.replace(":", "-");
		System.out.println(name);
		// Converting Webdriver object to TakeScreenshot
		TakesScreenshot ts = ((TakesScreenshot) driver);
		driver.manage().window().maximize();
		File srcFile = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile, new File("C:\\Users\\Dell\\Desktop\\" + name + ".jpg"));
		driver.close();

		// Thread.sleep(4000); FileUtils
		// driver.close();
	}

}
