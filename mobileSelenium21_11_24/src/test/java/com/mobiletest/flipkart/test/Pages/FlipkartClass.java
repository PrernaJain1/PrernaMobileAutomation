package com.mobiletest.flipkart.test.Pages;

import com.mobiletest.flipkart.test.Base.BaseClassFlipkart;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class FlipkartClass extends BaseClassFlipkart {

    public AndroidDriver driver;

    @FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"Account\"]/android.widget.ImageView")
    public static WebElement account;

    @FindBy(xpath = "//android.widget.TextView[@text=\"Log In\"]")
    public static WebElement loginButton;

    @FindBy(id ="com.flipkart.android:id/dialog_content")
    public static WebElement frameLayout;

//    @FindBy(xpath = "//android.widget.EditText[@id='com.flipkart.android:id/phone_input']")
//    public static WebElement phoneNumber;

    @FindBy(xpath = "//android.widget.TextView[@resource-id=\"com.flipkart.android:id/button\"]")
    public static WebElement continueButton;

    @FindBy(xpath= "//android.widget.TextView[@text=\"Orders\"]")
    public static WebElement order;

    public FlipkartClass(AndroidDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public static void login() throws InterruptedException {
        account.click();
        loginButton.click();
        frameLayout.findElement(By.id("com.flipkart.android:id/phone_input")).sendKeys("9149037159");
//        phoneNumber.sendKeys("9149037159");
        continueButton.click();
        Thread.sleep(6000);
    }

    public static void orders() throws InterruptedException {
        BaseClassFlipkart.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//        BaseClassFlipkart.driver.manage().timeouts().implicitlyWait(10);
        account.click();
        order.click();
    }

}
