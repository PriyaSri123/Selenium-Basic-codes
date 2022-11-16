package Basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
 
public class DoubleClickExampleInSelenium {
 
 public static void main(String[] args) throws InterruptedException {
 
 //Setting the path of Chrome Browser Driver
 String BrowserDriverPath= "C:\\SeleniumBrowserDrivers\\chromedriver.exe";
 
 System.setProperty("webdriver.chrome.driver",BrowserDriverPath); 
 
        WebDriver driver = new ChromeDriver(); 
 
 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); 
 
 driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_ondblclick"); 
 
 driver.manage().window().maximize();
 
 //Switching to the iframe as the paragraph is inside an iframe
 driver.switchTo().frame("iframeResult");
 WebElement elementText=driver.findElement(By.xpath("/html/body/p[1]"));       
        
        //Do a right click on the body of the page
 Actions actions = new Actions(driver); 
 
        actions.doubleClick(elementText).perform();
        
        System.out.println(driver.findElement(By.xpath("//*[@id=\"demo\"]")).getText());
        
     //Uncomment following line to Close the browser
     //driver.quit();
 }
}