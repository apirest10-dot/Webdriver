package qedge.sep15;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Navigation_Methods {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("http://google.com");
		System.out.println("Page Title[1]:"+driver.getTitle());
		Thread.sleep(5000);
		//click on gmail link
		driver.findElement(By.linkText("Gmail")).click();
		System.out.println("Page Title[2]:"+driver.getTitle());
		Thread.sleep(5000);
		//click back button
		driver.navigate().back();
		System.out.println("Page Title[3]:"+driver.getTitle());
		Thread.sleep(5000);
		//click forwrad button
		driver.navigate().forward();
		System.out.println("Page Title[4]:"+driver.getTitle());
		Thread.sleep(5000);
		//reload page
		driver.navigate().refresh();
		Thread.sleep(5000);
		driver.quit();
}
}
