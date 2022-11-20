package page;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {

    WebDriverWait wait;
    AndroidDriver driver;

    By loginTextBox = AppiumBy.accessibilityId("test-Username");
    By passwordTextBox = AppiumBy.accessibilityId("test-Password");
    By loginButton = AppiumBy.accessibilityId("test-LOGIN");

    public LoginPage(AndroidDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        PageFactory.initElements(driver, this);
    }

    public void inputUsername(String username) {
        wait.until(ExpectedConditions.presenceOfElementLocated(loginTextBox));
        driver.findElement(loginTextBox).sendKeys(username);
    }

    public void inputPassword(String password) {
        wait.until(ExpectedConditions.presenceOfElementLocated(passwordTextBox));
        driver.findElement(passwordTextBox).sendKeys(password);
    }

    public void clickLogin() {
        wait.until(ExpectedConditions.presenceOfElementLocated(loginButton));
        driver.findElement(loginButton).click();
    }
}
