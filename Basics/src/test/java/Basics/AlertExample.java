package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AlertExample extends Base{
	
	public void alertDemo() {
		WebElement promptAlertBtn = driver.findElement(By.xpath("//button[contains(text(),'Prompt')]"));
		
		promptAlertBtn.click();
		
		
		String msg = driver.switchTo().alert().getText();
		System.out.println("alert msg = " + msg);
		
		//OK or Submit or Accept
//		driver.switchTo().alert().accept();
		
		//cancel or close or dismiss or keyboard esc
//		driver.switchTo().alert().dismiss();
		
		//type or send text
		driver.switchTo().alert().sendKeys("dan@gmail.com");		
	}

	public static void main(String[] args) {
		AlertExample obj = new AlertExample();
		obj.setupBrowser("firefox", "https://the-internet.herokuapp.com/javascript_alerts");
		obj.alertDemo();
	}

}
