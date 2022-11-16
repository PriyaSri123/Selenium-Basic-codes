package Basics;

public class Test extends Base{
	
	public void testMethod() {
		System.out.println(driver.getTitle());
	}

	public static void main(String[] args) {
//		Test obj = new Test();
//		obj.setupBrowser("ChRome", "https://www.facebook.com");
//		obj.testMethod();
		LocatorExample obj = new LocatorExample();
		obj.setupBrowser("edge", "https://www.gmail.com");
		obj.locatorDemo();
		
	}
}
