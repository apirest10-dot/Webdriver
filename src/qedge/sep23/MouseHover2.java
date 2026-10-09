package qedge.sep23;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class MouseHover2 {
public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.tatacliq.com/");
		Thread.sleep(2000);
		Actions ac = new Actions(driver);
		ac.moveToElement(driver.findElement(By.xpath("(//div[@id='accordion-header-1'])[1]"))).perform();
		Thread.sleep(3000);
		ac.moveToElement(driver.findElement(By.xpath("//div[@aria-label=\"Men's Fashion button, Press right arrow or Enter to expand\"]")));
		ac.perform();
		Thread.sleep(3000);
		ac.moveToElement(driver.findElement(By.linkText("Shirts")));
		ac.click().perform();
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		ac.moveToElement(driver.findElement(By.xpath("(//div[@id='accordion-header-1'])[1]"))).perform();
		Thread.sleep(3000);
		ac.moveToElement(driver.findElement(By.xpath("//div[@aria-label=\"Kid's Fashion button, Press right arrow or Enter to expand\"]")));
		ac.perform();
		Thread.sleep(3000);
		ac.moveToElement(driver.findElement(By.xpath("//div[@class='DesktopHeader__lowerHeader']//a[4]")));
		ac.click().perform();
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		driver.quit();

	}

}
