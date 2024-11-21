package com.mobiletest.flipkart.test.Test;

import com.mobiletest.flipkart.test.Base.BaseClassFlipkart;
import com.mobiletest.flipkart.test.Pages.FlipkartClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class FlipkartTest extends BaseClassFlipkart {

    public static FlipkartClass flipkartClass;

    @BeforeClass
    public static void setUp() throws MalformedURLException {
        BaseClassFlipkart.initialize();
        flipkartClass = new FlipkartClass(driver);
    }

    @Test
    public static void LoginTestCase() throws InterruptedException {
//        FlipkartClass.login();
        FlipkartClass.orders();
    }

    @AfterClass
    public static void tearDown(){
        BaseClassFlipkart.dinitialize();
    }
}
