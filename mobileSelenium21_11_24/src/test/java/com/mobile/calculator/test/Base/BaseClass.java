package com.mobile.calculator.test.Base;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseClass {
    public AndroidDriver driver;

    @BeforeClass
    public void setUp() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability("deviceName","One Plus 11R 5G");
        capabilities.setCapability("platformName","ANDROID");
        capabilities.setCapability("platformVersion","13");
        capabilities.setCapability("appPackage","com.oneplus.calculator");
        capabilities.setCapability("appActivity", "com.android.calculator2.Calculator");
        capabilities.setCapability("udid","9a9be1b1");
        capabilities.setCapability("ignoreHiddenApiPolicyError","true");
        capabilities.setCapability("automationName","UIAutomator2");
        capabilities.setCapability("noReset","true");

        //Initialize driver
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }


}
