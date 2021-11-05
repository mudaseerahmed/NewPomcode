package Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;

public class Whirlpoolpage {
	public WebDriver driver;
	public Whirlpoolpage(WebDriver driver) {
		this.driver=driver;
	}
	//click on plus icon based on the text
	public void clickkitchenitems(String text) {
	String te="//dt[contains(text(),'"+text+"')]";
	By pa=By.xpath(te);
	driver.findElement(pa).click();
	Reporter.log("clicked");
	}
	public void closepopup() {
		driver.findElement(By.className("cross-btn")).click();
	}
	public void buttonclick(String cname) {
		String tex=cname;
		By te=By.className(tex);
		driver.findElement(te).click();
		
		//a[contains(text(),'Built')]//span[@class='count']
	}
	public void gettextofsubcategory(String text) throws InterruptedException {
		String te="//a[contains(text(),'"+text+"')]//span[@class='count']";
		By tex=By.xpath(te);
		String textone=driver.findElement(tex).getText();
		int aone=0;
	
	//	 textone=textone.replace("\"", "");
		System.out.println(textone+"-----");
		   String number = "";
           String letter = "";
           for (int i = 0; i < textone.length(); i++) {
                  char a = textone.charAt(i);
                  if (Character.isDigit(a)) {
                        number = number + a;

                  } else {
                        letter = letter + a;

                  }
           }
	
		int n=Integer.parseInt(number);
		System.out.println(n);
		//(//li/a[@title='Next'])[2]
		
		String next="(//li/a[@title='Next'])[2]";
		By nexts=By.xpath(next);
	//	List<WebElement>last=driver.findElements(By.xpath("//span[contains(text(),'Compare')"));
	//int la=last.size();

	
		WebElement el=driver.findElement(nexts);
		WebElement edis=driver.findElement(By.className("category-disclaimer"));
		int x=0;
		
		int y=el.getLocation().getY();
		y=y-100;
	//	y=y+125;
		JavascriptExecutor js=(JavascriptExecutor)driver;
	//	try {
	//	js.executeScript("window.scrollBy(" +x +", " +y +")");
		
	//}
	//	catch(Exception e) {
			
	//		e.printStackTrace();
	//	}
		boolean a;
		a=driver.findElement(nexts).isDisplayed();
		
		
	//	while(a==true){

			System.out.print(a);
			List<WebElement>aon=driver.findElements(By.xpath("//div[@class='product-item-info']"));
			aone=aone+aon.size();
			System.out.println(aone);
	//		if(el.isDisplayed()) {
			js.executeScript("window.scrollBy(" +x +", " +y +")");//
			
			while(a==true){
	driver.findElement(nexts).click();
	//		}
		Thread.sleep(2000);
	js.executeScript("window.scrollBy(" +x +", " +y +")");
		a=driver.findElement(nexts).isDisplayed();
	//	if(a) {
		//driver.findElement(nexts).click();
		
	//}
	//	else {
		//	System.out.println("dont click and end the program");
			
		}
	
}}
	
		
	//}
	


