

package Testmethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Pages.lamppage;

public class Bulbtest {
	
	@Test
	public void scroll() throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.kapoorlampshades.com/product-category/bathroom-lights/");
		lamppage l=new lamppage(driver);
		
l.scrollslider();
}
}
