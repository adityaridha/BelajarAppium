package belajarappium.stepdef;

import belajarappium.BaseTest;
import belajarappium.page.HomePage;
import io.cucumber.java.en.Then;

public class HomeStepDefs extends BaseTest {

  HomePage homePage = new HomePage();

  @Then("user is on homepage")
  public void userIsOnHomepage() {
    homePage.validateOnPage();
  }
}
