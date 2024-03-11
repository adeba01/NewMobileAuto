Feature: Actions

    @rt
    Scenario: ratings
        Given the user taps on viewsLink
        And the user scrolldown to Rating Bar and taps on Rating Bar link
        And taps on rating "<rating>"
        Then result must display out of three

        Examples:
            | rating |
            | 0.5    |
            | 1      |
            | 1.5    |
            | 2      |
            | 2.5    |
            | 3      |

