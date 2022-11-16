package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebElementCommandsExample extends Base{
	
	
	public void webElemCommandsDemo() {
		
//		WebElement email = driver.findElement(By.id("email"));
//		WebElement instaLink = driver.findElement(By.partialLinkText("Instagram"));
//		WebElement loginBtn = driver.findElement(By.tagName("button"));
//		WebElement forgotPasswordLink = driver.findElement(By.partialLinkText("d?"));
//		WebElement welMsg = driver.findElement(By.xpath("//h2[@class='_8eso']"));
//		WebElement loginForm = driver.findElement(By.xpath("//form[@data-testid='royal_login_form']"));
//		
//		WebElement hiddenElem = driver.findElement(By.name("jazoest"));
		
		
		
		//Fetching options
		//getAttribute
//		System.out.println(email.getAttribute("data-testid"));
		//get tooltip
//		System.out.println("tool tip of insta link - " + instaLink.getAttribute("title"));
		
		//get text
//		System.out.println("login button text = " + loginBtn.getText());
//		System.out.println("forgot password link text = " + forgotPasswordLink.getText());
//		System.out.println("Welcome msg = " + welMsg.getText());
		
		//get css
//		System.out.println("font size of login btn = " + loginBtn.getCssValue("font-size"));
		
		//get tagname
//		System.out.println("email textbox tagname = " + email.getTagName() );
		
		//get location
//		System.out.println("login button (Point) - " + loginBtn.getLocation());
//		System.out.println("login button (Point x) - " + loginBtn.getLocation().x);
//		System.out.println("login button (Point y) - " + loginBtn.getLocation().y);
		
		//get Size
//		System.out.println("login btn size (Dimension) - " + loginBtn.getSize());
//		System.out.println("login btn size (Dimension - height) - " + loginBtn.getSize().height);
//		System.out.println("login btn size (Dimension - width) - " + loginBtn.getSize().width);
		
		
		//Action commands
		//sendkeys
//		email.sendKeys("ramesh@gmail.com");
		
		//clear
//		email.clear();
//		email.sendKeys("suresh@yahoo.com");
		
		//click
//		forgotPasswordLink.click();
//		loginBtn.click();
		
		//submit
//		loginBtn.submit();
//		loginForm.submit();
		
		
		//State examples
		//is displayed
//		System.out.println("is email element displayed - " + email.isDisplayed());
//		System.out.println("is the hidden element displayed - " + hiddenElem.isDisplayed());
		
		//is enabled
//		System.out.println("is email element enabled for typing - " + email.isEnabled());
		
		//selected
		driver.findElement(By.partialLinkText("Sign Up")).click();
		WebElement maleRadioBtn = driver.findElement(By.xpath("//input[contains(@id,'u_0_3')]"));
		
		System.out.println("Before clicking, is the male radio button selected - " +  maleRadioBtn.isSelected());
		maleRadioBtn.click();
		System.out.println("After clicking, is the male radio button selected - " +  maleRadioBtn.isSelected());
		
	}
	

	public static void main(String[] args) {
		WebElementCommandsExample obj = new WebElementCommandsExample();
		obj.setupBrowser("chrome", "https://www.facebook.com");
		obj.webElemCommandsDemo();
	}

}
