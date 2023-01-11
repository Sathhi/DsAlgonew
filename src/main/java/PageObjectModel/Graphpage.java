package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Graphpage {
	WebDriver driver;
	public Graphpage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//a[@href='graph']")
	WebElement graphclick;
	
	@FindBy(xpath="//a[@href='graph']")
	WebElement graphtutclick;
	
	@FindBy(xpath="//a[@href='/tryEditor']")
	WebElement graphtryeditor;
	
	@FindBy(xpath="//a[@href='/graph/graph-representations/']")
	WebElement graphrepresent;
	
	@FindBy(xpath="//a[@href='/graph/practice']")
	WebElement graphpractice;
	
	
	
	public WebElement graphclick()
	{
		return graphclick;
	}
	
   public WebElement graphtutclick()
   {
	   return graphtutclick;
   }
   public WebElement graphtryeditor()
   {
	   return graphtryeditor;
   }
   public WebElement graphrepresent()
   {
	   return graphrepresent;
   }
   public WebElement graphpractice()
   {
	   return graphpractice;
   }
}
