package Basics;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SelectBasedEx extends DemoFour {
	public void selectdemo() {
		Select tok = new Select(driver.findElement(By.id("oldSelectMenu")));
		//tok.selectByIndex(1);
		
		//tok.selectByValue("3");
		tok.selectByVisibleText("Aqua");
		System.out.println(tok.getFirstSelectedOption().getText());
		System.out.println(tok.isMultiple());
		Select select = new Select(driver.findElement(By.id("cars")));
		System.out.println(select.isMultiple());
		if(select.isMultiple()){

            //Selecting option as 'Opel'-- ByIndex
            System.out.println("Select option Opel by Index");
            select.selectByIndex(2);

            //Selecting the option as 'Saab'-- ByValue
            System.out.println("Select option saab by Value");
            select.selectByValue("saab");

            // Selecting the option by text
            System.out.println("Select option Audi by Text");
            select.selectByVisibleText("Audi");
            
            select.selectByVisibleText("Volvo");

            //Get the list of selected options
            System.out.println("The selected values in the dropdown options are -");

            List<WebElement> selectedOptions = select.getAllSelectedOptions();

            for(WebElement selectedOption: selectedOptions)
                System.out.println(selectedOption.getText());


//            // Deselect the value "Audi" by Index
//            System.out.println("DeSelect option Audi by Index");
//            select.deselectByIndex(3);
//
//            //Deselect the value "Opel" by visible text
//            System.out.println("Select option Opel by Text");
//            select.deselectByVisibleText("Opel");
//
//            //Validate that both the values are deselected
//            System.out.println("The selected values after deselect in the dropdown options are -");
//            List<WebElement> selectedOptionsAfterDeselect = select.getAllSelectedOptions();
//
//            for(WebElement selectedOptionAfterDeselect: selectedOptionsAfterDeselect)
//                System.out.println(selectedOptionAfterDeselect.getText());
//
//            //Step#8- Deselect all values
//            select.deselectAll();
        }
	
	}	
	public static void main(String[] args) {
		SelectBasedEx s2 = new SelectBasedEx();
		DemoFour.BrowserSetUpThree("chrome", "https://demoqa.com/select-menu");
		s2.selectdemo();

	}

}
