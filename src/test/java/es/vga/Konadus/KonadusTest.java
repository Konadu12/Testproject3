package es.vga.Konadus;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.junit.Assert;

public class KonadusTest {
	

	@Test
	public void dummyTest() {
		Assert.assertTrue(true);
		WebDriver driver = new SafariDriver();
		driver.get("file:///Users/amankwaah/Desktop/website/vivid-photo/index.html");
		driver.manage().window().maximize();
		
	}
	
}
