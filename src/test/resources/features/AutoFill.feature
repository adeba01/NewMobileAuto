Feature: Actions
    @auto
    Scenario: Autofll
        Given user taps on viewsLink
        And taps on Auto Complete
        And taps on Screen Top
        And searches "<search_term>"
        Then the search result should contain "<search_term>"
    Examples:
            | search_term |
            | co          |
