package Basics;


import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;


public class Base1 {
	WebDriver driver;

	public void setupBrowser(String browser,  String url) {

		String fs = System.getProperty("file.separator");
		String currDir = System.getProperty("user.dir");
		String fileExtn = "";

		if(fs.equalsIgnoreCase("\\"))
			fileExtn = ".exe";

		String path = currDir + fs + "drivers" + fs ;

		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", path + "chromedriver" + fileExtn);
			driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", path + "geckodriver" + fileExtn);
			driver = new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver", path + "msedgedriver" + fileExtn);
			driver = new EdgeDriver();
		}
		else if(browser.equalsIgnoreCase("safari")) {
			driver = new SafariDriver();
		}
		else {
			System.out.println("Valid browser is not provided, hence quitting the automation run.");
			System.exit(0);
		}

		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//page load timeout ==> pom page
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		
		//scriptload timeout
		driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(10));
		
		//open url
		if(url != "")
			driver.get(url);
		else
			driver.get("about:blank");
	}

}
