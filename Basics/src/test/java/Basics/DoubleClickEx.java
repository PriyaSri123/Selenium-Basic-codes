package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickEx extends Base {
	
	public void demo()
	{
		WebElement o1 = driver.findElement(By.xpath("//span[text() = 'TestNG | INSTALL & SETUP']"));
		Actions ac = new Actions(driver);
		ac.doubleClick(o1).build().perform();
	}

	public static void main(String[] args) {
		DoubleClickEx d1 = new DoubleClickEx();
		d1.setupBrowser("chrome", "https://stqatools.com/");
		d1.demo();

	}

}
