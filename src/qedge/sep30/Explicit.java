package qedge.sep30;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class Explicit {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get("https://qa-practice.netlify.app/register");
	//create reference object for webdriverwait class
	WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(40));
	//wait until form link to be clickable
	mywait.until(ExpectedConditions.elementToBeClickable(By.linkText("Forms")));
	driver.findElement(By.linkText("Forms")).click();
	mywait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Login")));
	driver.findElement(By.linkText("Login")).click();
	mywait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));
	driver.findElement(By.id("email")).sendKeys("admin@admin.com");
	driver.findElement(By.id("password")).sendKeys("admin123");
	mywait.until(ExpectedConditions.elementToBeClickable(By.id("submitLoginBtn")));
	driver.findElement(By.id("submitLoginBtn")).sendKeys(Keys.ENTER);
	mywait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//h2[normalize-space()='SHOPPING CART']"), "SHOPPING CART"));
	String elementText = driver.findElement(By.xpath("//h2[normalize-space()='SHOPPING CART']")).getText();
	System.out.println(elementText);
	driver.quit();
	}
}
