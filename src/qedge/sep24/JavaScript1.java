package qedge.sep24;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class JavaScript1 {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		JavascriptExecutor js =(JavascriptExecutor)driver;
		//launch url using JS
		js.executeScript("window.location='https://tatacliq.com'");
		Thread.sleep(5000);
		//print page title and length of title
		String page_Title = js.executeScript("return document.title").toString();
		System.out.println(page_Title);
		System.out.println(page_Title.length());
		//print page url and length of url
		String Str_Url = js.executeScript("return document.URL").toString();
		System.out.println(Str_Url);
		System.out.println(Str_Url.length());
		//print domain name and length of domain name
		String domain = js.executeScript("return document.domain").toString();
		System.out.println(domain);
		System.out.println(domain.length());
		Thread.sleep(5000);
		driver.quit();

	}

}
