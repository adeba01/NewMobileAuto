package com.mobframework.pages;

import java.time.Duration;

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

    public BasePage(){
        this.driver = new DriverManager().getDriver();
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }
    public WebElement getElement(By locator){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));

    }
    public void DragAndDrop (WebElement element){
        driver.executeScript("mobile:clickGesture", ImmutableMap.of
        ("Startx",100,"Starty",200, "Endx",700,"Endy",1700));
    }
}
