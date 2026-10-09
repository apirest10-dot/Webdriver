package qedge.sep11;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class ValidateLogin {
		public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://orangehrm.qedgetech.com/");
		Thread.sleep(5000);
		//store username textbox into Webelement
		WebElement username = driver.findElement(By.xpath("//input[@id='txtUsername']"));
		username.clear();
		username.sendKeys("Admin");
		//capture username value
		String user_value = username.getDomProperty("value");
		System.out.println(user_value);
		//store password into webelement
		WebElement password = driver.findElement(By.xpath("//input[@id='txtPassword']"));
		password.clear();
		password.sendKeys("Qedge123!@#");
		//capture password value
		String pass_Value = password.getDomProperty("value");
		System.out.println(pass_Value);
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		Thread.sleep(2000);
		String Expected ="dashboard";
		String Actual = driver.getCurrentUrl();
		if(Actual.endsWith(Expected))
		{
			System.out.println("Valid Login Deatils::"+Expected+"   "+Actual+"  "+"Login Pass");
		}
		else
		{
			//capture Error message
			String Error_Message = driver.findElement(By.xpath("//span[@id='spanMessage']")).getText();
			System.out.println(Error_Message+"  "+Expected+"   "+Actual+"   "+"Login Fail");
		}
		Thread.sleep(5000);
		driver.quit();
		
		}
}
