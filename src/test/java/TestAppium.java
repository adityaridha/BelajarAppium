import io.appium.java_client.android.AndroidDriver;

public class TestAppium {

  AndroidDriver driver;

//  @BeforeTest
//  public void setup() {
//    DesiredCapabilities capabilities = new DesiredCapabilities();
//    capabilities.setCapability("platformName", "Android");
//    capabilities.setCapability("platformVersion", "12.0");
//    capabilities.setCapability("appPackage", "com.swaglabsmobileapp");
//    capabilities.setCapability("automationName", "UiAutomator2");
//    capabilities.setCapability("appActivity", ".MainActivity");
//
//    driver = new AndroidDriver(capabilities);
//  }
//
//  @Test
//  public void simpleTestAppium() throws InterruptedException {
//    LoginPage loginPage = new LoginPage(driver);
//    HomePage homePage = new HomePage(driver);
//
//    loginPage.inputUsername("standard_user");
//    loginPage.inputPassword("secret_sauce");
//    loginPage.clickLogin();
//
//    homePage.validateOnLoginPage();
//    homePage.swipeToElementWithText("Sauce Labs Onesie");
//  }
}
