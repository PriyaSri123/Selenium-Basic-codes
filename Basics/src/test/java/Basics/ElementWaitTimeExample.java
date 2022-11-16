package Basics;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementWaitTimeExample extends Base{


	public void explicitWaitExample() {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		//		WebElement email = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("email"))));
		//		email.sendKeys("ramesh@gmail.com");

		WebElement hiddenElem = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.name("jazoest"))));
		hiddenElem.sendKeys("test@1234");

	}

	public void fluentWaitExample() {

		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofSeconds(2))
				.ignoring(NoSuchElementException.class);

		//		WebElement email = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("email"))));
		//		email.sendKeys("ramesh@gmail.com");

		WebElement hiddenElem = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.name("jazoest"))));
		hiddenElem.sendKeys("test@1234");

	}


	public static void main(String[] args) {
		ElementWaitTimeExample obj = new ElementWaitTimeExample();
		obj.setupBrowser("chrome", "https://www.facebook.com");
		//		obj.explicitWaitExample();
		obj.fluentWaitExample();
	}

}
