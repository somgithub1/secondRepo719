package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.LoginPage;
import util.BrowserFactory;

public class LoginTest {

@Test
public void techfiosLogin() throws InterruptedException {
	
	WebDriver driver = BrowserFactory.startBrowser();
LoginPage mylogin = PageFactory.initElements(driver, LoginPage.class);
mylogin.login();
driver.close();
driver.quit();

}
	
}
