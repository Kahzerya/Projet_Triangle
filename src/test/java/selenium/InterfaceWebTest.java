package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class InterfaceWebTest {
	
	private WebDriver driver;
	
	@BeforeTest
	public void init(){
		
		System.setProperty("webdriver.chrome.driver", "resources\\webdriver\\chromedriver.exe");
		driver = new ChromeDriver();
		
	}
	
	@AfterTest
	public void fin() {
		driver.quit();
	}
	
	@Test
	public void InterfaceTest() {
		driver.get("http://localhost:9090/Projet_Triangle/creerTriangle.jsp");
		
	}

}
