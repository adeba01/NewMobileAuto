package com.mobframework.pages;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumBy;

public class RadioGroupPage extends BasePage {

    By radiobttnBy =AppiumBy.accessibilityId("All of them");
    By clearBttnBy = AppiumBy.accessibilityId("Clear");

    public void clickToAll(){
        getElement(radiobttnBy).click();
    }

    public void clickClearButton(){
        getElement(clearBttnBy).click();
    }
    
}
