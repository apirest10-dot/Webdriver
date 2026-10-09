package qedge.sep29;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Calender1 {
public static void main(String[] args) throws Throwable {
		//script to select date from calendar
		String dob = "2-Feb-1967";
		String temp[] =dob.split("-");
		String date =temp[0];
		String month =temp[1];
		String year =temp[2];
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://flights.qedgetech.com/register.html");
		Thread.sleep(5000);
		driver.findElement(By.name("dob")).click();
		Thread.sleep(2000);
		//select year from calendar
		new Select(driver.findElement(By.className("ui-datepicker-year"))).selectByVisibleText(year);
		Thread.sleep(2000);
		new Select(driver.findElement(By.className("ui-datepicker-month"))).selectByVisibleText(month);
		Thread.sleep(2000);
		WebElement webtable = driver.findElement(By.className("ui-datepicker-calendar"));
		List<WebElement> rows = webtable.findElements(By.tagName("tr"));
		for (WebElement eachrow : rows) {
			List<WebElement> cells = eachrow.findElements(By.tagName("td"));
			for (WebElement eachcell : cells) {
				if(eachcell.getText().equals(date))
				{
					eachcell.click();
				}
			}
		}
		String selectedDate = driver.findElement(By.name("dob")).getDomProperty("value");
		System.out.println(selectedDate);	
		Thread.sleep(5000);
		driver.quit();

	}
}
