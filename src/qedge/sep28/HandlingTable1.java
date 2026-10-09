package qedge.sep28;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class HandlingTable1 {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.w3schools.com/Html/html_tables.asp");
		Thread.sleep(5000);
		//store table into webelement
		WebElement webtable = driver.findElement(By.id("customers"));
		//get all headers from table
		List<WebElement> headers = webtable.findElements(By.tagName("th"));
		System.out.println("No of headers::"+headers.size());
		for (WebElement eachheader : headers) {
			System.out.print("\t"+eachheader.getText()+"\t");
		}
		System.out.println();
		//get all rows which are in tr tag
		List<WebElement> rows = webtable.findElements(By.tagName("tr"));
		System.out.println("No of rows are::"+rows.size());
		for(int i=1;i<rows.size();i++)
		{
			//get cell collection from each row
			List<WebElement> cells =rows.get(i).findElements(By.tagName("td")); 
			System.out.println("Row No."+i+"   "+"Column No."+cells.size());
		}
		driver.quit();

	}

}
