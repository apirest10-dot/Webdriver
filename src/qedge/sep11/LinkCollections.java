package qedge.sep11;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class LinkCollections {
//launch any url
	//count no of links
	//print each link name
	//print each link url
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://naukri.com");
		Thread.sleep(5000);
		//get collection of links which are stored in html tag a
		List<WebElement> all_Links = driver.findElements(By.tagName("a"));
		System.out.println("No of links are::"+all_Links.size());
		for (WebElement each : all_Links) {
			System.out.println(each.getText());
			System.out.println(each.getDomProperty("href"));
		}
		driver.quit();
		}
}

