package qedge.sep11;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class GetCommands {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://google.com");
		Thread.sleep(5000);
		//capture gmail text in google page
		String gmailText = driver.findElement(By.linkText("Gmail")).getText();
		System.out.println(gmailText);
		//capture gmail url
		String gmailUrl = driver.findElement(By.linkText("Gmail")).getDomAttribute("href");
		System.out.println(gmailUrl);
		driver.quit();
	}
}
