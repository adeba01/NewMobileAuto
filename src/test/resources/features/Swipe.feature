Feature: Actions
    @swp
    Scenario: SwipeToLeft
        Given user tap on views
        And taps on Gallery
        And taps on Photos
        Then swipe two images to left 
        And swipe back two images to right

