Feature: Actions
        

    @scrolldp
    Scenario: ScrollDown
        When a user taps on views
        And the user scroll down
        Then the user should see TextClock link
        And the user scroll up 
