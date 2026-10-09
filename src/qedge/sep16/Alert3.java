package qedge.sep16;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Alert3 {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
		String alert_message = driver.switchTo().alert().getText();
		System.out.println(alert_message);
		driver.switchTo().alert().sendKeys("Hello Akhilesh");
		Thread.sleep(5000);
		driver.switchTo().alert().accept();
		Thread.sleep(5000);
		String webtext = driver.findElement(By.id("result")).getText();
		System.out.println(webtext);
		Thread.sleep(5000);
		driver.quit();

	}

}
