import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import page.HomePage;
import page.LoginPage;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class TestAppium {

  AndroidDriver driver;

  @BeforeTest
  public void setup() {
    DesiredCapabilities capabilities = new DesiredCapabilities();
    capabilities.setCapability("platformName", "Android");
    capabilities.setCapability("platformVersion", "12.0");
    capabilities.setCapability("appPackage", "com.swaglabsmobileapp");
    capabilities.setCapability("automationName", "UiAutomator2");
    capabilities.setCapability("appActivity", ".MainActivity");

    driver = new AndroidDriver(capabilities);
  }

  @Test
  public void simpleTestAppium() throws InterruptedException {
    LoginPage loginPage = new LoginPage(driver);
    HomePage homePage = new HomePage(driver);

    loginPage.inputUsername("standard_user");
    loginPage.inputPassword("secret_sauce");
    loginPage.clickLogin();

    homePage.validateOnLoginPage();
    homePage.swipeToElementWithText("Sauce Labs Onesie");
  }
}
