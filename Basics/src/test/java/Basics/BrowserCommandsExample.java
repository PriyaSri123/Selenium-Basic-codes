package Basics;


public class BrowserCommandsExample extends Base{
	
	public void browserCommandsDemo() {
		//get
//		driver.get("https://www.youtube.com");
		
		//get title
//		String pageTitle = driver.getTitle();
//		System.out.println("page title = " + pageTitle);
		
//		layman's way of writing the testcase
//		String expectedTitle = "Facebook – log in or sign up";
//		String actualTitle = driver.getTitle();
//		
//		if(actualTitle.equals(expectedTitle))
//			System.out.println("page title validation - passed");
//		else
//			System.out.println("page title validation - failed");
		
		//getting the url
//		String url = driver.getCurrentUrl();
//		System.out.println("page url = " + url);
		
		//page source
//		String pageSource = driver.getPageSource();
//		System.out.println(pageSource);
//		System.out.println(pageSource.contains("title"));
		
		//for demonstration purpose, thread.sleep
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//closing of tab
//		driver.close();
		
		//close window of the current instance
		driver.quit();

	}
	
	

	public static void main(String[] args) {
		BrowserCommandsExample obj = new BrowserCommandsExample();
		obj.setupBrowser("chrome", "https://www.facebook.com");
		obj.browserCommandsDemo();
	}

}
