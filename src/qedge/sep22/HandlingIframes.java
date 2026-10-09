package qedge.sep22;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class HandlingIframes {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://jqueryui.com/tabs/");
		Thread.sleep(3000);
		//switch to iframe
		driver.switchTo().frame(0); 
		Thread.sleep(3000);//first frame
		driver.findElement(By.xpath("//*[@id=\"ui-id-1\"]")).click();
		String tab1 = driver.findElement(By.xpath("//div[@id='tabs-1']//p")).getText();
		System.out.println("Tab1 Text is::"+tab1);
		Thread.sleep(3000);
		driver.findElement(By.id("ui-id-2")).click();
		String tab2 = driver.findElement(By.xpath("//div[@id='tabs-2']//p")).getText();
		System.out.println("Tab2 Text is::"+tab2);
		Thread.sleep(3000);
		driver.findElement(By.id("ui-id-3")).click();
		String tab3 = driver.findElement(By.xpath("//div[@id='tabs-3']//p")).getText();
		System.out.println("Tab3 Text is::"+tab3);
		Thread.sleep(3000);
		//driver.switchTo().defaultContent();
		//Thread.sleep(3000);
		driver.findElement(By.linkText("Button")).click();
		Thread.sleep(3000);
		driver.quit();
		

	}

}
