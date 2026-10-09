package qedge.sep21;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class xpath {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://flights.qedgetech.com/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[normalize-space()='Register']")).click();
		driver.findElement(By.xpath("(//input[contains(@type,'text')])[1]")).sendKeys("Akhilesh");
		driver.findElement(By.xpath("//input[starts-with(@placeholder,'Contact')]")).sendKeys("89765423121");
		driver.findElement(By.xpath("(//div[@class='col-lg-6']/input)[3]")).sendKeys("test098@gmail.com");
		driver.findElement(By.xpath("(//input[contains(@class,'trol')])[4]")).sendKeys("Test@1234");
		new Select(driver.findElement(By.xpath("//div[@class='col-lg-6']/select"))).selectByValue("M");
		driver.findElement(By.xpath("//input[starts-with(@placeholder,'Date of Birth')]")).sendKeys("20-12-1978");
		driver.findElement(By.xpath("//*[@type=\"checkbox\"]")).click();
		driver.findElement(By.xpath("//*[contains(@class,'register')]")).click();
		Thread.sleep(5000);
		driver.quit();
		}
}
