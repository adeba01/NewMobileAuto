package com.mobframework.stepdefinitions;

import com.mobframework.pages.ApiDemos;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class AutoFill {

    ApiDemos apdm = new ApiDemos();


    @Given("user taps on viewsLink")
    public void user_taps_on_views() {
        // Implementation for tapping on views
        apdm.NavigateToView();
    }

    @And("taps on Auto Complete")
    public void taps_on_auto_complete() {
        // Implementation for tapping on Auto Complete
        apdm.clickOnAutoFillLink();
    }

    @And("taps on Screen Top")
    public void taps_on_screen_top() {
        // Implementation for tapping on Screen Top
        apdm.clickOnScreenTop();
    }

    @And("searches {string}")
    public void fill_in_two_character(String characters) {
        // Implementation for filling in two characters
        // You can use automation code here to input the provided characters
        apdm.fillInTextField(characters);
    }

    @Then("the search result should contain {string}")
    public void check_popup(String characters) {
        // Implementation for checking if the expected popup appears
        // You can use automation code here to verify the appearance of the popup with the expected message
        // For example, you can use Selenium or Appium to locate the popup and verify its message
        // You can also use assertions to validate the message
    }
}
