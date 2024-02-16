package com.mobframework.pages;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumBy;

public class ScorllPage extends BasePage {
    By viewPageBy = AppiumBy.id("Views");

    public void clickOnViewPage(){
        getElement(viewPageBy).click();
    }
    public void scrllToElmnt(){
        scrollViewElement("TextClock");
    }
    public void scrllUp(){
        scrollViewElement("Animation");
    }


    

    
}
