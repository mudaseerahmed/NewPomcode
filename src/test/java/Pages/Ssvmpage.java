package Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Ssvmpage {
	WebDriver driver;
	
	public Ssvmpage(WebDriver driver) {
		this.driver=driver;
		
	}

	public void entertext(String label,int n,String text) {
		String tex="//b[contains(text(),'"+label+"')]//following::input["+n+"]";
		By text1=By.xpath(tex);
		driver.findElement(text1).sendKeys(text);
		
	}
	
	public void entertextusingjavascript(String value,String web) {
		WebElement element=driver.findElement(By.id(web));
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].value='"+ value +"';", element);
	}
	public void clickonradiobutton(String text,int n) {
		String button="//b[contains(text(),'"+text+"')]//following::input["+n+"]/..";
		By te=By.xpath(button);
		driver.findElement(te).click();
	}
	public void selectfromdropdown(String text,String identity) {
		WebElement id=driver.findElement(By.id(identity));
		Select s=new Select(id);
		s.selectByVisibleText(text);
	}
	
	public void verifybuttonandClick(String title) {
		
		String titl="//button[@title='"+title+"']/i";
		By tex=By.xpath(titl);
		boolean pr=driver.findElement(tex).isDisplayed();
		if(pr) {
			driver.findElement(tex).click();
		}
		else {
			
			System.out.println("not present");
		}
	}
	public void clickonbuttononebyone(String text,String name) {
		String path="//b[contains(text(),'"+text+"')]//following::input[@name='"+name+"']/..";
		List<WebElement>a=driver.findElements(By.xpath(path));
		for(int i=0;i<a.size();i++) {
		if(a.get(i).isSelected()) {
			
				System.out.println("dont click");
			}
			
			else {
			a.get(i).click();
			
			}
		}
	}
	
	//checkbox is not selected or not
	public void verifycheckboxandsubmitpay(String text) {
		String ch="//input[@id='"+text+"']";
		String cho="/..";
		String two=ch+cho;
		
	By chec=By.xpath(two);
	Boolean notselected=driver.findElement(chec).isSelected();
	
	if(notselected) {
		
		System.out.println("selected");
	}
	else {
		System.out.println("not selected");
	}
	
	}
//button is disabled 
	
public void verifybuttonisdisable(String text) {
	String ch="//input[@id='"+text+"']";
	By button=By.xpath(ch);
	Boolean enabledisable=driver.findElement(button).isEnabled();
	if(enabledisable) {
		System.out.println("submit button isenabled");
	}
	
	else {
		
		System.out.println("submit button is disabled");
	}
	
	//click on accept terms 
}
	public void clickbuttonterms(String text) {
		
		String ch="//input[@id='"+text+"']";
		String cho="/..";
		String two=ch+cho;
		
	By chec=By.xpath(two);
	driver.findElement(chec).click();
	
}
	public void clickondocumentsuploaded(String identity) {
		 String ids = identity;
		By idson=By.id(ids);
		Actions a=new Actions(driver);
		a.moveToElement(driver.findElement(idson)).click().perform();
		
	}
}