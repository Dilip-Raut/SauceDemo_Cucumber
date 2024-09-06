package definations;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Utils.HelperClass;
import actions.HomePageActions;
import actions.LoginPageActions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageDefinitions {

	LoginPageActions objLogin = new LoginPageActions();
	HomePageActions objHomePage = new HomePageActions();	
	
	@Given("User is on sauceDemo page {string}")
	public void user_is_on_sauce_demo_page(String url) {
		HelperClass.openPage(url);
	}
	
	@When("User entered username as {string} and Password as {string}")
	public void user_entered_username_as_and_password_as(String userName, String passWord) {
		objLogin.login(userName, passWord);
	}
	
	@When("User click on sign in button")
	public void user_click_on_sign_in_button() {
		 objLogin.clickLogin();
	}
	
	@Then("Validate the title after login")
	public void validate_the_title_after_login() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

}
