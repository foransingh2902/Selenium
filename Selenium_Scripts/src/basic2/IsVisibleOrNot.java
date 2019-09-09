package basic2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsVisibleOrNot {

	public static void main(String[] args) {
		String currentDir = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", currentDir + "\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		// driver.findElement(By.xpath("//input[@type='email']")).sendKeys("foran.singh2902@gmail.com");
		// driver.findElement(By.xpath("//input[@type='password']")).sendKeys("2380450");
		System.out.println(driver.findElement(By.xpath("//form[@id='login_form']")).isDisplayed());
		System.out.println(driver.findElement(By.xpath("//form[@id='login_form']")).isEnabled());
		// isSelected() method is pre-dominantly used with radio buttons, dropdowns and
		// checkboxes.
		System.out.println(driver.findElement(By.xpath("//select[@aria-label='Day']")).isSelected());
		// System.out.println(driver.findElement(By.xpath("//form[@id='login_form']")).isSelected());
		// using a hidden element
		System.out.println(driver.findElement(By.xpath("//input[@type='hidden' and @name='timezone']")).isDisplayed());

	}

}
