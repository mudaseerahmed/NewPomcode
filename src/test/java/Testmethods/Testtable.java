package Testmethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Pages.TestpageTables;

public class Testtable {
	@Test
	public void registration() throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver_win32 (6)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(19,TimeUnit.SECONDS);
		driver.get("https://demo.wooproducttable.com/demo-list/classic-table-01/");
		TestpageTables tb=new TestpageTables(driver);
		tb.addtochart("Belt",3, 5,2);
		tb.addtochart("Cap",3, 5,2);
		tb.addtochart("Delicate Ring",3,5,1);
		tb.addtochart("G1040 Asia",3,5,1);
tb.clickonnextpage("2");
//tb.clickonnextpage("1");
}
}
