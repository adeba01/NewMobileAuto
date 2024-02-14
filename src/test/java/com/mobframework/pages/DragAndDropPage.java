package com.mobframework.pages;

import org.openqa.selenium.By;
import io.appium.java_client.AppiumBy;

public class DragAndDropPage extends BasePage {
    By textCircle = AppiumBy.xpath(
            "/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.view.View[1]");
    By dragResult = AppiumBy.xpath(
            "/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.TextView[2]");

    public void dragCircle() {
        DragAndDrop(206, 571, 734, 1324);

    }

    public void droppedElement(String dragExpected) {
        String dragActual = getElement(dragResult).getText();
        checkSimilarityOfText(dragExpected, dragActual);
    }

}
