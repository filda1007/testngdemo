package testngdemopackage;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class facebooklogin {
	WebDriver driver;
  @Test
  public void f() {
	    WebElement username = driver.findElement(By.xpath("//*[@id=\"email\"]"));
		username.sendKeys("filda@gmail.com");
		WebElement password = driver.findElement(By.name("pass"));
		password.sendKeys("fildapass");
		WebElement login = driver.findElement(By.name("login"));
		login.click();
  }
  @BeforeTest
  public void beforeTest() {
	    System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Desktop\\Automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	    driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
	   
        driver.close();
  }

}
