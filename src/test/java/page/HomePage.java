package page;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {

    WebDriverWait wait;
    AndroidDriver driver;

    public HomePage(AndroidDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        PageFactory.initElements(driver, this);
    }

    public void validateOnLoginPage() {
        wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.accessibilityId("test-Cart")));
    }

    public void swipeToElementWithText(String text) {
        driver.findElement(new AppiumBy.ByAndroidUIAutomator(
                String.format("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"%s\"))", text)));
    }


}
