package Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class myFristTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		String baseUrl;
		 driver = new FirefoxDriver();
		 baseUrl = "http://easyshop.com.ng/";
		driver.get(baseUrl + "/index.php?route=common/home");
		driver.findElement(By.id("search")).clear();

	}

}
