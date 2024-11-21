package com.mobiletest.flipkart.test.Base;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseClassFlipkart {

    public static AndroidDriver driver;

    public static void initialize() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName","One Plus 11R 5G");
        capabilities.setCapability("platformName","ANDROID");
        capabilities.setCapability("platformVersion","13");
        capabilities.setCapability("appPackage","com.flipkart.android");
        capabilities.setCapability("appActivity","com.flipkart.android.SplashActivity");
        capabilities.setCapability("udid","9a9be1b1");
        capabilities.setCapability("ignoreHiddenApiPolicyError","true");
        capabilities.setCapability("automationName","UIAutomator2");
        capabilities.setCapability("noReset","true");

        URL url = new URL("http://127.0.0.1:4723/wd/hub");
        driver= new AndroidDriver(url,capabilities);
    }
    

    public static void dinitialize(){
        driver.quit();
    }

    public static void moveToElement(WebElement element){
        JavascriptExecutor script = (JavascriptExecutor) driver;
        script.executeScript("arguments[0].scrollIntoView(true)",element);
    }

}
