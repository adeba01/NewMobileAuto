package com.mobframework.stepdefinitions;

import com.mobframework.pages.ApiDemos;
import com.mobframework.pages.ScorllPage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Scroll {
    ScorllPage scrll = new ScorllPage();
    ApiDemos apdm = new ApiDemos();

    @When("a user taps on views")
    public void userTapsOnViews() {
        // Implementation to tap on views
        // This could involve finding the "views" element and tapping on it
        apdm.NavigateToView();

    }

    @When("the user scroll down")
    public void userScrollsDown() {
        // Implementation to scroll down
        // This could involve swiping or scrolling down on the screen
        scrll.scrllToElmnt();
    }

    @When("the user should see TextClock link")
    public void userShouldSeeTextClockLink(){
        
    }

    @Then("the user scroll up")
    public void userScrollsUp() {
        // Implementation to scroll up
        // This could involve swiping or scrolling up on the screen
        scrll.scrllUp();
    }

}
