package TestNG;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class tc1 {
	 WebDriver driver;

   		@BeforeMethod
		public void launch() {
		  System.setProperty("webdriver.chrome.driver","/usr/bin/chromedriver");
		  ChromeOptions options = new ChromeOptions();
		  options.addArguments("start-maximized"); // open Browser in maximized mode
	          options.addArguments("disable-infobars"); // disabling infobars
		  options.addArguments("--disable-extensions"); // disabling extensions
		  options.addArguments("--disable-dev-shm-usage"); // overcome limited resource problems
		  options.addArguments("--headless");
		  options.addArguments("--no-sandbox"); // Bypass OS security model
		  options.addArguments("--disable-setuid-sandbox");
		  //options.addArguments("--window-size=1920x1080");
		  driver = new ChromeDriver(options);
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		  driver.get("http://15.207.89.196:32776/addressbook/");
		
		}
		
	  @Test
	  public void verfiy() {
		 
		  driver.findElement(By.xpath("//div[@class='v-button v-widget']")).click();
		  driver.findElement(By.id("gwt-uid-5")).sendKeys("Meera");
		  driver.findElement(By.id("gwt-uid-7")).sendKeys("Selenium");
		  driver.findElement(By.id("gwt-uid-9")).sendKeys("9876543210");
		  driver.findElement(By.id("gwt-uid-11")).sendKeys("meera@gmail.com");
		  driver.findElement(By.id("gwt-uid-13")).sendKeys("9/01/21,");
		  driver.findElement(By.xpath("//div[@class='v-button v-widget primary v-button-primary']")).click();
		  
	  }
	  
	  @AfterMethod
	  public void close() {
		 driver.close();
 }
  }
