package AutomationSessions.TestNgDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

@Listeners(AutomationSessions.TestNgDemo.ListenersDemo.class)

public class ListenerTest {

	@Test
	public static void loginTest() throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		System.out.println(driver.hashCode());

		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		driver.manage().window().maximize();

		try {
			WebElement Nameinput = driver.findElement(By.xpath("//input[@name ='txtUsername']"));
			Nameinput.sendKeys("Test");

			driver.navigate().refresh();

			Nameinput.sendKeys("Test");
		} catch (Exception e) {

			WebElement Nameinput = driver.findElement(By.xpath("//input[@name ='txtUsername']"));

			Nameinput.sendKeys("Admin");

		}

		WebElement Passwordinput = driver.findElement(By.xpath("//input[@name ='txtPassword']"));

		Passwordinput.sendKeys("admin123");

		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@name='Submit']")).click();
		Thread.sleep(2000);Thread.sleep(2000);
		driver.quit();
	}

	@Test
	public void testcase2() {
		System.out.println("Testcase 2 Executed");
	}
	
	
	@Test
	public void testcase3() {
		System.out.println("Testcase 3 Executed");
	}
	
	@Test
	public boolean testcase4() {
		System.out.println("Testcase 4 Executed");
		return false;
	}
}
