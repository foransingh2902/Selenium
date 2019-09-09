package basic2;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectDemo {

	public static void main(String[] args) throws InterruptedException {
		String currentDir = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", currentDir + "\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://only-testing-blog.blogspot.com/2013/09/testing.html");
		driver.manage().window().maximize();
		// using select class
		// takes WebElement as input
		Select multiSelect = new Select(driver.findElement(By.xpath("//select[@name='FromLB']")));
		multiSelect.selectByValue("Spain");
		multiSelect.selectByValue("Italy");
		Thread.sleep(4000);
		multiSelect.deselectAll();
		Thread.sleep(4000);
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
		Thread.sleep(4000);
		multiSelect.deselectByValue("India");
		Thread.sleep(2000);
		// will return a list of WebElements
		List<WebElement> allOptions = multiSelect.getOptions();
		it = allOptions.iterator();
		System.out.println("All Options Available are :");
		while (it.hasNext()) {
			WebElement webElement = (WebElement) it.next();
			System.out.println(webElement.getText());

		}
		WebElement firstSelectedElement = multiSelect.getFirstSelectedOption();
		System.out.println("first selected element :" + firstSelectedElement.getText());
		driver.findElement(By.xpath("//input[@value='->']")).click();
		Thread.sleep(4000);
		driver.close();

	}

}
