package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MoveToElementExample extends DemoFour {

	public void ex()
	{
		WebElement t1 = driver.findElement(By.id("icp-nav-flyout"));
		Actions ac = new Actions(driver);
		ac.moveToElement(t1).build().perform();
		WebElement t2 = driver.findElement(By.xpath("//span[text()='español']"));
		t2.click();
	}
	public static void main(String[] args) {
		MoveToElementExample m1 = new MoveToElementExample();
		DemoFour.BrowserSetUpThree("chrome", "https://www.amazon.com/");
		m1.ex();
		
	}

}
