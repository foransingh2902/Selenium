package basic2;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ScrollingDownByvisibilityOfElement {

	public static void main(String[] args) throws InterruptedException {
		String currentDir = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", currentDir + "\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://only-testing-blog.blogspot.com/2013/09/testing.html");
		driver.manage().window().maximize();
		// using select class
		// takes WebElement as input
		Select multiSelect = new Select(driver.findElement(By.xpath("//select[@name='FromLB']")));
		// JavaScriptExecutor is an interface
		JavascriptExecutor js = (JavascriptExecutor) driver;
		multiSelect.selectByValue("Spain");
		// WebElement firstSelected = multiSelect.getFirstSelectedOption();
		js.executeScript("arguments[0].scrollIntoView();", driver.findElement(By.xpath("//select[@name='FromLB']")));
		multiSelect.selectByValue("Italy");
		multiSelect.selectByValue("Greece");
		multiSelect.selectByValue("India");
		multiSelect.selectByValue("Germany");
		List<WebElement> selectedOptions = multiSelect.getAllSelectedOptions();
		Iterator<WebElement> it = selectedOptions.iterator();
		System.out.println("All selected options right now are :");
		while (it.hasNext()) {
			WebElement webElement = (WebElement) it.next();
			System.out.println(webElement.getText());

		}

	}

}
