package qedge.sep16;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Alert1 {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
		//capture dialog message
		String alert_Message = driver.switchTo().alert().getText();
		System.out.println(alert_Message);
		Thread.sleep(5000);
		driver.switchTo().alert().accept();
		Thread.sleep(5000);
		String webText = driver.findElement(By.id("result")).getText();
		System.out.println(webText);
		driver.quit();
	
	}
}
