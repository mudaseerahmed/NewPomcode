package Testmethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import Pages.Onemgpage;
import Pages.Whirlpoolpage;

public class TestWhirlpool {
	@Test
	public void registration() throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(19,TimeUnit.SECONDS);
		driver.get("https://www.whirlpoolindia.com/kitchen.html");
		Whirlpoolpage  on=new Whirlpoolpage (driver);
		on.clickkitchenitems("Sub-Category");
		on.closepopup();
		on.buttonclick("action-close");
		Thread.sleep(1000);
		on.gettextofsubcategory("Built In");
		
}
	
}
