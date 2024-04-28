import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class WindowActivities {

	public static void main(String[] args) {

		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("http://google.com"); // .get Selenium will pause until all components on page is fully loaded
		driver.navigate().to("https://rahulshettyacademy.com/"); // .navigate Selenium will continue when the page is loaded (is not wait the loading of components)
		driver.navigate().back(); // google.com
		driver.navigate().forward(); //https://rahulshettyacademy.com
	}

}
