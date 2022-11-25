package belajarappium.stepdef;

import belajarappium.BaseTest;
import belajarappium.page.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class LoginStepDefs extends BaseTest {

  LoginPage loginPage = new LoginPage();

  @And("user input username with {string}")
  public void userInputUsernameWith(String username) {
    loginPage.inputUsername(username);
  }

  @And("user input password with {string}")
  public void userInputPasswordWith(String password) {
    loginPage.inputPassword(password);
  }

  @When("user click on login button")
  public void userClickOnLoginButton() {
    loginPage.clickLogin();
  }

  @Given("user is on login page")
  public void userIsOnLoginPage() {
    loginPage.validateOnPage();
  }
}
