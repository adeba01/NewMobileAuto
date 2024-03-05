package com.mobframework.stepdefinitions;

import com.mobframework.pages.ApiDemos;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class LongClck {

    ApiDemos apdm = new ApiDemos();

    @Given("user taps on views")
    public void user_taps_on_views() {
        // Implementation for tapping on views
        apdm.NavigateToView();
    }

    @And("taps on Expandable Lists")
    public void taps_on_Expandable_Lists() {
        // Implementation for tapping on Expandable Lists
        apdm.clickOnExpandable();
    }

    @And("taps on Custom Adapter")
    public void taps_on_Custom_Adapter() {
        // Implementation for tapping on Custom Adapter
        apdm.clickOnCustom();
    }

    @And("longclick on People Names")
    public void longclick_on_People_Names() {
        // Implementation for long-clicking on People Names
        apdm.longClickOnPeopleNames();
    }

    @Then("a popup should appear with message {string}")
    public void verifyPopupMessage(String expectedMessage){
        //implementation which should appear after tap on people names
        apdm.popUpMessageSample();
    }
    
}
