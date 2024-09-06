package actions;

import org.openqa.selenium.support.PageFactory;

import Locators.LoginPageLocators;
import Utils.HelperClass;

public class LoginPageActions {

	LoginPageLocators loginPageLocators = null;

	public LoginPageActions() {

		this.loginPageLocators = new LoginPageLocators();

		PageFactory.initElements(HelperClass.getDriver(), loginPageLocators);
	}

	// Get the Error Message
	public String getErrorMessage() {
		return loginPageLocators.errorMessage.getText();
	}

	public void login(String strUserName, String strPassword) {

		loginPageLocators.userName.sendKeys(strUserName);
		loginPageLocators.password.sendKeys(strPassword);
		

	}
	public void clickLogin() {
		loginPageLocators.login.click();
	}
}
