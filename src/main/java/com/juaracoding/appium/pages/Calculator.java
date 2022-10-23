package com.juaracoding.appium.pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class Calculator {
    public AndroidDriver<MobileElement> driver;

    public Calculator(AndroidDriver<MobileElement> driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(id = "com.android.calculator2:id/digit_6")
    MobileElement btnSix;
    @AndroidFindBy(id = "com.android.calculator2:id/digit_3")
    MobileElement btnThree;
    @AndroidFindBy(id = "com.android.calculator2:id/eq")
    MobileElement btnEq;
    @AndroidFindBy(id = "com.android.calculator2:id/op_add")
    MobileElement btnAdd;
    @AndroidFindBy(id = "com.android.calculator2:id/op_sub")
    MobileElement btnSub;
    @AndroidFindBy(id = "com.android.calculator2:id/op_mul")
    MobileElement btnMul;
    @AndroidFindBy(id = "com.android.calculator2:id/op_div")
    MobileElement btnDiv;
    @AndroidFindBy(id = "com.android.calculator2:id/result")
    MobileElement result_final;


    public void funcMultiple() {
        btnSix.click();
        System.out.println("Click button 6");
        btnMul.click();
        System.out.println("Click button Multiple");
        btnThree.click();
        System.out.println("Click button 6");
        btnEq.click();
        System.out.println("Click button Equals");
    }

    public void FuncDivide() {
        btnSix.click();
        System.out.println("Click button 6");
        btnDiv.click();
        System.out.println("Click button Divide");
        btnThree.click();
        System.out.println("Click button 6");
        btnEq.click();
        System.out.println("Click button Equals");
    }

    public void FuncAdd() {
        btnSix.click();
        System.out.println("Click button 6");
        btnAdd.click();
        System.out.println("Click button Plus");
        btnThree.click();
        System.out.println("Click button 3");
        btnEq.click();
        System.out.println("Click button Equals");
    }

    public void FuncSub() {
        btnSix.click();
        System.out.println("Click button 6");
        btnSub.click();
        System.out.println("Click button Sub");
        btnThree.click();
        System.out.println("Click button 3");
        btnEq.click();
        System.out.println("Click button Equals");
    }

    public String getTxtResult() {
        return result_final.getText();
    }
}