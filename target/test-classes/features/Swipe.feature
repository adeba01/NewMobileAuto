Feature: Actions
    @swp
    Scenario: Swipe To Left and Right
        Given user tap on views
        And taps on Gallery
        And taps on Photos
        And swipe two images to left 
        And swipe back two images to right
        Then first image will be in focus

