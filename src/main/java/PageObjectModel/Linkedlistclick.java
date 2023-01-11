package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Linkedlistclick {
	WebDriver driver;
	public Linkedlistclick(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//a[@href='linked-list']")
	WebElement linkedclick;
	
	@FindBy(xpath="//a[@href='introduction']")
	WebElement introductionclick;
	
	@FindBy(xpath="//a[@href='/tryEditor']")
	WebElement linktryeditor;
	
	@FindBy(xpath="//a[@href='/linked-list/creating-linked-list/']")
	WebElement createlink;
	
	@FindBy(xpath="//a[@href='/linked-list/types-of-linked-list/']")
	WebElement linkedtype;
	
	@FindBy(xpath="//a[@href='/linked-list/implement-linked-list-in-python/']")
	WebElement pythonlink;
	
	@FindBy(xpath="//a[@href='/linked-list/traversal/']")
	WebElement traverselink;
	
	@FindBy(xpath="//a[@href='/linked-list/insertion-in-linked-list/']")
	WebElement insertlink;
	
	@FindBy(xpath="//a[@href='/linked-list/deletion-in-linked-list/']")
	WebElement deletelink;
	
    @FindBy(xpath="//a[@href='/linked-list/practice']")
    WebElement prcticelink;
    
	public WebElement linkedclick()
	{
		return linkedclick;
	}
	public WebElement introductionclick()
	{
		return introductionclick;
	}
	public WebElement linktryeditor()
	{
		return linktryeditor;
	}
	public WebElement createlink()
	{
		return createlink;
	}

	public WebElement linkedtype()
	{
		return linkedtype;
	}
	public WebElement pythonlink()
	{
		return  pythonlink;
	}
	public WebElement traverselink()
	{
		return traverselink;
	}
	public WebElement  insertlink()
	{
		return  insertlink;
	}
	public WebElement deletelink()
	{
		return deletelink;
	}
	public WebElement prcticelink()
	{
		return prcticelink;
	}
}
