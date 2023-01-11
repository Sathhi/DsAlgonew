package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class stackclick
{
	WebDriver driver;
	public stackclick(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//a[@href='stack']")
	WebElement stacktutclick;
	
	@FindBy(xpath="//a[@href='operations-in-stack']")
	WebElement stackopclick;
	
	@FindBy(xpath="//a[@href='/tryEditor']")
	WebElement stacktryeditor;
	
    @FindBy(xpath="//a[@href='/stack/implementation/']")
    WebElement stackimp;
  	
    @FindBy(xpath="//a[@href='/stack/stack-applications/']")
    WebElement stackapplications;
    
    @FindBy(xpath="//a[@href='/stack/practice']")
    WebElement stackpractice;
    
	public WebElement stacktutclick()
	{
		return stacktutclick;
	}
	public WebElement stackopclick()
	{
		return stackopclick;
	}
	public WebElement stacktryeditor()
	{
		return stacktryeditor;
	}
	public WebElement stackimp() 
	{
		return stackimp;
	}
	public WebElement stackapplications()
	{
		return stackapplications;
	}
	public WebElement stackpractice()
	{
		return stackpractice;
	}
}
