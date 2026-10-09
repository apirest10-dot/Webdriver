package qedge.sep8;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Browsers {
	public static void main(String[] args) throws Throwable{
		WebDriver driver = new FirefoxDriver();
		driver.get("http://flipkart.com");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		Thread.sleep(5000);
		//get title of the page along with length
		String page_title = driver.getTitle();
		System.out.println(page_title);
		System.out.println(page_title.length());
		//get url of the page along with length
		String str_Url = driver.getCurrentUrl();
		System.out.println(str_Url);
		System.out.println(str_Url.length());
		String element = driver.findElement(By.id("")).getDomAttribute("propertyname");
		driver.quit();
	
	}

}
