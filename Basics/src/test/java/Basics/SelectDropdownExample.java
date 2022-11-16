package Basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SelectDropdownExample extends DemoFour {

	void selectDemo()
	{
		Select month = new Select(driver.findElement(By.name("country")));
		//month.selectByIndex(0);
		
		//month.selectByValue("ALBANIA");
		
		//month.selectByVisibleText("ALGERIA");
		month.selectByVisibleText("AUSTRALIA");
		month.isMultiple();
		//for multiple select page
//		month.deselectAll();
//		month.deselectByIndex(0);
//		month.deselectByValue(null);
     	List <WebElement> samp =   month.getAllSelectedOptions();
		List <WebElement> samp2 =   month.getOptions();
		int i =0;
		for(WebElement samp1  : month.getOptions() )
		{
			i =i+1;
			System.out.println(samp1.getText());
		}
		System.out.println("Total no of countries available :" +i);
		for(WebElement samp3  : month.getAllSelectedOptions() )
		{
			i =i+1;
			System.out.println(samp3.getText());
		}
		System.out.println("Total no of countries selected :" +i);
		month.getOptions();
	}
	public static void main(String[] args) {
		SelectDropdownExample s1 = new SelectDropdownExample();
		DemoFour.BrowserSetUpThree("chrome", "https://demo.guru99.com/test/newtours/register.php");
		s1.selectDemo();

	}

}
