package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;
	public  HomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}

	@FindBy(xpath="//a[@href='#']")
	WebElement dropdowndatastructures;
	
	@FindBy(xpath="//a[@href='/array']")
	WebElement Arrayclick;
	
	@FindBy(xpath="//a[@href='/linked-list']")
	WebElement linkedlistClick;
	
	@FindBy(xpath="//a[@href='/stack']")
	WebElement stackclick;
	
	@FindBy(xpath="//a[@href='/queue']")
	WebElement queueClick;
	
	@FindBy(xpath="//a[@href='/tree']")
	WebElement treeclick;
	
	@FindBy(xpath="//a[@href='/graph']")
	WebElement graphclick;
	
	
	
	public WebElement dropdowndatastructures()
	{
		return dropdowndatastructures;
	}
	
	public WebElement Arrayclick()
	{
		return Arrayclick;
	}
	public WebElement linkedlistClick()
	{
		return linkedlistClick;
	}
	public WebElement stackclick()
	{
		return stackclick;
	}
	public WebElement queueClick()
	{
		return  queueClick;
	}
	public WebElement treeclick()
	{
		return treeclick;
	}
	public WebElement graphclick()
	{
		return graphclick;
	}
}
