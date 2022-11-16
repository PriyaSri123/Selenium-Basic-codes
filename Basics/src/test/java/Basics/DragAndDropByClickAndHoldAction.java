package Basics;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropByClickAndHoldAction extends DemoFour {

	public static void main(String[] args)  {
					
		DemoFour.BrowserSetUpThree("chrome", "https://javascript.info/article/mouse-drag-and-drop/ball4/");		
		
		driver.manage().window().maximize();
		
		//driver.switchTo().frame("iframeResult");
		        
        //Opening a link in a new tab in Selenium using action class
        WebElement dgragFrom = driver.findElement(By.xpath("//*[@id=\"ball\"]"));  
        
        WebElement dropTo = driver.findElement(By.xpath("//*[@id=\"gate\"]"));      
        
        Actions actions = new Actions(driver);
        
        //Click and Holding the dgragFrom element and moving it to dropTo element
        //and then release the element 
        Action dragAndDropAction = actions.clickAndHold(dgragFrom)
        		.moveToElement(dropTo)
        		.release(dropTo)
        		.build();
        
        //Using perform method to perform above sequence of action
        dragAndDropAction.perform();
            
	    //Uncomment following line to Close the browser
	    //driver.quit();
	}
}