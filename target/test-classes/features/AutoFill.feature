Feature: Actions
@auto
    Scenario: Autofll
        Given user taps on viewsLink
        And taps on Auto Complete
        And taps on Screen Top
        And fill in two character "rw"
        Then check if it popup "Rwanda"

