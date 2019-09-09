package basic;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementAndFindElements {

	public static void main(String[] args) {
		String path = "E:\\Selenium\\drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		// driver.findElement(By.id("email")).sendKeys("bebo");
		// driver.findElement(By.className("inputtext")).sendKeys("foran");
		// driver.findElement(By.name("email")).sendKeys("bebo");
		// System.out.println(driver.findElement(By.tagName("label")).getText());
		// driver.findElement(By.linkText("Forgotten account?")).click();
		// driver.findElement(By.partialLinkText("Forgo")).click();
		// List<WebElement> li = driver.findElements(By.tagName("a"));
		// System.out.println("size of WebElement List :" + li.size());
		List<WebElement> li = driver.findElements(By.tagName("a"));
		System.out.println("size of WebElement List :" + li.size());
		Iterator<WebElement> iterator = li.iterator();
		while (iterator.hasNext()) {
			System.out.println("Link " + iterator.next().getText());
			// System.out.println(iterator.next());
			
		}

	}

}
