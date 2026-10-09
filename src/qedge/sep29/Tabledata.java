package qedge.sep29;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Tabledata {
public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.w3schools.com/Html/html_tables.asp");
		Thread.sleep(5000);
		WebElement webtable = driver.findElement(By.id("customers"));
		//get all rows from table
		List<WebElement> rows = webtable.findElements(By.tagName("tr"));
		int row= rows.size()-1;
		System.out.println("No of rows in a table::"+row);
		List<WebElement> headers = webtable.findElements(By.tagName("th"));
		System.out.println("No of headers::"+headers.size());
		for (WebElement eachheader : headers) {
			System.out.print("\t"+eachheader.getText()+"\t");
		}
		System.out.println();

		//iterate all rows
		for (WebElement eachrow : rows) {
			//get cell collection from each row
			List<WebElement> cells = eachrow.findElements(By.tagName("td"));
			//iterate all cells
			for (WebElement eachcell : cells) {
				System.out.print("\t"+eachcell.getText().trim()+"\t");
			}
			System.out.println();
			System.out.println("================================================================================================");
		}
		driver.quit();
	}
}
