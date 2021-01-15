package automation.sdosweb.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ServicesPage extends Base{
	
	By menuMain = By.xpath("//*[@id=\"block-seedos-wheat-search-trigger\"]");
	By itemMenuServices = By.xpath("/html/body/div[2]/div/header/div/div[2]/nav/ul/li[1]");
	By servicesLinkLocator = By.xpath("/html/body/div[2]/div/header/div/div[2]/nav/ul/li[1]/a");
	
	By servicesLocator = By.xpath("/html/body/div[2]/div/main/div/div/div[2]/article/div/div/div[1]/div/div[1]");
	By conceptsLocator = By.xpath("/html/body/div[2]/div/main/div/div/div[2]/article/div/div/div[1]/div/div[2]/div[1]/div");
	By servicesTextLocator = By.xpath("/html/body/div[2]/div/main/div/div/div[2]/article/div/div/div[1]/div/div[1]");
	
	public ServicesPage(WebDriver driver) {
		super(driver);
	}
	
	/*
	 * Go to the services web
	 */
	
	public void GoPageServices() throws InterruptedException {
		goToElement(menuMain);
		goToElement(itemMenuServices);
		click(servicesLinkLocator);
		Thread.sleep(2000);
		goToElement(servicesLocator);
		goToElement(conceptsLocator);
		if(isDisplayed(servicesLocator)){
			System.out.println("Los servicios fueron encontrados");
		}else {
			System.out.println("Los servicios no fueron encontradod");
		}
	}
	
	/*
	 * Confirm that it's in the services info
	 */
	public boolean isServicesDiSplayed() {
		return isDisplayed(servicesTextLocator);
	}

}
