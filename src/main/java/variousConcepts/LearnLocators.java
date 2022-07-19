package variousConcepts;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnLocators {

	WebDriver driver;
	
	@Before
	public void init() {
		
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://objectspy.space/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		
	}
	
	@Test
	public void locateElements() throws InterruptedException {
		
		driver.findElement(By.name("firstname")).sendKeys("selenium");
		driver.findElement(By.linkText("OS-API Product FrontEnd")).click();
		driver.navigate().back();
		//driver.findElement(By.partialLinkText("TF-API Product")).click();
		driver.findElement(By.id("photo"));
		Thread.sleep(3000);
		
		//file upload
		//if tag is input use .sendkeys(path)
		//if tag is other than input, use Robot
		
		//CSS
		driver.findElement(By.cssSelector("input#tool-2")).click();
		driver.findElement(By.cssSelector("input[name='lastname'")).sendKeys("is fun");
		
		//xpath
		//absolute
		driver.findElement(By.xpath("html/body/div/div[2]/div[2]/form/div[13]/input")).sendKeys("I hate xpath");
	}
	
	@After
	public void tearDown() {
		driver.close();
		driver.quit();
	}
}
