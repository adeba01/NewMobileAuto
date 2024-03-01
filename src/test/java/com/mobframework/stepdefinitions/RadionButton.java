package com.mobframework.stepdefinitions;

import com.mobframework.pages.ApiDemos;
import com.mobframework.pages.RadioGroupPage;
import com.mobframework.pages.ScorllPage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RadionButton {

    RadioGroupPage radio = new RadioGroupPage();
    ScorllPage scrll = new ScorllPage();
    ApiDemos apdm = new ApiDemos();


     @When("the user taps on views")
    public void userTapsOnViews() {
        // Implementation to tap on views
        // This could involve finding the "views" element and tapping on it
        apdm.NavigateToView();

    }

    @When("scroll down to Radio Group and taps on it")
    public void userScrollsDownToRadioGroupAndTapsOnIt() {
        // Implementation to scroll down
        // This could involve swiping or scrolling down on the screen
        apdm.scrllToRadioGroup();
        
    }

    @When("taps on All of them radio button")
    public void tapsOnAllOfThemRadioButton(){
        radio.clickToAll();
        
    }

    @Then("taps on Clear button")
    public void tapsOnClearButton() {
        // Implementation to scroll up
        // This could involve swiping or scrolling up on the screen
        radio.clickClearButton();
        
    }
    
}
