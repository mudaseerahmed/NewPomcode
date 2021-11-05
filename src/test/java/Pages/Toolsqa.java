package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class Toolsqa {
	
	public WebDriver driver;
	public Toolsqa(WebDriver driver) {
		this.driver=driver;
	}
	public void entertextintext(String id,String text) {
		try {
			
			driver.findElement(By.id(id)).sendKeys(text);
		}
		catch(Exception e) {
			
			e.printStackTrace();
		}
	}
	public void clickbutton(String id) {
		driver.findElement(By.id(id)).click();
	}

	public void gettextoferrormsg(String id) {
		String text=driver.findElement(By.id(id)).getText();
		System.out.println(text);
	}
	public void scrolltillWeblement() {
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,300)");
	}
}
