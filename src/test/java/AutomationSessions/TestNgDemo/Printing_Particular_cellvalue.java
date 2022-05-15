package AutomationSessions.TestNgDemo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Printing_Particular_cellvalue {

	@Test
	public void launch_browser() throws Exception {
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.leafground.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath("//h5[text()='Table']"));

		ele.click();

		Thread.sleep(2000);

		List<WebElement> list = driver.findElements(By.xpath("//table/tbody/tr[2]/td[2]"));

		int count = list.size();

		System.out.println("rows count" + count);

		for (int i = 0; i < count; i++) {
			System.out.println(list.get(i).getText());
			System.out.println(list.get(i).getText());
			
			
			Thread.sleep(2000);
			driver.quit();
		}

	}
}
