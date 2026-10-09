package qedge.sep24;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class JavaScript2 {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("window.location='https://tatacliq.com'");
		Thread.sleep(5000);
		//scroll top to bottom 
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(5000);
		//scroll bottom to top
		js.executeScript("window.scrollTo(document.body.scrollHeight,0)");
		Thread.sleep(5000);
		//scroll to certain pixel vertically
		js.executeScript("window.scrollBy(0,4000)");
		Thread.sleep(5000);
		driver.quit();

	}

}
