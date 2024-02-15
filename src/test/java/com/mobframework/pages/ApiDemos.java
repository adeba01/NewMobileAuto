package com.mobframework.pages;

import org.openqa.selenium.By;
import io.appium.java_client.AppiumBy;

public class ApiDemos extends BasePage {
    By ViewLink = AppiumBy.accessibilityId("Views");
    By DragnDrop = AppiumBy.accessibilityId("Drag and Drop");
    By preferenceBy = AppiumBy.accessibilityId("Preference");
    By preferenceDependenciesBy = AppiumBy.accessibilityId("3. Preference dependencies");




    public ApiDemos NavigateToView(){
        getElement(ViewLink).click();
        return this;

    }
    public DragAndDropPage NavigateToDragnDrop(){
        getElement(DragnDrop).click();
        return new DragAndDropPage();
    }

    public ApiDemos navigateToPreference(){
        getElement(preferenceBy).click();
        return this;
    }
    public ApiDemos navigateToPreferenceDependencies(){
        getElement(preferenceDependenciesBy).click();
        return this;
    } 
    
}
