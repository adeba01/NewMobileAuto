Feature: Actions
@popup
Scenario: add wifi settings
    When a user tap on Preference link
    And a user taps on Preference dependencies link
    And a user check the WiFi checkbox
    And a user taps on WiFi settings
    And a user should fill in the WiFi settings as "Adeba"
    And a user taps on ok button
    Then WiFi settings should be saved