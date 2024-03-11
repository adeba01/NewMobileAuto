package com.mobframework.stepdefinitions;

import com.mobframework.pages.ApiDemos;
import com.mobframework.pages.RatingPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Rating {

    ApiDemos apdm = new ApiDemos();
    RatingPage rtng = new RatingPage();


     @Given("the user taps on viewsLink")
    public void user_taps_on_viewsLink() {
        // Implementation for tapping on viewsLink
        apdm.navigateToView();
    }

    @And("the user scrolldown to Rating Bar and taps on Rating Bar link")
    public void user_scrolldown_to_Rating_Bar() {
        // Implementation for scrolling down to Rating Bar
        apdm.scrollToRatingBar();
    }

    @And("taps on rating cordinate {double}")
    public void taps_on_rating_cordinate(double rating) {
        // Implementation for tapping on a rating out of three
        rtng.rtstr(rating);
    }

    @Then("result must display out of three")
    public void result_must_display_out_of_three() {
        // Implementation to verify that the result is displayed out of three
    }
}
