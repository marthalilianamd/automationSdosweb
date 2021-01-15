package automation.sdosweb.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactPage extends Base{

	By menuMain = By.xpath("//*[@id=\"block-seedos-wheat-search-trigger\"]");
	By itemMenuContact = By.xpath("/html/body/div[2]/div/header/div/div[2]/nav/ul/li[5]");
	By contactLinkLocator = By.xpath("/html/body/div[2]/div/header/div/div[2]/nav/ul/li[5]/a");
	By speaktextLocator = By.xpath("/html/body/div[2]/div/div[3]/div/div/div");	
	By contactBtnLocator = By.xpath("/html/body/div[2]/div/div[3]/div/div/div/div/div[2]/a");	
	By formLocator = By.xpath("/html/body/div[2]");
	
	public ContactPage(WebDriver driver) {
		super(driver);		
	}
	
	/*
	 * Go to the form contact
	 */
	
	public void GoPageContact() throws InterruptedException {
		goToElement(menuMain);
		goToElement(itemMenuContact);
		click(contactLinkLocator);
		Thread.sleep(2000);
		scrollDown();		
		if(isDisplayed(speaktextLocator)){	
			click(contactBtnLocator);
		}else {
			System.out.println("Página de formulario de contacto no ha sido encontrada");
		}
	}
	/*
	 * Confirm that it's in the form 
	 */
	public boolean isContactFormDisplayed() {
		return isDisplayed(formLocator);
	}

}
