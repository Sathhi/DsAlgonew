package Tests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

import PageObjectModel.Array_tutotial;
import PageObjectModel.DatastructuresPage;
import PageObjectModel.Graphpage;
import PageObjectModel.HomePage;
import PageObjectModel.Linkedlistclick;
import PageObjectModel.MainPage;
import PageObjectModel.RegistrationPage;
import PageObjectModel.SigninPage;
import PageObjectModel.queueclicktutorial;
import PageObjectModel.stackclick;
import PageObjectModel.treeclick;
import Resources.Base;


public class LoginTest extends Base {

	WebDriver driver;
	SigninPage sp=null;	
	RegistrationPage rp;
	DatastructuresPage dp;
	LoginTest login=null;
	@Test
	
	public void Login() throws Exception
	{
		driver=initializebrowser();
		driver.get(prop.getProperty("url"));
		//Thread.sleep(2000);
		
		MainPage mp=new MainPage(driver);
		mp.getstartedoption().click();
	}
	@Test
	public void homepagelogin()throws Exception
	{
		HomePage hp=new HomePage(driver);
		hp.dropdowndatastructures().click();
		hp.Arrayclick().click();
				
		hp.dropdowndatastructures().click();
		hp.linkedlistClick().click();
				
		hp.dropdowndatastructures().click();
		hp.stackclick().click();
				
		hp.dropdowndatastructures().click();
		hp.queueClick().click();
				
		hp.dropdowndatastructures().click();
		hp.treeclick().click();
				
		hp.dropdowndatastructures().click();
		hp.graphclick().click();
	}
	
	@Test
		public void register()throws Exception
		{
		rp=new RegistrationPage(driver);
		rp.registerClick().click();
		Thread.sleep(2000);
		
		rp.Registerusername().sendKeys(prop.getProperty("username1"));
		rp.passwordenter().sendKeys(prop.getProperty("password1"));
		rp.passwordenter2().sendKeys(prop.getProperty("password2"));
		rp.registerlink().click();
		
		rp.Registerusername().sendKeys(prop.getProperty("username2"));
		rp.passwordenter().sendKeys(prop.getProperty("password2"));
		rp.registerlink().click();
		
		rp.Registerusername().sendKeys(prop.getProperty("username3"));
		rp.passwordenter().sendKeys(prop.getProperty("password3"));
		rp.registerlink().click();
				
		/*rp.registertologin().click();
		rp.registertologin().click();
		sp.userNameEnter().sendKeys(prop.getProperty("username"));
		sp.passwordEnter().sendKeys(prop.getProperty("password"));
		sp.loginClick().click();
		Thread.sleep(2000);*/
	     }
	@Test
	public void signin()throws Exception
	{
		sp=new SigninPage(driver);
		sp.signinclick().click();
		sp.userNameEnter().sendKeys(prop.getProperty("username"));
		sp.passwordEnter().sendKeys(prop.getProperty("password"));
		sp.loginClick().click();
				
	   sp.logoutClick().click();
	   
	   sp.signinclick().click();
	   sp.userNameEnter().sendKeys(prop.getProperty("username"));
	   sp.passwordEnter().sendKeys(prop.getProperty("password"));
	   sp.loginClick().click();
	   
	    dp=new DatastructuresPage(driver);
		dp.Datastructureenter().sendKeys(prop.getProperty("mainurl"));
		dp.Datastructureenter().click();
		dp.timecomplexityclick().click();
		sp.logoutClick().click();
		Thread.sleep(2000);
		
		sp.signinclick().click();
		sp.userNameEnter().sendKeys(prop.getProperty("username"));
		sp.passwordEnter().sendKeys(prop.getProperty("password"));
		sp.loginClick().click();
		Array_tutotial at=new Array_tutotial(driver);
		//at.dropdowndatastructures().click();
		at.Arrayclick().click();
		at.arrayinpython().click();
		at.tryeditor().click();
		
	//	at.codemirror().sendKeys(prop.getProperty("line1"));
	    driver.findElement(By.cssSelector(".CodeMirror-line")).click();
	  //  driver.findElement(By.cssSelector("div:nth-child(1) > textarea")).sendKeys("print(\"hello\")");
		driver.findElement(By.cssSelector("div:nth-child(1) > textarea")).sendKeys(prop.getProperty("line1"));
	    driver.findElement(By.cssSelector("button")).click();
	    driver.navigate().back();
	    
        at.Arraylistclick().click();
		
		at.tryeditor().click();
		driver.findElement(By.cssSelector(".CodeMirror-line")).click();
		driver.findElement(By.cssSelector("div:nth-child(1) > textarea")).sendKeys(prop.getProperty("line1"));
	    driver.findElement(By.cssSelector("button")).click();
	    driver.navigate().back();
	    
	    at.Arrayoplist().click();
		at.tryeditor().click();
		driver.findElement(By.cssSelector(".CodeMirror-line")).click();
		driver.findElement(By.cssSelector("div:nth-child(1) > textarea")).sendKeys(prop.getProperty("line1"));
	    driver.findElement(By.cssSelector("button")).click();
	    driver.navigate().back();
	    
	    at.Arrayapp().click();
		at.tryeditor().click();
		driver.findElement(By.cssSelector(".CodeMirror-line")).click();
		driver.findElement(By.cssSelector("div:nth-child(1) > textarea")).sendKeys(prop.getProperty("line1"));
	    driver.findElement(By.cssSelector("button")).click();
	    driver.navigate().back();
	    
	    at.Arrayapp().click();
	    at.Arraypractice().click();
	    at.Arraysearchclick().click();
	    driver.findElement(By.cssSelector(".CodeMirror-line")).click();
		driver.findElement(By.cssSelector("div:nth-child(1) > textarea")).sendKeys(prop.getProperty("line1"));
	   // driver.findElement(By.cssSelector("button")).click();
	    at.submitclick().click();
	    driver.navigate().back();
		
	    at.Arrayconsecutive().click();
	    driver.findElement(By.cssSelector(".CodeMirror-line")).click();
		driver.findElement(By.cssSelector("div:nth-child(1) > textarea")).sendKeys(prop.getProperty("line1"));
		at.submitclick().click();
		 driver.navigate().back();
			
		 at.Arrayfind().click();
		 driver.findElement(By.cssSelector(".CodeMirror-line")).click();
		 driver.findElement(By.cssSelector("div:nth-child(1) > textarea")).sendKeys(prop.getProperty("line1"));
		 at.submitclick().click();
	     driver.navigate().back();
	     
	     at.Arraysorted().click();
	     driver.findElement(By.cssSelector(".CodeMirror-line")).click();
		 driver.findElement(By.cssSelector("div:nth-child(1) > textarea")).sendKeys(prop.getProperty("line2"));
		 at.submitclick().click();
	     driver.navigate().back();
	     driver.navigate().back();
	     sp.logoutClick().click();
	     sp.signinclick().click();
		 sp.userNameEnter().sendKeys(prop.getProperty("username"));
		 sp.passwordEnter().sendKeys(prop.getProperty("password"));
		 sp.loginClick().click();
		 
		Linkedlistclick lc=new Linkedlistclick(driver);
		lc.linkedclick().click();
		lc.introductionclick().click();
		lc.linktryeditor().click();
		driver.navigate().back();
		
		lc.createlink().click();
		lc.linktryeditor().click();
		driver.findElement(By.cssSelector(".CodeMirror-line")).click();
		driver.findElement(By.cssSelector("div:nth-child(1) > textarea")).sendKeys(prop.getProperty("line1"));
		driver.findElement(By.cssSelector("button")).click();
		driver.navigate().back(); 
		
		lc.linkedtype().click();
		lc.linktryeditor().click();
		driver.findElement(By.cssSelector(".CodeMirror-line")).click();
		driver.findElement(By.cssSelector("div:nth-child(1) > textarea")).sendKeys(prop.getProperty("line1"));
		driver.findElement(By.cssSelector("button")).click();
		driver.navigate().back();
		
		lc.pythonlink().click();
		lc.linktryeditor().click();
		driver.findElement(By.cssSelector(".CodeMirror-line")).click();
		driver.findElement(By.cssSelector("div:nth-child(1) > textarea")).sendKeys(prop.getProperty("line1"));
		driver.findElement(By.cssSelector("button")).click();
		driver.navigate().back();
		
		lc.traverselink().click();
		lc.linktryeditor().click();
		driver.findElement(By.cssSelector(".CodeMirror-line")).click();
		driver.findElement(By.cssSelector("div:nth-child(1) > textarea")).sendKeys(prop.getProperty("line1"));
		driver.findElement(By.cssSelector("button")).click();
		driver.navigate().back();
		
		lc.insertlink().click();
		lc.linktryeditor().click();
		driver.findElement(By.cssSelector(".CodeMirror-line")).click();
		driver.findElement(By.cssSelector("div:nth-child(1) > textarea")).sendKeys(prop.getProperty("line1"));
		driver.findElement(By.cssSelector("button")).click();
		driver.navigate().back();
		
		lc.deletelink().click();
		lc.linktryeditor().click();
		driver.findElement(By.cssSelector(".CodeMirror-line")).click();
		driver.findElement(By.cssSelector("div:nth-child(1) > textarea")).sendKeys(prop.getProperty("line1"));
		driver.findElement(By.cssSelector("button")).click();
		driver.navigate().back();
		
		lc.prcticelink().click();
		sp.logoutClick().click();
		 sp.signinclick().click();
		 sp.userNameEnter().sendKeys(prop.getProperty("username"));
		 sp.passwordEnter().sendKeys(prop.getProperty("password"));
		 sp.loginClick().click();
		 
		 
		 stackclick scl=new stackclick(driver);
		 scl.stacktutclick().click();
		 
		 scl.stackopclick().click();
		 scl.stacktryeditor().click();
		 driver.findElement(By.cssSelector(".CodeMirror-line")).click();
		 driver.findElement(By.cssSelector("div:nth-child(1) > textarea")).sendKeys(prop.getProperty("line1"));
		 driver.findElement(By.cssSelector("button")).click();
		 driver.navigate().back();
		 
		 scl.stackimp().click();
		 scl.stacktryeditor().click();
		 driver.findElement(By.cssSelector(".CodeMirror-line")).click();
		 driver.findElement(By.cssSelector("div:nth-child(1) > textarea")).sendKeys(prop.getProperty("line1"));
		 driver.findElement(By.cssSelector("button")).click();
		 driver.navigate().back();
		 
		 scl.stackapplications().click();
		 scl.stacktryeditor().click();
		 driver.findElement(By.cssSelector(".CodeMirror-line")).click();
		 driver.findElement(By.cssSelector("div:nth-child(1) > textarea")).sendKeys(prop.getProperty("line1"));
		 driver.findElement(By.cssSelector("button")).click();
		 driver.navigate().back();
		 
		 scl.stackpractice().click();
		 sp.logoutClick().click();
		 sp.signinclick().click();
		 sp.userNameEnter().sendKeys(prop.getProperty("username"));
		 sp.passwordEnter().sendKeys(prop.getProperty("password"));
		 sp.loginClick().click();
		 
		 queueclicktutorial qcl  =  new queueclicktutorial(driver);
		 qcl.queueclic().click();
		 qcl.queueimplist().click();
		 qcl.queuetryeditor().click();
		 driver.findElement(By.cssSelector(".CodeMirror-line")).click();
		 driver.findElement(By.cssSelector("div:nth-child(1) > textarea")).sendKeys(prop.getProperty("line1"));
		 driver.findElement(By.cssSelector("button")).click();
		 driver.navigate().back();
	
		 qcl.queueimpcollection().click();
		 qcl.queuetryeditor().click();
		 driver.findElement(By.cssSelector(".CodeMirror-line")).click();
		 driver.findElement(By.cssSelector("div:nth-child(1) > textarea")).sendKeys(prop.getProperty("line1"));
		 driver.findElement(By.cssSelector("button")).click();
		 driver.navigate().back();
		 
		 qcl.queueimparray().click();
		 qcl.queuetryeditor().click();
		 driver.findElement(By.cssSelector(".CodeMirror-line")).click();
		 driver.findElement(By.cssSelector("div:nth-child(1) > textarea")).sendKeys(prop.getProperty("line1"));
		 driver.findElement(By.cssSelector("button")).click();
		 driver.navigate().back();
		 
		 qcl.queueop().click();
		 qcl.queuetryeditor().click();
		 driver.findElement(By.cssSelector(".CodeMirror-line")).click();
		 driver.findElement(By.cssSelector("div:nth-child(1) > textarea")).sendKeys(prop.getProperty("line1"));
		 driver.findElement(By.cssSelector("button")).click();
		 driver.navigate().back();
		 
		 qcl.queuepractice().click();
		 sp.logoutClick().click();
		 sp.signinclick().click();
		 sp.userNameEnter().sendKeys(prop.getProperty("username"));
		 sp.passwordEnter().sendKeys(prop.getProperty("password"));
		 sp.loginClick().click();
		 
		 treeclick tcl=new treeclick(driver);
		 tcl.treeclic().click();
		 tcl.treeoverview().click();
		 
		 tcl.treeterminology().click();
		 tcl.treetryeditor().click();
		 driver.findElement(By.cssSelector(".CodeMirror-line")).click();
		 driver.findElement(By.cssSelector("div:nth-child(1) > textarea")).sendKeys(prop.getProperty("line1"));
		 driver.findElement(By.cssSelector("button")).click();
		 driver.navigate().back();
		 
		tcl.treetypes().click();
		 tcl.treetryeditor().click();
		 driver.findElement(By.cssSelector(".CodeMirror-line")).click();
		 driver.findElement(By.cssSelector("div:nth-child(1) > textarea")).sendKeys(prop.getProperty("line1"));
		 driver.findElement(By.cssSelector("button")).click();
		 driver.navigate().back();
		 
        tcl.treetraverse().click();
        tcl.treetryeditor().click();
		 driver.findElement(By.cssSelector(".CodeMirror-line")).click();
		 driver.findElement(By.cssSelector("div:nth-child(1) > textarea")).sendKeys(prop.getProperty("line1"));
		 driver.findElement(By.cssSelector("button")).click();
        driver.navigate().back();
        
        
       tcl.treeillustrate().click();
       tcl.treetryeditor().click();
		driver.findElement(By.cssSelector(".CodeMirror-line")).click();
		driver.findElement(By.cssSelector("div:nth-child(1) > textarea")).sendKeys(prop.getProperty("line1"));
		driver.findElement(By.cssSelector("button")).click();
        driver.navigate().back();
        
        tcl.treebinary().click();
        tcl.treetryeditor().click();
		driver.findElement(By.cssSelector(".CodeMirror-line")).click();
		driver.findElement(By.cssSelector("div:nth-child(1) > textarea")).sendKeys(prop.getProperty("line1"));
		driver.findElement(By.cssSelector("button")).click();
        driver.navigate().back();
        
        tcl.binarytreetypes().click();
        tcl.treetryeditor().click();
		driver.findElement(By.cssSelector(".CodeMirror-line")).click();
		driver.findElement(By.cssSelector("div:nth-child(1) > textarea")).sendKeys(prop.getProperty("line1"));
		driver.findElement(By.cssSelector("button")).click();
        driver.navigate().back();
        
        tcl.treeinpython().click();
        tcl.treetryeditor().click();
		driver.findElement(By.cssSelector(".CodeMirror-line")).click();
		driver.findElement(By.cssSelector("div:nth-child(1) > textarea")).sendKeys(prop.getProperty("line1"));
		driver.findElement(By.cssSelector("button")).click();
        driver.navigate().back(); 
        
        tcl.binarytreetraverse().click();
        tcl.treetryeditor().click();
		driver.findElement(By.cssSelector(".CodeMirror-line")).click();
		driver.findElement(By.cssSelector("div:nth-child(1) > textarea")).sendKeys(prop.getProperty("line1"));
		driver.findElement(By.cssSelector("button")).click();
        driver.navigate().back(); 
        
        tcl.binarytreeimp().click();
        tcl.treetryeditor().click();
		driver.findElement(By.cssSelector(".CodeMirror-line")).click();
		driver.findElement(By.cssSelector("div:nth-child(1) > textarea")).sendKeys(prop.getProperty("line1"));
		driver.findElement(By.cssSelector("button")).click();
        driver.navigate().back(); 
        
        tcl.binarytreeapplications().click();
        tcl.treetryeditor().click();
		driver.findElement(By.cssSelector(".CodeMirror-line")).click();
		driver.findElement(By.cssSelector("div:nth-child(1) > textarea")).sendKeys(prop.getProperty("line1"));
		driver.findElement(By.cssSelector("button")).click();
        driver.navigate().back(); 
        
        tcl.binarysearchtree().click();
        tcl.treetryeditor().click();
		driver.findElement(By.cssSelector(".CodeMirror-line")).click();
		driver.findElement(By.cssSelector("div:nth-child(1) > textarea")).sendKeys(prop.getProperty("line1"));
		driver.findElement(By.cssSelector("button")).click();
        driver.navigate().back(); 
        
        tcl.bstimplementation().click();
        tcl.treetryeditor().click();
		driver.findElement(By.cssSelector(".CodeMirror-line")).click();
		driver.findElement(By.cssSelector("div:nth-child(1) > textarea")).sendKeys(prop.getProperty("line1"));
		driver.findElement(By.cssSelector("button")).click();
        driver.navigate().back(); 
        
        tcl.treepractice().click();
        sp.logoutClick().click();
		 sp.signinclick().click();
		 sp.userNameEnter().sendKeys(prop.getProperty("username"));
		 sp.passwordEnter().sendKeys(prop.getProperty("password"));
		 sp.loginClick().click();
        
        
		Graphpage gp=new Graphpage(driver);
		gp.graphclick().click();
		
		gp.graphtutclick().click();
		gp.graphtryeditor().click();
		driver.findElement(By.cssSelector(".CodeMirror-line")).click();
		driver.findElement(By.cssSelector("div:nth-child(1) > textarea")).sendKeys(prop.getProperty("line1"));
		driver.findElement(By.cssSelector("button")).click();
        driver.navigate().back(); 
        
        gp.graphrepresent().click();
        gp.graphtryeditor().click();
		driver.findElement(By.cssSelector(".CodeMirror-line")).click();
		driver.findElement(By.cssSelector("div:nth-child(1) > textarea")).sendKeys(prop.getProperty("line1"));
		driver.findElement(By.cssSelector("button")).click();
        driver.navigate().back(); 
        
        gp.graphpractice().click();
        sp.logoutClick().click();
		 sp.signinclick().click();
		 sp.userNameEnter().sendKeys(prop.getProperty("username"));
		 sp.passwordEnter().sendKeys(prop.getProperty("password"));
		 sp.loginClick().click();
       
        
        
        
        
        
        
        
        
        
        
		  
		 
		}
	
	
	
}
