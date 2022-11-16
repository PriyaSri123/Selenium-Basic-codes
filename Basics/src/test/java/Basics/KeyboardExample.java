package Basics;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class KeyboardExample  extends DemoFour{

	public void ex1()
	{
		WebElement tok = driver.findElement(By.id("search_form_homepage"));
		Actions ac = new Actions(driver);
		ac.sendKeys("absjk").build().perform();
	}
	public static void main(String[] args) {
		KeyboardExample k1 = new KeyboardExample();
		k1.BrowserSetUpThree("chrome", "https://duckduckgo.com/");
		k1.ex1();
	}

}
