package qedge.sep9;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Verigy_Url {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//driver.get("http://gmail.com");
		driver.get("http://orangehrm.qedgetech.com/");
		Thread.sleep(5000);
		String Expected ="https://";
		String Actual = driver.getCurrentUrl();
		if(Actual.startsWith(Expected))
		{
			System.out.println("Url is Secured::"+Expected+"    "+Actual+"  "+"Test Pass");
		}
		else
		{
			System.out.println("Url is Not Secured::"+Expected+"    "+Actual+"  "+"Test Fail");
		}
		driver.quit();
	}
}
