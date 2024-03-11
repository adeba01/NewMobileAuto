package com.mobframework.pages;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumBy;

public class RadioGroupPage extends BasePage {

    By allOfthemRadioButtonBy = AppiumBy.accessibilityId("All of them");
    By clearBttnBy = AppiumBy.accessibilityId("Clear");

    public void clickToAllOfThem(){
        getElement(allOfthemRadioButtonBy).click();
    }

    public void clickClearButton(){
        getElement(clearBttnBy).click();
    }
    
}
