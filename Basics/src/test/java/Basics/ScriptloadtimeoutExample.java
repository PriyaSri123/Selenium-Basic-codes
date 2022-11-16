package Basics;

import org.openqa.selenium.JavascriptExecutor;

public class ScriptloadtimeoutExample extends Base{

	public void demo() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 500);");
	}
	
	
	public static void main(String[] args) {
		ScriptloadtimeoutExample obj = new ScriptloadtimeoutExample();
		obj.setupBrowser("chrome", "https://www.facebook.com");
		obj.demo();
	}

}
