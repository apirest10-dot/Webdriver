package qedge.sep23;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class RightClick {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		Thread.sleep(2000);
		Actions ac = new Actions(driver);
		ac.moveToElement(driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']")));
		ac.contextClick().perform();
		Thread.sleep(2000);
		ac.moveToElement(driver.findElement(By.xpath("//span[normalize-space()='Delete']")));
		ac.click().perform();
		Thread.sleep(2000);
		String alerttext = driver.switchTo().alert().getText();
		System.out.println(alerttext);
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		driver.quit();

	}

}
