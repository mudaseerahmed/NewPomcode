package Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestpageTables {
	
	public WebDriver driver;
	public TestpageTables(WebDriver driver) {
		this.driver=driver;
	}
	double pricedollar;
	
public void addtochart(String product,int price,int action,int x) {
	String text="(//a[text()='"+product+"']//following::td["+price+"]//span[@class='woocommerce-Price-amount amount'])["+x+"]";
	By texts=By.xpath(text);
	String prices=driver.findElement(texts).getText();
	String y=prices.substring(1);
	System.out.println(y+"is the price");
	double fl=Double.parseDouble(y);
	pricedollar=pricedollar+fl;
	System.out.println(fl+"is total");
	
	System.out.println(prices);
	String addtochar="//a[text()='"+product+"']//following::td["+action+"]//a";
	By add=By.xpath(addtochar);
	
	//js.executeAsyncScript("arguments[0].scrollIntoView(true);",el);
	List<WebElement>a=driver.findElements(add);
	
	/*String te="//preceding::span[@class='woocommerce-Price-amount amount'][1]";
	String tot=text+te;
	By tota=By.xpath(tot);
	String dollar=driver.findElement(tota).getText();
	System.out.println(dollar);
	*/
	
try {
	WebElement el=driver.findElement(add);
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].scrollIntoView(true);",el);
	//js.executeScript("window.scrollBy(0,300)");
	

  //  WebDriverWait wait=new WebDriverWait(driver,20);
  //  wait.until(ExpectedConditions.visibilityOf(el));
    js.executeScript("arguments[0].click();",el);
    
	//driver.findElement(add).click();
	
}
catch(Exception e) {

	driver.findElement(add).click();
	//e.printStackTrace();
}
}
public void clickonnextpage(String page) {
	String no="//a[@class='page-numbers' and text()="+page+"]";
	JavascriptExecutor js=(JavascriptExecutor)driver;
	By pat=By.xpath(no);
	WebElement el=driver.findElement(pat);
	js.executeScript("arguments[0].scrollIntoView(true);",el);
	 js.executeScript("arguments[0].click();",el);
	
	// (//a[text()='G1040 Asia']//following::td[5]//a)[2]
		//	 (//a[text()='G1040 Asia']//following::td[5]//a)[1]//preceding::span[@class='woocommerce-Price-amount amount'][1]
	//driver.findElement(pat).click();
}
}
