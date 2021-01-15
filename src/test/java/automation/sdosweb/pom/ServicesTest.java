package automation.sdosweb.pom;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class ServicesTest {
	private WebDriver driver;
	ServicesPage servicespage;

	@Before
	public void setUp() throws Exception {
		servicespage = new ServicesPage(driver);
		driver = servicespage.firefoxConnection();
		servicespage.visit("https://www.sdos.es/");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() throws InterruptedException {
		servicespage.GoPageServices();
		Thread.sleep(2000);
		assertTrue(servicespage.isServicesDiSplayed());
	}

}
