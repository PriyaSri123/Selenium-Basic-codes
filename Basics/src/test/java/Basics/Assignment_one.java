package Basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import dev.failsafe.internal.util.Assert;

public class Assignment_one extends DemoFour {

	/*
	 * public void basic_check() { WebElement sim_mod_click =
	 * driver.findElement(By.id("simpleModal")); sim_mod_click.click(); }
	 */
	public void form_check()
	{
		driver.manage().window().maximize();
		/*WebElement main_tab = driver.findElement(By.id("formModal"));
		main_tab.click();*/
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement ele = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//button[contains(id,'formModal')]")));
		ele.click();
		
		
	}
	public static void main(String[] args) {
		Assignment_one a1 = new Assignment_one();
		DemoFour.BrowserSetUpThree("chrome", "https://automatenow.io/sandbox-automation-testing-practice-website/modals/");
		//a1.basic_check();
		a1.form_check();

	}

}
