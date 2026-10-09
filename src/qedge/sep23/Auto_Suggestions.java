package qedge.sep23;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Auto_Suggestions {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://google.com");
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys("Selenium openings");
		Thread.sleep(2000);
		//get collection of auto suggestions
		List<WebElement> auto_List = driver.findElements(By.xpath("//ul[@role=\"listbox\"]//li"));
		System.out.println("No of auto List::"+auto_List.size());
		for (WebElement each : auto_List) {
			System.out.println(each.getText());
		}
		Thread.sleep(2000);
		driver.quit();
	}
}
