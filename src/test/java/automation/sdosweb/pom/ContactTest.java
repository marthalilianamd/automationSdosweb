package automation.sdosweb.pom;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class ContactTest {
	
	private WebDriver driver;
	ContactPage contactPage;

	@Before
	public void setUp() throws Exception {
		contactPage = new ContactPage(driver);
		driver = contactPage.firefoxConnection();
		contactPage.visit("https://www.sdos.es/");
	}

	@After
	public void tearDown() throws Exception {
		//driver.quit();
	}

	@Test
	public void test() throws InterruptedException {
		contactPage.GoPageContact();
		Thread.sleep(2000);
		assertTrue(contactPage.isContactFormDisplayed());
	}

}
