package qedge.sep23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class ActionsMouse {
	public static void main(String[] args) throws Throwable {
	WebDriver driver = new ChromeDriver();
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	Thread.sleep(2000);
	Actions ac = new Actions(driver);
	ac.moveToElement(driver.findElement(By.xpath("(//img[@loading='lazy'])[25]")));
	ac.click().perform();
	Thread.sleep(2000);
	ac.moveToElement(driver.findElement(By.xpath("//div[contains(text(),'Electronics')]")));
	ac.click().perform();
	Thread.sleep(2000);
	ac.moveToElement(driver.findElement(By.xpath("(//div[contains(text(),'Home')])[1]")));
	ac.click().perform();
	Thread.sleep(2000);
	driver.quit();

	}

}
