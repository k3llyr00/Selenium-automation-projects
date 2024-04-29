import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropDown {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		//Drop-down with select tag; if tag name is 'select', its static drop-down
		WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select dropdown = new Select(staticDropdown);
		dropdown.selectByIndex(3); //Select the option 'USD'.
		System.out.println(dropdown.getFirstSelectedOption().getText()); //Log the selected text to Console
		dropdown.selectByVisibleText("AED");
		System.out.println(dropdown.getFirstSelectedOption().getText()); //Log the selected text to Console
		dropdown.selectByValue("INR");
		System.out.println(dropdown.getFirstSelectedOption().getText()); //Log the selected text to Console
		
		
		
		
		
		

	}

}