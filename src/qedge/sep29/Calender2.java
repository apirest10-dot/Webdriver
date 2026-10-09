package qedge.sep29;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Calender2 {
public static void main(String[] args) throws Throwable {
		String dob ="12/October/2020";
		String temp[] =dob.split("/");
		String date = temp[0];
		String month = temp[1];
		String year = temp[2];
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Thread.sleep(3000);
		driver.switchTo().frame(0);
		driver.findElement(By.id("datepicker")).click();
		String CalYear = driver.findElement(By.className("ui-datepicker-year")).getText();
		String CalMonth = driver.findElement(By.className("ui-datepicker-month")).getText();
		while((!CalYear.equals(year))||(!CalMonth.equalsIgnoreCase(month)))
		{
			driver.findElement(By.xpath("//a[@title='Prev']")).click();
			CalYear = driver.findElement(By.className("ui-datepicker-year")).getText();
			 CalMonth = driver.findElement(By.className("ui-datepicker-month")).getText();
		}
		WebElement webtable = driver.findElement(By.className("ui-datepicker-calendar"));
		List<WebElement> rows = webtable.findElements(By.tagName("tr"));
		for (WebElement eachrow : rows) {
			List<WebElement> cols = eachrow.findElements(By.tagName("td"));
			for (WebElement eachcell : cols) {
				if(eachcell.getText().equals(date))
				{
					eachcell.click();
				}
			}
		}
		String selectedDate = driver.findElement(By.id("datepicker")).getDomProperty("value");
		System.out.println(selectedDate);	
		Thread.sleep(5000);
		driver.quit();
	}
}
