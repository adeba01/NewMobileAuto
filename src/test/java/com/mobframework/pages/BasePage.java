package com.mobframework.pages;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.collect.ImmutableMap;
import com.mobframework.utils.DriverManager;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;

public class BasePage {
    private AppiumDriver driver;
    private WebDriverWait wait;

    public BasePage() {
        this.driver = new DriverManager().getDriver();
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    }

    public WebElement getElement(By locator) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));

    }

    public void DragAndDrop(int startX, int startY, int endX, int endY) {
        driver.executeScript("mobile:dragGesture",
                ImmutableMap.of("startX", startX, "startY", startY, "endX", endX, "endY", endY));
    }

    public void checkSimilarityOfText(String text1, String text2) {
        Assert.assertEquals(text1, text2);
    }

    public void addTextToField(By locator, String text) {
        getElement(locator).sendKeys(text);
    }

    public String getTextValueOfField(By locator) {
        return getElement(locator).getAttribute("text");
    }
    public void scrollViewElement(String elementText){
        driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(" +
        "new UiSelector().textContains(\"" + elementText + "\"))"));
        

    }

    public void swipeToElement(By locator, String direction ){
        WebElement element = getElement(locator);
        ((JavascriptExecutor) driver).executeScript("mobile: swipeGesture", ImmutableMap.of(
    "elementId", ((RemoteWebElement) element).getId(),
    "direction", "left",
    "percent", 0.75));

    }
        
    
}
