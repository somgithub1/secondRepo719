//CI/CD Project
package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
	WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver= driver;
		}
@FindBy (how=How.XPATH,using = ("//*[@id=\"side-menu\"]/li[2]/a"))
WebElement CRM_ELEMENT;
@FindBy (how=How.XPATH,using = ("//*[@id=\"side-menu\"]/li[2]/ul/li[1]/a"))
WebElement ADD_CONTACT_ELEMENT;
	@FindBy (how=How.ID,using = ("username"))
	WebElement USERNAME;
	@FindBy (how=How.ID, using =("password"))
	WebElement PASSWORD;
	@FindBy (how=How.XPATH, using = ("//button[@name='login']"))
	WebElement LOGIN_BUTTON;
	String UserName, Password;

	public void login () throws InterruptedException {
		USERNAME.sendKeys("techfiosdemo@gmail.com");
		PASSWORD.sendKeys("abc123");
		LOGIN_BUTTON.click();
		Thread.sleep(3000);
		CRM_ELEMENT.click();
		ADD_CONTACT_ELEMENT.click();
	
	
	
	}

}
