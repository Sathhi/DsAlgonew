package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class queueclicktutorial 
{
WebDriver driver;

public queueclicktutorial(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver,this);
}

@FindBy(xpath="//a[@href='queue']")
WebElement queueclic;

@FindBy(xpath="//a[@href='implementation-lists']")
WebElement queueimplist;

@FindBy(xpath="//a[@href='/queue/implementation-collections/']")
WebElement queueimpcollection;

@FindBy(xpath="//a[@href='/tryEditor']")
WebElement queuetryeditor;

@FindBy(xpath="//a[@href='/queue/Implementation-array/']")
WebElement queueimparray;

@FindBy(xpath="//a[@href='/queue/QueueOp/']")
WebElement queueop;

@FindBy(xpath="//a[@href='/queue/practice']")
WebElement queuepractice;

public WebElement queueimplist()
{
	return queueimplist;
}
public WebElement queueclic()
{
	return queueclic;
}

public WebElement queueimpcollection()
{
	return queueimpcollection;
}
public WebElement queueimparray()
{
	return queueimparray;
}
public WebElement queueop()
{
	return queueop;
}
public WebElement queuepractice()
{
	return queuepractice;
}

public WebElement queuetryeditor()

{
     return queuetryeditor;

}



}


