package com.mobframework.pages;

import static org.junit.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumBy;

public class ApiDemos extends BasePage {
    By ViewLink = AppiumBy.accessibilityId("Views");
    By DragnDrop = AppiumBy.accessibilityId("Drag and Drop");
    By preferenceBy = AppiumBy.accessibilityId("Preference");
    By preferenceDependenciesBy = AppiumBy.accessibilityId("3. Preference dependencies");
    By scrllToradioGroup = AppiumBy.accessibilityId("Radio Group");
    By garellyBy = AppiumBy.accessibilityId("Gallery");
    By photoBy = AppiumBy.accessibilityId("1. Photos");
    By image1By = AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.Gallery/android.widget.ImageView[1]");
    By expandableBy = AppiumBy.accessibilityId("Expandable Lists");
    By customBy = AppiumBy.accessibilityId("1. Custom Adapter");
    By peopleNameBy = AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ExpandableListView/android.widget.TextView[1]\r\n" + //
                "");
    By sampleBy = AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.FrameLayout/android.widget.TextView");
    By autoFillBy = AppiumBy.accessibilityId("Auto Complete");
    By screenTopBy = AppiumBy.accessibilityId("1. Screen Top");
    By countrySelectionBy = AppiumBy.id("io.appium.android.apis:id/edit");
    By ratngBy = AppiumBy.accessibilityId("Rating Bar");

    public ApiDemos navigateToView() {
        getElement(ViewLink).click();
        return this;

    }

    public DragAndDropPage NavigateToDragnDrop() {
        getElement(DragnDrop).click();
        return new DragAndDropPage();

    }

    public ApiDemos navigateToPreference() {
        getElement(preferenceBy).click();
        return this;
    }

    public ApiDemos navigateToPreferenceDependencies() {
        getElement(preferenceDependenciesBy).click();
        return this;
    }

    public RadioGroupPage scrllToRadioGroup() {
        scrollViewElement("Radio Group");
        getElement(scrllToradioGroup).click();
        return new RadioGroupPage();
    }

    public void clickToGallery() {
        getElement(garellyBy).click();
    }

    public void clickOnPhotoLink() {
        getElement(photoBy).click();
    }

    public void swipeTheFirstImageLeft() {
        swipeToElement(image1By, "left");
    }

    public void swipeTheSecondImageRight() {
        swipeToElement(image1By, "right");
    }

    public void isFirstImageInFocus() {
        String firstImageFocus = getElement(image1By).getAttribute("focusable");
        assertEquals(firstImageFocus, "true");
    }

    public void clickOnExpandable(){
        getElement(expandableBy).click();
    }

    public void clickOnCustom(){
        getElement(customBy).click();
    }
    public void longClickOnPeopleNames(){
        longClickToElement(peopleNameBy);
    }
    public void popUpMessageSample(){
        getElement(sampleBy);
    }

    public void clickOnAutoFillLink(){
        getElement(autoFillBy).click();
    }

    public void clickOnScreenTop(){
        getElement(screenTopBy).click();
    }

    public void fillInTextField(String text){
       getElement(countrySelectionBy).click();
        getElement(countrySelectionBy).sendKeys(text);
    }

    public void scrollToRatingBar(){
        scrollViewElement("Rating Bar");
        getElement(ratngBy).click();
    }

    

}
