package com.mobframework.stepdefinitions;

import com.mobframework.pages.ApiDemos;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Swipe {

    ApiDemos apdmo = new ApiDemos();

    @Given("user tap on views")
    public void userTapsOnViews() {
        // Implementation to tap on views
        apdmo.navigateToView();
    }

    @And("taps on Gallery")
    public void userTapsOnGallery() {
        // Implementation to tap on Gallery
        apdmo.clickToGallery();
    }

    @And("taps on Photos")
    public void userTapsOnPhotos() {
        // Implementation to tap on Photos
        apdmo.clickOnPhotoLink();
    }

    @And("swipe two images to left")
    public void swipeTwoImagesToLeft() {
        // Implementation to swipe two images to left
        apdmo.swipeTheFirstImageLeft();
    }

    @And("swipe back two images to right")
    public void swipeBackTwoImagesToRight() {
        // Implementation to swipe back two images to right
        apdmo.swipeTheSecondImageRight();
    }
    @Then("first image will be in focus")
    public void firstImageWillBeInFocus(){
        //implementation of first image will be in focus
        apdmo.isFirstImageInFocus();
    }

}
