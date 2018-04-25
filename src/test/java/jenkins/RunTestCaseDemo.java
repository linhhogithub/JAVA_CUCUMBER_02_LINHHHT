package jenkins;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

public class RunTestCaseDemo {
	WebDriver driver;
	
	@BeforeClass
	public void initBrowser() {
		// khởi tạo browser
		driver = new FirefoxDriver ();
		driver.get("http://daominhdam.890m.com/");
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.manage().window().maximize();		
	}
	
	@Test
	public void f() {
	}
	
	public int randomData() {
		Random rand = new Random();
		int number = rand.nextInt(999999) + 1;
		System.out.println(number);
		return number;
	}

	@AfterClass
	public void cleanBrowser() {
		driver.quit();}

}
