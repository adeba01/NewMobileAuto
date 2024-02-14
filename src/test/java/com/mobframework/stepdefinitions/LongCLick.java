package com.mobframework.stepdefinitions;

import com.mobframework.pages.ApiDemos;
import com.mobframework.pages.DragAndDropPage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LongCLick {
    ApiDemos apiDemosPage = new ApiDemos();
    DragAndDropPage dragNdrop;

    @When("a user tap on view link")
    public void userTapOnViewLink() {
        // Perform tap action on the "view" link
        apiDemosPage.NavigateToView();
    }

    @When("a user tap on Drag and Drop link")
    public void userTapOnDragAndDropLink() {
        // Perform tap action on the "Drag and Drop" link
        dragNdrop = apiDemosPage.NavigateToDragnDrop();
    }

    @When("a user long click on textleess circle")
    public void userLongClickOnTextlessCircle() {
        // Perform long click action on the "textless circle"
        dragNdrop.dragCircle();
    }

    @Then("the message {string} should display")
    public void verifyMessageDisplayed(String string) {
        // Verify that the message "Dropped!" is displayed
        // You can use assertions or verification methods provided by your test
        // framework
        // For example, if using JUnit:
        // assertEquals(message, actualMessageDisplayed);
        // If using other frameworks like AssertJ or Hamcrest, use their corresponding
        // methods
        dragNdrop.droppedElement(string);
    }

}
