package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class iframeExample extends DemoFour {

	public void iframedemo()
	{
		//index
		//driver.switchTo().frame(1);
		//driver.switchTo().frame("iframeResult");
		WebElement ifrm = driver.findElement(By.id("iframeResult"));
		driver.switchTo().frame(ifrm);
		
		driver.findElement(By.xpath("//button[text() = 'Try it']")).click();
	}
	
	public static void main(String[] args) {
		iframeExample obj = new iframeExample();
		obj.BrowserSetUpThree("chrome", "https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
		obj.iframedemo();

	}

}
