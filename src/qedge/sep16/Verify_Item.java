package qedge.sep16;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
public class Verify_Item {
public static void main(String[] args) throws Throwable {
		String Expected_Item="crafts";
		boolean Item_Exist =false;
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.ebay.com/");
		Thread.sleep(5000);
		Select listbox = new Select(driver.findElement(By.id("gh-cat")));
		//get all options from listbox
		List<WebElement> All_Options = listbox.getOptions();
		System.out.println("No of options are:"+All_Options.size());
		for (WebElement each : All_Options) {
			String Actual_Items = each.getText();
			System.out.println(Actual_Items);
			each.click();
			Thread.sleep(500);
			if(Actual_Items.equalsIgnoreCase(Expected_Item))
			{
				Item_Exist=true;
				break;
			}
		}
		if(Item_Exist)
		{
			System.out.println(Expected_Item+"   "+"Item Found in Listbox");
		}
		else
		{
			System.out.println(Expected_Item+"   "+"Item Not Found in Listbox");
		}
		
		Thread.sleep(5000);
		driver.quit();
	}
}
