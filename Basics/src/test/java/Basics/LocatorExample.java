package Basics;

import org.openqa.selenium.By;

public class LocatorExample extends Base{
	
	public void locatorDemo() {
		//id
		driver.findElement(By.id("email")).sendKeys("dan@gmail.com");
		
		//name
//		driver.findElement(By.name("email")).sendKeys("1321321");
		
		//class name
//		driver.findElement(By.className("inputtext _55r1 _6luy")).sendKeys("from class name");//error
//		driver.findElement(By.className("inputtext")).sendKeys("from class name-1");
//		driver.findElement(By.className("_55r1")).sendKeys("from class name-2");
//		driver.findElement(By.className("_6luy")).sendKeys("from class name-3");
		
		//tagname
//		driver.findElement(By.tagName("button")).click();
		
		//linktext ==> hyperlink ==> "a" tagname
//		driver.findElement(By.linkText("Forgotten password?")).click();
//		driver.findElement(By.linkText("Instagram")).click();
		
		//partial link text ==> hyperlink ==> "a" tagname
//		driver.findElement(By.partialLinkText("Forgotten password?")).click();
//		driver.findElement(By.partialLinkText("Forgotten")).click();
//		driver.findElement(By.partialLinkText("password?")).click();
//		driver.findElement(By.partialLinkText("Forgotten ")).click();
//		driver.findElement(By.partialLinkText(" password?")).click();
//		driver.findElement(By.partialLinkText("For")).click();
//		driver.findElement(By.partialLinkText("ord?")).click();
//		driver.findElement(By.partialLinkText("got")).click();
//		driver.findElement(By.partialLinkText("swo")).click();
//		driver.findElement(By.partialLinkText("ten pass")).click();
//		driver.findElement(By.partialLinkText("ten password?")).click();
//		driver.findElement(By.partialLinkText("Forgotten pas")).click();
//		driver.findElement(By.partialLinkText("?")).click();
//		driver.findElement(By.partialLinkText("F")).click();
		
		//xpath
//		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("from xpath");
		
		//absolute path
//		String path = "/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[1]/input";
//		driver.findElement(By.xpath(path)).sendKeys("from abs path");
		
		//relative path
//		driver.findElement(By.xpath("//form/div[1]/div[1]/input")).sendKeys("from rel path");
//		driver.findElement(By.xpath("//form//input[@id='email']")).sendKeys("from rel path-1");
		
//		$x("//input[@id='email']")
//		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("from xpath");
		
//		//tagname
//		$x("//button")
//		
//		//attribute
//		$x("//*[@id='email']")//avoid it as performance dips here
//		
//		//tagname+attribute
//		$x("//input[@id='email']")
//		$x("//input[@name='email']")
//		$x("//input[@class='inputtext _55r1 _6luy']")
//		$x("//input[@type='text']")
//		$x("//input[@placeholder='Email address or phone number']")
//		$x("//input[@aria-label='Email address or phone number']")
//		$x("//input[@autofocus='1']")
//		$x("//input[@data-testid='royal_email']")
//		
//		//functions
//		//starts-with
//		$x("//input[starts-with(@id,'email')]")
//		$x("//input[starts-with(@id,'emai')]")
//		$x("//input[starts-with(@id,'ema')]")
//		$x("//input[starts-with(@id,'em')]")
//		$x("//input[starts-with(@id,'e')]")
//		
//		//contains
//		$x("//input[contains(@id,'email')]")
//		$x("//input[contains(@id,'emai')]")
//		$x("//input[contains(@id,'ema')]")
//		$x("//input[contains(@id,'em')]")
//		$x("//input[contains(@id,'e')]")
//		
//		$x("//input[contains(@id,'mail')]")
//		$x("//input[contains(@id,'ail')]")
//		$x("//input[contains(@id,'il')]")
//		$x("//input[contains(@id,'l')]")
//		
//		$x("//input[contains(@id,'mai')]")
//		$x("//input[contains(@id,'ai')]")
//		$x("//input[contains(@id,'ma')]")
//		$x("//input[contains(@id,'i')]")
//		$x("//input[contains(@id,'m')]")
//		
//		//text()
//		$x("//button[text()='Log In']")
//		$x("//a[text()='Forgotten password?']")
//		$x("//h2[text()='Facebook helps you connect and share with the people in your life.']")
//		
//		//starts-with + text()
//		$x("//button[starts-with(text(),'Log In')]")
//		$x("//button[starts-with(text(),'Log I')]")
//		$x("//button[starts-with(text(),'Log ')]")
//		$x("//button[starts-with(text(),'Log')]")
//		$x("//button[starts-with(text(),'Lo')]")
//		$x("//button[starts-with(text(),'L')]")
//		
//		$x("//a[starts-with(text(),'Forgotten password?')]")
//		$x("//a[starts-with(text(),'Forgotten pass')]")
//		$x("//a[starts-with(text(),'Forgotte')]")
//		$x("//a[starts-with(text(),'Forgo')]")
//		$x("//a[starts-with(text(),'Fo')]")
//		
//		$x("//h2[starts-with(text(),'Facebook helps you connect and share with the people in your life.')]")
//		$x("//h2[starts-with(text(),'Facebook helps you connect and share with the peopl')]")
//		$x("//h2[starts-with(text(),'Facebook helps you connect and share ')]")
//		$x("//h2[starts-with(text(),'Facebook helps you con')]")
//		$x("//h2[starts-with(text(),'Face')]")
//		
//		//contains+text()
//		$x("//a[contains(text(),'Forgotten password?')]")
//		$x("//a[contains(text(),'Forgotten passwor')]")
//		$x("//a[contains(text(),'Forgotten pass')]")
//		$x("//a[contains(text(),'Forgotte')]")
//		$x("//a[contains(text(),'en password?')]")
//		$x("//a[contains(text(),'ord?')]")
//		$x("//a[contains(text(),'en passw')]")
//		$x("//a[contains(text(),'pass')]")
//		$x("//a[contains(text(),'got')]")
//		$x("//a[contains(text(),'swor')]")
//		$x("//a[contains(text(),'tten pas')]")
//		$x("//a[contains(text(),'?')]")
//		$x("//a[contains(text(),'Fo')]")
//		$x("//button[contains(text(),'Log In')]")
//		$x("//h2[contains(text(),'Facebook helps you connect and share with the people in your life.')]")
//		
//		
//		//Adv xpath
//		//and
//		$x("//input[@id='email' and @name='email']")
//		$x("//input[@id='email' and @name='email' and @data-testid='royal_email']")
//		
//		//or
//		$x("//input[@id='email' or @name='email']")
//		$x("//button[text()='Log In' or text()='Anmelden']")
//		$x("//button[text()='Log In' or text()='Anmelden' or text()='लॉग इन करें']")
//		
//		//and + or
//		$x("//input[@id='email' or @name='email' and @data-testid='royal_email']")
//		$x("//input[@id='email' and @name='email' or @data-testid='royal_email']")
//		
//		//index
//		//non sibling ==> which donot share the same parent ==> numbering starts from 0
//		$x("//input")[2]
//		$x("//span/select")[2] //year (can be applied for sibling also)
//				
//		//sibling based ==> share the same parent ==> numbering starts from 1
//		$x("//span/select[1]")//day
//		$x("//span/select[2]")//month
//		$x("//span/select[3]")//year
//		
//		//chain
//		$x("//form/div/div/input")
//		$x("//form//input[@id='email']")
//		
//		//Axes
//		//child
//		$x("//span[@class='_5k_4']/child::span")
//		
//		//parent
//		$x("//select[@id='day']/parent::span")
//		$x("//select[@id='month']/parent::span")
//		$x("//select[@id='year']/parent::span")
//		
//		//following sibling ==> left to right
//		$x("//select[@id='day']/following-sibling::select[1]")//month
//		$x("//select[@id='day']/following-sibling::select[2]")//year
//		$x("//select[@id='month']/following-sibling::select")//year
//		$x("//select[@id='month']/following-sibling::select[1]")//year
//		
//		//following ==> left to right, top to bottom
//		$x("//select[@id='day']/following::select[1]")//month
//		$x("//select[@id='day']/following::select[2]")//year
//		$x("//select[@id='month']/following::select")//year
//		$x("//select[@id='month']/following::select[1]")//year
//		
//		$x("//input[@name='firstname']/following::select[@id='month']")		
//		$x("//input[@name='firstname']/following::select[2]")
//		
//		
//		//preceding-sibling
//		$x("//select[@id='year']/preceding-sibling::select[1]")//month
//		$x("//select[@id='year']/preceding-sibling::select[2]")//day
//		
//		$x("//select[@id='year']/preceding::select[1]")//month
//		$x("//select[@id='year']/preceding::select[2]")//year
//		
//		//descendant
//		$x("//body/descendant::select[1]")
//		$x("//form/descendant::select[1]")
//		$x("//div/descendant::select[1]")
//		
//		//ancestor
//		$x("//select[@id='month']/ancestor::div")
//		$x("//select[@id='month']/ancestor::form")
//		$x("//select[@id='month']/ancestor::body")
//		$x("//select[@id='month']/ancestor::body//select[3]")
//		$x("//select[@id='month']/ancestor::body//select[@id='year']")
//		
//		
//		
//		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//css
//		driver.findElement(By.cssSelector("#email")).sendKeys("from css selector");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

	public static void main(String[] args) {
		LocatorExample obj = new LocatorExample();
		obj.setupBrowser("edge", "https://www.gmail.com/");
		obj.locatorDemo();
	}

}
