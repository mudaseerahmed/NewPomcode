package Testmethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Pages.IITPage;

public class TestIIT {
	
	@Test
	public void registration() throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(19,TimeUnit.SECONDS);
		driver.get("https://islamiahit.ac.in/form/student-registration-2020-2021");
		IITPage ob=new IITPage(driver);
		ob.entertext("Full", "Mudaseer");
		ob.entertext("Mobile", "9812312345");
		ob.entertext("Email", "urwell@gmail.com");
		ob.entertext("Address", "305 4 cross");
		ob.entertext("Select", "Civil Eng");
		Thread.sleep(1000);
		ob.selectcourse("Civil Engineering");
		ob.entertext("Select", "Mechanical");
		Thread.sleep(1000);
		ob.selectcourse("Mechanical Engineering");
		ob.entertab();
		ob.Entertext("Math");
		
		
		//ob.entertext("Math", "11");
		
		
		

}
}
