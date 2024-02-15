package com.mobframework.stepdefinitions;

import com.mobframework.pages.ApiDemos;
import com.mobframework.pages.PreferenceDependencies;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Preference {
    ApiDemos apidemospge = new ApiDemos();
    PreferenceDependencies prfrnce = new PreferenceDependencies();

    @When("a user tap on Preference link")
    public void userTapsOnPreferenceLink() {
        // Implement code to tap on the Preference dependencies link
        apidemospge.navigateToPreference();
    }

    @When("a user taps on Preference dependencies link")
    public void userTapsOnPreferenceDependenciesLink() {
        // Implement code to tap on the Preference dependencies link
        apidemospge.navigateToPreferenceDependencies();
    }

    @When("a user check the WiFi checkbox")
    public void userChecksWiFiCheckbox() {
        // Implement code to check the WiFi checkbox
        prfrnce.clickWifiCheckBox();
    }

    @When("a user taps on WiFi settings")
    public void userTapsOnWiFiSettings() {
        // Implement code to tap on the WiFi settings
        prfrnce.openWifiSettingsPopUp();
    }

    @When("a user should fill in the WiFi settings as {string}")
    public void userFillsInWiFiSettings(String string) {
        // Implement code to fill in the WiFi settings with the provided value
        prfrnce.addNameInWifiSettingNameField(string);
    }

    @When("a user taps on ok button")
    public void userTapsOnOkButton() {
        // Implement code to tap on the OK button
        prfrnce.clickOkeyButton();

    }

    @Then("WiFi settings should be saved")
    public void wifiSettingsShouldBeSaved() {
        // Implement code to verify that the WiFi settings are saved
        // For example, you can assert that the settings have been updated correctly
       prfrnce.openWifiSettingsPopUp();
       prfrnce.checkIfWifiNameIsSaved();
    }

}
