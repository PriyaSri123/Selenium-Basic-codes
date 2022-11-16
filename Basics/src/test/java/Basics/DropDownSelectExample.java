package Basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
 
public class DropDownSelectExample extends DemoFour {
 
 public static void main(String[] args) throws InterruptedException {
 
        
        
 //Navigating to Facebook
        driver.get("https://www.facebook.com/");
        
        //Clicking on the Create New Account on Facebook login page
        driver.findElement(By.id("u_0_2")).click();        
        
        //Waiting for Six Seconds
        Thread.sleep(6000);
        
        //Switching to active Pop-up Window
        driver.switchTo().activeElement();
        
        //Waiting for 5 Seconds to load the pop-up window
        Thread.sleep(5000);
        
        Boolean visibleState =driver.findElement(By.id("month")).isDisplayed();
        System.out.println("The Dropdown visibility is: "+visibleState);
         
        if(visibleState)
        {
            Boolean status =driver.findElement(By.id("month")).isEnabled();
            System.out.println("The status of Dropdown is: "+status);
         
            //If Dropdown is enabled select desired value
            if(status)
            {
            	WebElement DropDownElement=driver.findElement(By.xpath("//select[@id='month']"));
                
                //Creating Dropdown object for Month Dropdown
                Select dropdownSelectObject=new Select(DropDownElement);
                
                List<WebElement> DrpDownList=dropdownSelectObject.getOptions();
                Boolean flagitem=false;       
                for(int i=0;i<DrpDownList.size();i++ )
                {
                	if(DrpDownList.get(i).getText().equalsIgnoreCase("Jun"))
                	{
                 System.out.println("Required Value exists in the dropdown");
                 dropdownSelectObject.selectByVisibleText("Jun");
                 
                 //Getting Selected item element
                 WebElement selectedItem = dropdownSelectObject.getFirstSelectedOption();
                 
                 //Getting the text value of Selected Item
                 String strSelectedValue = selectedItem.getText();
                 
                 //Comparing the Selected item with the expected value i.e Jun
                 if(strSelectedValue.equalsIgnoreCase("Jun"))
                 {
                 System.out.println("Desired Month Jun is selected in the dropdwon");
                 flagitem=true;
                 break;
                 }     
                	  
                	}
                	
                }  
                if(flagitem==false)
                {
                	System.out.println("Required Value not found in the dropdown");
                }
            }
        }
        
        //close browser
        driver.close();
 }
}