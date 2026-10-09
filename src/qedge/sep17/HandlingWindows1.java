package qedge.sep17;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class HandlingWindows1 {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://gmail.com");
		Thread.sleep(5000);
		//get parent window id
		String parent = driver.getWindowHandle();
		System.out.println(parent);
		//click three links to open in new tab
		driver.findElement(By.linkText("Help")).click();
		driver.findElement(By.linkText("Privacy")).click();
		driver.findElement(By.linkText("Terms")).click();
		//get all window ids including parent id
		Set<String> allBrw = driver.getWindowHandles();
		System.out.println(allBrw);
		//iterate all windows
		for (String eachwin : allBrw) {
			//if parent id not eqaul to child id
			if(!parent.equals(eachwin))
			{
				//switch to each child window
				Thread.sleep(1000);
				driver.switchTo().window(eachwin);
				System.out.println("Child Window Titles:::"+driver.getTitle());
				Thread.sleep(5000);
				driver.close();
			}
		}
		driver.switchTo().window(parent);
		System.out.println("Parent Window Title:::"+driver.getTitle());
		Thread.sleep(5000);
		driver.findElement(By.id("identifierId")).sendKeys("pranga2010");
		Thread.sleep(5000);
		driver.quit();

	}

}
