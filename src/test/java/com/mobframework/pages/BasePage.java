package com.mobframework.pages;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.collect.ImmutableMap;
import com.mobframework.utils.DriverManager;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

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
    

}
