package Testmethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Pages.Onemgpage;

//enter telmed and click on first dropdown and print the result of the total telmed

//validate the number displayed and by counting 19 =19 pending 
//if sold out there is no option validate  pending 

public class OnemgclassTest {
	@Test
	public void registration() throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(19,TimeUnit.SECONDS);
		driver.get("https://www.1mg.com/");
		Onemgpage on=new Onemgpage(driver);
		driver.navigate().refresh();
		//on.clickclose();
		on.entertext("srchBarShwInfo", "Telmed");

		on.clickdropdown(1);
		on.printresultcount("telmed", 1,"//span[@class='style__pro-title___3zxNC']");
		
		on.entertext("srchBarShwInfo", "Crocin");

		on.clickdropdown(1);
		
		on.printresultcount("crocin", 1,"//div[@class='style__pro-title___3G3rr']");
		
		//div[@class='style__pro-title___3G3rr']
		
}
}
