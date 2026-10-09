package qedge.sep15;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
public class HandlingListbox1 {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.ebay.com/");
		Thread.sleep(5000);
		//to access select class method store listbox into select class
		Select element = new Select(driver.findElement(By.id("gh-cat")));
		//verify listbox is single or multi selection
		boolean value = element.isMultiple();
		System.out.println(value);
		//select by contains text
		element.selectByContainsVisibleText("Com");
		Thread.sleep(5000);
		//select by text
		element.selectByVisibleText("Dolls & Bears");
		Thread.sleep(5000);
		//select by value
		element.selectByValue("11700");
		Thread.sleep(5000);
		//select by index
		element.selectByIndex(10);
		Thread.sleep(5000);
		driver.quit();
		}
}
