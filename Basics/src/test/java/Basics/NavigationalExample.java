package Basics;

public class NavigationalExample extends Base{
	
	public void navDemo() throws InterruptedException {
		
		//Thread.sleep is used only for demonstration purpose
		
		System.out.println("Navigating to youtube page");
		Thread.sleep(5000);
		driver.navigate().to("https://www.youtube.com");
		
		System.out.println("Navigating back to google page");
		Thread.sleep(5000);
		driver.navigate().back();
		
		System.out.println("Navigating forward to youtube page");
		Thread.sleep(5000);
		driver.navigate().forward();
		
		System.out.println("Refreshing youtube page");
		Thread.sleep(5000);
		driver.navigate().refresh();
	}

	public static void main(String[] args) {
		NavigationalExample obj = new NavigationalExample();
		obj.setupBrowser("chrome", "https://www.google.com");
		
		try {
			obj.navDemo();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
