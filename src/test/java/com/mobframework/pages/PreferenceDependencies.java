package com.mobframework.pages;

import org.junit.Assert;
import org.openqa.selenium.By;

import io.appium.java_client.AppiumBy;

public class PreferenceDependencies extends BasePage {

    By wifiSettingsLinkBy = AppiumBy.xpath("//android.widget.TextView[@text='WiFi settings']");
    By wifiCheckBoxBy = AppiumBy.id("android:id/checkbox");
    By wifiSettingNameFieldBy = AppiumBy.id("android:id/edit");
    By okeyBttnBy = AppiumBy.id("android:id/button1");

    public void openWifiSettingsPopUp(){
        getElement(wifiSettingsLinkBy).click();
    }
    public void addNameInWifiSettingNameField(String name){
        addTextToField(wifiSettingNameFieldBy, name);
    }

    public void clickWifiCheckBox(){
        getElement(wifiCheckBoxBy).click();
    }

    public void clickOkeyButton(){
        getElement(okeyBttnBy).click();
    }

    public void checkIfWifiNameIsSaved(){
        String value = getTextValueOfField(wifiSettingNameFieldBy);
        if (value != "Adeba"){
            System.out.println("name is not saved");
    }
    }
}

    

