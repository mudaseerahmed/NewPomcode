package Testmethods;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import Pages.Ssvmpage;

public class Testssvm {
	@Test
	public void registration() throws InterruptedException, AWTException {
		

		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver_win32 (6)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.manage().window().maximize();
		Ssvmpage sv=new Ssvmpage(driver);
		driver.get("https://ssvminstitutions.ac.in/applicationssvmws/application/applicationform/applicationform.php?sid=APPLICATION");
		Thread.sleep(5000);
		Robot robot = new Robot();
		 
		// Scroll Down using Robot class
		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
	//	driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		//		driver.findElement(By.id("prenext_btn")).click();
		
		Thread.sleep(5000);
		robot.keyPress(KeyEvent.VK_ESCAPE);
		robot.keyRelease(KeyEvent.VK_ESCAPE);
		sv.entertext("Name of the", 1, "Mudaseer");
		sv.entertext("Name of the", 2, "Ahmed");
		
		sv.selectfromdropdown("X","sss");
		Thread.sleep(5000);
		sv.clickonradiobutton("Gender", 2);
		sv.clickonradiobutton("Gender", 1);
		sv.entertextusingjavascript("123123456234","aadharno");
		sv.entertext("Place of", 1, "Bangalore");
	//	sv.clickonradiobutton("Community", 3);
		sv.clickonbuttononebyone("Community","category");
		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(3000);
		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(3000);
		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
		
		Thread.sleep(3000);
		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
		sv.verifybuttonandClick("Add Siblings");
		sv.verifybuttonandClick("Delete");
	sv.clickonbuttononebyone("Affiliated to","school_type");
	robot.keyPress(KeyEvent.VK_PAGE_DOWN);
	robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
	sv.verifycheckboxandsubmitpay("agree");
	sv.verifybuttonisdisable("submit");
	sv.clickbuttonterms("agree");
	sv.verifybuttonisdisable("submit");
	sv.clickondocumentsuploaded("mark_file");
	
	
		//sv.clickonradiobutton("Affiliated to", 1);
	//	sv.clickonradiobutton("Affiliated to", 4);
		//WebElement Element = driver.findElement(By.xpath("//span[contains(text(),'SSVM')]")); 
	//	js.executeScript("arguments[0].scrollIntoView();", Element);
	//	js.executeScript("window.scrollBy(0,1000)");
		  // Actions a=new Actions(driver);
		 //  Element.sendKeys(Keys.TAB);
		//   Thread.sleep(4000);
		//123123456234
    
	//	Robot r = new Robot();
		

		 
		//driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		//driver.findElement(By.id("prenext_btn")).click();
		//r.keyPress(KeyEvent.VK_ESCAPE);
	//	r.keyRelease(KeyEvent.VK_ESCAPE);
		
	//	sv.entertext("Name of", 1, "mudaseer");

}
}
