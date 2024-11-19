package com.mobile.calculator.test.Pages;

import com.mobile.calculator.test.Base.BaseClass;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorClass extends BaseClass {

    @Test
    public void sum(){
        //Click on two
        driver.findElement(By.id("com.oneplus.calculator:id/digit_2")).click();
        //Click on plus
        driver.findElement(By.id("com.oneplus.calculator:id/img_op_add")).click();
        //Click on two
        driver.findElement(By.id("com.oneplus.calculator:id/digit_2")).click();
        //Click on equal
        driver.findElement(By.id("com.oneplus.calculator:id/img_eq")).click();

        String result = driver.findElement(By.id("com.oneplus.calculator:id/result")).getText();
        System.out.println(result);
        Assert.assertEquals(result,"4");
    }

}
