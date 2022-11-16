package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class ScrollExample extends Base{
	
	public void youtubeExample() {
		setupBrowser("chrome", "https://www.youtube.com");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,2500)");
	}

	public void githubExample() {
		setupBrowser("chrome", "https://github.com");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	}
	
	public void amazonExample() {
		String url = "https://www.amazon.in/MI-Poco-Pitch-Black-Storage/dp/B08JCSS94S/"
				+ "ref=sr_1_omk_2?crid=2QZWKVI5Q3JML&keywords=mi%2Bmobile&qid=1662312857"
				+ "&sprefix=mi%2Bmobil%2Caps%2C267&sr=8-2&th=1";
		
		setupBrowser("chrome", url);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		WebElement techDetails = driver.findElement(By.xpath("//h1[text()='Technical Details']"));
		js.executeScript("arguments[0].scrollIntoView();", techDetails);
		
	}
	
	public static void main(String[] args) {
		ScrollExample obj = new ScrollExample();
//		obj.youtubeExample();
//		obj.githubExample();
		obj.amazonExample();
	}

}
