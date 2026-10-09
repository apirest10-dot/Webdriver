package qedge.sep23;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class HandlingActions1 {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		//create Object for actions class
		Actions ac = new Actions(driver);
		driver.findElement(By.name("q")).sendKeys("Selenium openings ");
		Thread.sleep(2000);
		for(int i=1;i<=5;i++)
		{
			//press down arrow key
			Thread.sleep(2000);
			ac.sendKeys(Keys.ARROW_DOWN).perform();
		}
		//click enter key
		ac.sendKeys(Keys.ENTER).perform();
		Thread.sleep(5000);
		driver.quit();
	}
}
