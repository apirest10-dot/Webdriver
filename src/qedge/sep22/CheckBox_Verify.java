package qedge.sep22;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class CheckBox_Verify {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		Thread.sleep(5000);
		//verify checkbox is checked or not
		WebElement checkbox = driver.findElement(By.id("remember"));
		boolean checkbox_status = checkbox.isSelected();
		System.out.println("Before checking::"+checkbox_status);
		Thread.sleep(5000);
		//uncheck from check
		checkbox.click();
		WebElement checkbox1 = driver.findElement(By.id("remember"));
		boolean checkbox_status1 = checkbox1.isSelected();
		System.out.println("After uncheck::"+checkbox_status1);
		Thread.sleep(5000);
		driver.quit();

	}

}
