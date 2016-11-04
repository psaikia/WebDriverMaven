import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Logintest {

	public static WebDriver driver;
	
	@BeforeSuite
	public void setup(){

	
		System.setProperty("webdriver.chrome.driver","C:/Users/t_prachujs/Documents/way2automation/chromedriver/chromedriver.exe");
		  driver = new ChromeDriver();
		
		
		 //driver = new FirefoxDriver();
		
		}
	
	@Test
	public void doLogin() throws InterruptedException{
		driver.get("http://www.gmail.com");
		driver.findElement(By.id("Email")).sendKeys("cspraengg4@gmail.com");
		driver.findElement(By.id("next")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("Passwd")).sendKeys("mynewpswd123");
		driver.findElement(By.id("signIn")).click();
		
		
	}
	
		
	}
	
		

	

