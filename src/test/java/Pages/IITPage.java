package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class IITPage {
	WebDriver driver;
	
	public IITPage(WebDriver driver) {
		this.driver=driver;
		
	}
	public void entertext(String text,String textsone) {
		String te="//label[contains(text(),'"+text+"')]//following::input[1]";
		By texts=By.xpath(te);
		driver.findElement(texts).sendKeys(textsone);
		driver.findElement(texts).click();
		
	}
public void selectcourse(String val) {
	WebElement e=driver.findElement(By.id("edit-select-course"));
	Select s=new Select(e);
	s.selectByValue(val);
	
}
public void entertab() {
	WebElement e=driver.findElement(By.className("select2-search__field"));
	e.sendKeys(Keys.TAB);
	//e.sendKeys(Keys.ENTER);
}

//fetch the text and split then convert string to int 
//then send values in the text box 
public void Entertext(String text) {
	String texts=driver.findElement(By.xpath("//span[@class='field-prefix input-group-text']")).getText();
	//System.out.println(texts);
	String[] s=texts.split("\\+");
	System.out.println(s[0].trim());
	System.out.println(s[1].trim().charAt(0));
	String q=s[0].trim();
	String w=s[1].trim();
	w=w.replace("=", "");
	w=w.trim();
	
	int x=Integer.parseInt(q);
	int y=Integer.parseInt(w);
	int z=x+y;
	String tosend=String.valueOf(z);
	System.out.println(z);
	String te="//label[contains(text(),'"+text+"')]//following::input[1]";
	By texton=By.xpath(te);
	driver.findElement(texton).sendKeys(tosend);
	
	
	
	
}
}
