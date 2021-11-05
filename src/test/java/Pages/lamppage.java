package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class lamppage {
	
	
	WebDriver driver;
	public lamppage(WebDriver driver) {
		this.driver=driver;
	}

	
	public void scrollslider() throws InterruptedException {
		JavascriptExecutor js=(JavascriptExecutor)driver;
	
		
	String text="//span[text()='Filter by price']/../../form/div/div[1]/span[1]";
	WebElement e=driver.findElement(By.xpath(text));
	WebElement from=driver.findElement(By.cssSelector("span[class='from']"));
	
	   js.executeScript("arguments[0].scrollIntoView();",e);
	   
//	int y=e.getLocation().getY();
//	y=y-125;
	js.executeScript("window.scrollBy(0,-125)"); 
	Actions a=new Actions(driver);
	for(int i=1;i<5;i++) {
	a.dragAndDropBy(e,10,0).perform();
	
	Thread.sleep(1000);
	System.out.println(from.getText());}
	for(int i=1;i<5;i++) {
	
	a.dragAndDropBy(e,-20,0).perform();
	System.out.println(from.getText());
	
	}
		
	}
}
