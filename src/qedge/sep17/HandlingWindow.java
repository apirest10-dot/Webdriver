package qedge.sep17;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class HandlingWindow {
public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://gmail.com");
		Thread.sleep(5000);
		//click help link 
		driver.findElement(By.linkText("Help")).click();
		Set<String> allwins = driver.getWindowHandles();
		Object brw [] =allwins.toArray();
		String parent= brw[0].toString();
		String child =brw[1].toString();
		//switch to child window and print collection og links and print each link name
		driver.switchTo().window(child);
		Thread.sleep(5000);
		List<WebElement> all_Links = driver.findElements(By.tagName("a"));
		System.out.println("No of links are::"+all_Links.size());
		for (WebElement each : all_Links) {
			System.out.println(each.getText().trim());
		}
		Thread.sleep(5000);
		driver.close();
		driver.switchTo().window(parent);
		System.out.println("Parent Window Title:::"+driver.getTitle());
		Thread.sleep(5000);
		driver.findElement(By.id("identifierId")).sendKeys("pranga2010");
		Thread.sleep(5000);
		driver.quit();

	}
}
