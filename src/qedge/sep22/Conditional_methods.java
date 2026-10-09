package qedge.sep22;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Conditional_methods {
public static void main(String[] args) throws Throwable {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://google.com");
		Thread.sleep(5000);
		try {
			if(driver.findElement(By.linkText("Demo")).isDisplayed())
			{
				System.out.println("Demo Link Found in Google page");
			}
		} catch (Throwable t) {
			{
				System.out.println("Demo Link Not Found in Google page");
			}
			driver.quit();
		}
		}
}
