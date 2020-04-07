package selenium;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class InterfaceWebErreurDeSaisieTest {
	
	private WebDriver driver;
	private int cpt =0;
	
	@BeforeTest
	public void init(){
		
		System.setProperty("webdriver.chrome.driver", "resources\\webdriver\\chromedriver.exe");
		driver = new ChromeDriver();
		
	}
	
	@AfterTest
	public void fin() {
		driver.quit();
		System.out.println("Fin de InterfaceWebErreurSaisieTest");
	}
	
	@BeforeMethod
	public void compteur() {
		cpt++;
		System.out.println("Début de InterfaceWebErreurSaisieTest n°"+cpt);
	}
	
	@Test
	public void interfaceTest() {
		driver.get("http://localhost:9090/Projet_Triangle/creerTriangle.jsp");
		
		String expected = "http://localhost:9090/Projet_Triangle/creerTriangle.jsp";
		assertEquals(driver.getCurrentUrl(), expected);
		System.out.println("interfaceTest PASSED");
	}
	
	@Test
	public void champVideTest() {
		driver.get("http://localhost:9090/Projet_Triangle/creerTriangle.jsp");
		
		WebElement firstPointX = driver.findElement(By.xpath("//*[@id=\"firstPointX\"]"));
		WebElement firstPointY = driver.findElement(By.xpath("//input[@id='firstPointY']"));
		
		WebElement secondPointX = driver.findElement(By.xpath("//input[@id='secondPointX']"));
		WebElement secondPointY = driver.findElement(By.xpath("//input[@id='secondPointY']"));
		
		WebElement thirdPointX = driver.findElement(By.xpath("//input[@id='thirdPointX']"));
		WebElement thirdPointY = driver.findElement(By.xpath("//input[@id='thirdPointY']"));
		
		firstPointX.sendKeys(""); //champ vide
		firstPointY.sendKeys("2");
		
		secondPointX.sendKeys("5");
		secondPointY.sendKeys("3");
		
		thirdPointX.sendKeys("3");
		thirdPointY.sendKeys("5");
		
		driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
		
		assertNotEquals(driver.getCurrentUrl(), "http://localhost:9090/Projet_Triangle/creationTriangle?firstPointX=&firstPointY=2&secondPointX=5&secondPointY=3&thirdPointX=3&thirdPointY=5");
		
		System.out.println("champvideTest PASSED");
	}
	
	@Test
	public void virguleTest() {
		driver.get("http://localhost:9090/Projet_Triangle/creerTriangle.jsp");
		
		WebElement firstPointX = driver.findElement(By.xpath("//*[@id=\"firstPointX\"]"));
		WebElement firstPointY = driver.findElement(By.xpath("//input[@id='firstPointY']"));
		
		WebElement secondPointX = driver.findElement(By.xpath("//input[@id='secondPointX']"));
		WebElement secondPointY = driver.findElement(By.xpath("//input[@id='secondPointY']"));
		
		WebElement thirdPointX = driver.findElement(By.xpath("//input[@id='thirdPointX']"));
		WebElement thirdPointY = driver.findElement(By.xpath("//input[@id='thirdPointY']"));
		
		firstPointX.sendKeys("2,8"); //champ avec une virgule
		firstPointY.sendKeys("2");
		
		secondPointX.sendKeys("5");
		secondPointY.sendKeys("3");
		
		thirdPointX.sendKeys("3");
		thirdPointY.sendKeys("5");
		
		driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
		
		assertNotEquals(driver.getCurrentUrl(), "http://localhost:9090/Projet_Triangle/creationTriangle?firstPointX=2,8&firstPointY=2&secondPointX=5&secondPointY=3&thirdPointX=3&thirdPointY=5");
		
		System.out.println("virguleTest PASSED");
	}
	
	@Test
	public void textTest() {
		driver.get("http://localhost:9090/Projet_Triangle/creerTriangle.jsp");
		
		WebElement firstPointX = driver.findElement(By.xpath("//*[@id=\"firstPointX\"]"));
		WebElement firstPointY = driver.findElement(By.xpath("//input[@id='firstPointY']"));
		
		WebElement secondPointX = driver.findElement(By.xpath("//input[@id='secondPointX']"));
		WebElement secondPointY = driver.findElement(By.xpath("//input[@id='secondPointY']"));
		
		WebElement thirdPointX = driver.findElement(By.xpath("//input[@id='thirdPointX']"));
		WebElement thirdPointY = driver.findElement(By.xpath("//input[@id='thirdPointY']"));
		
		firstPointX.sendKeys("blabla"); //champ avec une du texte
		firstPointY.sendKeys("2");
		
		secondPointX.sendKeys("5");
		secondPointY.sendKeys("3");
		
		thirdPointX.sendKeys("3");
		thirdPointY.sendKeys("5");
		
		driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
		
		assertNotEquals(driver.getCurrentUrl(), "http://localhost:9090/Projet_Triangle/creationTriangle?firstPointX=blabla&firstPointY=2&secondPointX=5&secondPointY=3&thirdPointX=3&thirdPointY=5");
		
		System.out.println("textTest PASSED");
	}

}
