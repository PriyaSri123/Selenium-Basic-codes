package Basics;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_one extends DemoFour {

	
	void actionsfn()
	{
		WebElement oslo = driver.findElement(By.id("box1"));
		WebElement nor = driver.findElement(By.id("box101"));
		Actions ac = new Actions (driver);
		ac.dragAndDrop(oslo, nor).build().perform();
		
	}
	public static void main(String[] args) {
		Actions_one s1 = new Actions_one();
		DemoFour.BrowserSetUpThree("chrome", "http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		s1.actionsfn();

	}

}
