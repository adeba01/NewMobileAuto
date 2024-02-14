package com.mobframework.pages;

import org.openqa.selenium.By;
import io.appium.java_client.AppiumBy;

public class ApiDemos extends BasePage {
    By ViewLink = AppiumBy.accessibilityId("Views");
    By DragnDrop = AppiumBy.accessibilityId("Drag and Drop");



    public ApiDemos NavigateToView(){
        getElement(ViewLink).click();
        return this;

    }
    public DragAndDropPage NavigateToDragnDrop(){
        getElement(DragnDrop).click();
        return new DragAndDropPage();
    }
    
}
