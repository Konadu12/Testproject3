package es.vga.Konadus;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Assert;

public class KonadusTest {
	private WebDriver driver;
	String appURL = "www.google.com";
	
	public void testSetUp() {
		
		driver = new ChromeDriver();
	}

	@Test
	public void dummyTest() {
		Assert.assertTrue(true);
		driver.navigate().to(appURL);
		
		
		
	}
	
}
