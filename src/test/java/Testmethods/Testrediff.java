package Testmethods;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Pages.Rediffregistrationpage;
import Pages.Toolsqa;

public class Testrediff {
	@Test
	public void registration() throws InterruptedException, AWTException {
		

		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver_win32 (6)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/login");
		Toolsqa login=new Toolsqa(driver);
		login.entertextintext("userName","mudaseer");
		login.entertextintext("password", "ahmed");
		login.scrolltillWeblement();
		login.clickbutton("login");
		login.gettextoferrormsg("name");
		/*Rediffregistrationpage red=new Rediffregistrationpage(driver);
		red.Entertext("Full Name", 1,"Mudaseer");
		red.Entertext("Mobile No", 2,"9845712345");
		red.selecttextfromdrop("DOB_Day", "05");
		red.selecttextfromdrop("DOB_Month", "MAY");
		red.selecttextfromdrop("DOB_Year", "2003");
		red.selecttextfromdrop("country", "India");
		red.selecttextfromdrop("city", "Bangalore");
		red.clickonlink("terms and conditions");
		
		red.switchtotherwindow(1);
		driver.manage().window().maximize();
		red.gettitleofpage();
		red.switchtotherwindow(0);
		red.gettitleofpage();
		red.clickonbutton("btn_checkavail");
		red.validatetext("The ID cannot be blank. Please choose your desired ID.","//b[contains(text(),'The ID')]");
		red.Entertext("Choose", 1,"##");
		red.clickonbutton("btn_checkavail");
	    red.validatetext("The ID contains invalid character(s). Please choose another ID.","//b[contains(text(),'The ID')]");
		
		
		
		
		//select[contains(@name,'DOB_Day')]
		*/

}
}