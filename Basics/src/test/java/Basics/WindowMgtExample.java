package Basics;


import java.util.ArrayList;

import org.openqa.selenium.By;

public class WindowMgtExample extends Base{
	
	public void demo() {
		/*
		driver.getWindowHandle();//the id of the current active tab
		driver.getWindowHandles();//set of all the tabs ids which is opened from the current browser instance(driver)
		driver.switchTo().window("<window-id>");
		
		driver.close();//close the tab
		driver.quit();//quit the browser
		*/
		
		System.out.println("****************Before opening the insta page****************");
		System.out.println("Current window handle = " + driver.getWindowHandle());
		System.out.println("Total windows = " + driver.getWindowHandles());
		System.out.println("page title = " +driver.getTitle());
		
		driver.findElement(By.partialLinkText("Instagram")).click();
		
		System.out.println("\n****************After opening the insta page****************");
		System.out.println("Current window handle = " + driver.getWindowHandle());
		System.out.println("Total windows = " + driver.getWindowHandles());
		System.out.println("page title = " +driver.getTitle());
		
		System.out.println("****************Switching to insta page****************");
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		
		System.out.println("\n****************After switching to insta page****************");
		System.out.println("Current window handle = " + driver.getWindowHandle());
		System.out.println("Total windows = " + driver.getWindowHandles());
		System.out.println("page title = " +driver.getTitle());
		
		System.out.println("**************closing insta page*****************");
		driver.close();
		
		System.out.println("**************switching the control to fb page*****************");
		driver.switchTo().window(tabs.get(0));
		
		System.out.println("\n****************After switching to insta page****************");
		System.out.println("Current window handle = " + driver.getWindowHandle());
		System.out.println("Total windows = " + driver.getWindowHandles());
		System.out.println("page title = " +driver.getTitle());
		
		System.out.println("**************Qutting the browser*****************");
		driver.quit();

		
	}

	public static void main(String[] args) {
		WindowMgtExample obj = new WindowMgtExample();
		obj.setupBrowser("chrome", "https://www.facebook.com");
		obj.demo();
	}

}
