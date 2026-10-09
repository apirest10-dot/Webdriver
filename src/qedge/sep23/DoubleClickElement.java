package qedge.sep23;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class DoubleClickElement {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://qa-practice.netlify.app/double-click");
		Thread.sleep(2000);
		Actions ac = new Actions(driver);
		ac.moveToElement(driver.findElement(By.xpath("//button[@id='double-click-btn']")));
		ac.doubleClick().perform();
		String elementText = driver.findElement(By.xpath("//div[@id='double-click-result']")).getText();
		System.out.println(elementText);
		Thread.sleep(2000);
		driver.quit();
		}
}
