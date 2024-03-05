Feature: Actions
    @lgclck
    Scenario: LongClck
        Given the user taps on views
        And taps on Expandable Lists
        And taps on Custom Adapter
        And longclick on People Names
        Then a popup should appear with message "sample menu"
