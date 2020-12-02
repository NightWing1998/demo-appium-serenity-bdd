Feature: Wikipedia's Search Functionality

    Scenario: Can find search results
        When I type query as "BrowserStack"
        And I submit
        Then I should see results
