package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class treeclick {
	WebDriver driver;
	public treeclick(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//a[@href='tree']")
	WebElement treeclic;
	
	@FindBy(xpath="//a[@href='overview-of-trees']")
	WebElement treeoverview;
	
	@FindBy(xpath="//a[@href='/tree/terminologies/']")
	WebElement treeterminology;
	
	@FindBy(xpath="//a[@href='/tryEditor']")
	WebElement treetryeditor;
	
	@FindBy(xpath="//a[@href='/tree/types-of-trees/']")
	WebElement treetypes;
	
	@FindBy(xpath="//a[@href='/tree/tree-traversals/']")
	WebElement treetraverse;
	
	@FindBy(xpath="//a[@href='/tree/traversals-illustration/']")
	WebElement treeillustrate;
	
	@FindBy(xpath="//a[@href='/tree/binary-trees/']")
	WebElement treebinary;
	
	@FindBy(xpath="//a[@href='/tree/types-of-binary-trees/']")
	WebElement binarytreetypes;
	
	@FindBy(xpath="//a[@href='/tree/implementation-in-python/']")
	WebElement treeinpython;
	
   @FindBy(xpath="//a[@href='/tree/binary-tree-traversals/']")
   WebElement binarytreetraverse;
   
   @FindBy(xpath="//a[@href='/tree/implementation-of-binary-trees/']")
   WebElement binarytreeimp;
   
   @FindBy(xpath="//a[@href='/tree/applications-of-binary-trees/']")
   WebElement binarytreeapplications;
   
   @FindBy(xpath="//a[@href='/tree/binary-search-trees/']")
   WebElement binarysearchtree;
   
   @FindBy(xpath="//a[@href='/tree/implementation-of-bst/']")
   WebElement bstimplementation;
   
   @FindBy(xpath="//a[@href='/tree/practice']")
   WebElement treepractice;

   
	public WebElement treeclic() 
	{
		return treeclic;
	}
	public WebElement treeoverview()
	{
		return treeoverview;
	}
	public WebElement treeterminology()
	{
		return treeterminology;
	}
	public WebElement treetryeditor()
	{
		return treetryeditor;
	}
    public WebElement treetypes()
    {
    	return treetypes;
    }
    public WebElement treetraverse()
    {
    	return treetraverse;
    }
    public WebElement  treeillustrate()
    {
    	return  treeillustrate;
    }
    public WebElement treebinary()
    {
    	return treebinary;
    }
    public WebElement binarytreetypes()
    {
    	return binarytreetypes;
    }
    public WebElement treeinpython()
    {    	
    	return treeinpython;
        	
    }
    public WebElement binarytreetraverse()
    {
    	return binarytreetraverse;
    }
    public WebElement binarytreeimp()
    {
    	return binarytreeimp;
    }
    public WebElement binarytreeapplications()
    {
    	return binarytreeapplications;
    }
    public WebElement binarysearchtree()
    {
    	return binarysearchtree;
    }
    public WebElement bstimplementation()
    {
    	return bstimplementation;
    }
    public WebElement treepractice()
    {
    	return treepractice;
    }
   }
