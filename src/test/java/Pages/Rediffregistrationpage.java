package Pages;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Rediffregistrationpage {
	WebDriver driver;

	public Rediffregistrationpage(WebDriver driver) {
		this.driver=driver;

}
	
	//method to enter the text in the text box 
	public void Entertext(String labelname,int n,String text) {
		try {
		String texts="//td[contains(text(),'"+labelname+"')]//following::input["+n+"]";
		//td[contains(text(),'Enter the text')]//following::input[1]
		By tex=By.xpath(texts);
		driver.findElement(tex).sendKeys(text);
		
	}
		catch(NoSuchElementException e){
			
			e.printStackTrace();
		}
	}
		
		//method to select element from dropdown
		
		public void selecttextfromdrop(String parameter,String value) {
			
			try {
			String par="//select[contains(@name,'"+parameter+"')]";
			WebElement para=driver.findElement(By.xpath(par));
			Select s=new Select(para);
			s.selectByVisibleText(value);
			
			
			
		}
			catch(Exception e) {
				
				e.printStackTrace();
			}
		}
			public void clickonlink(String text) {
				
				driver.findElement(By.linkText(text)).click();
				
			
		
		
}
			
			public void switchtotherwindow(int num) {
				Set<String>it=driver.getWindowHandles();
				Iterator<String>id=it.iterator();
				ArrayList<String>a=new ArrayList<String>();
				while(id.hasNext()) {
				a.add(id.next());
				
				}
				
				driver.switchTo().window(a.get(num));
				System.out.println(a.get(num));
				//driver.switchTo().window(a.get(Integer.parseInt(num)));
				System.out.println("Switched to   "+num+" window");
			}
			
			public void gettitleofpage() {
				String title=driver.getTitle();
				System.out.println("title is "+title);
				
			}
			public void clickonbutton(String clname) {
				driver.findElement(By.className(clname)).click();
			}
			public void validatetext(String textexpected,String tex) {
				
				String  textactual=driver.findElement(By.xpath(tex)).getText();
				Assert.assertEquals(textactual,textexpected);
				
				
				
				
				
			}
			
			
}