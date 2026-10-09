package qedge.sep9;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Verify_Title {
public static void main(String[] args) throws Throwable {
		//create instance object
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//launch url
		driver.get("https://google.com");
		//suspend tool for 5 seconds
		Thread.sleep(5000);//hard time
		String Expected_Title ="google";
		String Actual_Title = driver.getTitle();
		if(Actual_Title.equalsIgnoreCase(Expected_Title))
		{
	System.out.println("Title is matching::"+Expected_Title+"    "+Actual_Title+"  "+"Test Pass");
		}
		else
		{
	System.out.println("Title is Not matching::"+Expected_Title+"    "+Actual_Title+"  "+"Test Fail");
		}
		driver.quit();
	}
}
