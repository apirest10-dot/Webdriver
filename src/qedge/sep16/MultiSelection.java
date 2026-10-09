package qedge.sep16;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class MultiSelection {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://demoqa.com/select-menu");
		Thread.sleep(5000);
		//store listbox into select class
		Select dropdown = new Select(driver.findElement(By.id("cars")));
		//verify dropdown is single or multi selection
		boolean status = dropdown.isMultiple();
		System.out.println(status);
		for(int i=0;i<=3;i++)
		{
			Thread.sleep(5000);
			dropdown.selectByIndex(i);
		}
		//deslect option with value
		dropdown.deselectByValue("volvo");
		Thread.sleep(5000);
		dropdown.deselectByVisibleText("Audi");
		Thread.sleep(5000);
		dropdown.deselectByIndex(1);
		Thread.sleep(5000);
		dropdown.deselectAll();
		Thread.sleep(5000);
		driver.quit();
		}
}
