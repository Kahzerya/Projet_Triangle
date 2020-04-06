package selenium;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
	public void interfaceTest() {
		driver.get("http://localhost:9090/Projet_Triangle/creerTriangle.jsp");
		
		String expected = "http://localhost:9090/Projet_Triangle/creerTriangle.jsp";
		assertEquals(driver.getCurrentUrl(), expected);
		
	}
	
	@Test
	public void completionTest() {
		driver.get("http://localhost:9090/Projet_Triangle/creerTriangle.jsp");
		
		WebElement firstPointX = driver.findElement(By.xpath("//*[@id=\"firstPointX\"]"));
		WebElement firstPointY = driver.findElement(By.xpath("//input[@id='firstPointY']"));
		
		WebElement secondPointX = driver.findElement(By.xpath("//input[@id='secondPointX']"));
		WebElement secondPointY = driver.findElement(By.xpath("//input[@id='secondPointY']"));
		
		WebElement thirdPointX = driver.findElement(By.xpath("//input[@id='thirdPointX']"));
		WebElement thirdPointY = driver.findElement(By.xpath("//input[@id='thirdPointY']"));
		
		firstPointX.sendKeys("2");
		firstPointY.sendKeys("2");
		
		secondPointX.sendKeys("5");
		secondPointY.sendKeys("3");
		
		thirdPointX.sendKeys("3");
		thirdPointY.sendKeys("5");
		
		driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
		
		assertEquals(driver.getCurrentUrl(), "http://localhost:9090/Projet_Triangle/creationTriangle?firstPointX=2&firstPointY=2&secondPointX=5&secondPointY=3&thirdPointX=3&thirdPointY=5");
		
		assertEquals(driver.findElement(By.xpath("//p[@id=\"firstpoint\"]")).getText(), "Le premier point créée a pour coordonnées : 2 et 2");
		assertEquals(driver.findElement(By.xpath("//p[@id=\"secondpoint\"]")).getText(), "Le second point créée a pour coordonnées : 5 et 3");
		assertEquals(driver.findElement(By.xpath("//p[@id=\"thirdpoint\"]")).getText(), "Le troisième point créée a pour coordonnées : 3 et 5");
		assertEquals(driver.findElement(By.xpath("//p[@id=\"triangle\"]")).getText(), "Le triangle est Isocele");
	}

}
