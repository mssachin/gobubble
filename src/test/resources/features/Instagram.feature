Feature: Instagram Activity
  As an instagram user
  I should be able to add comments to my friends profile
  So that I can have an interactive experience


  Scenario: Instagram Assessment
    Given I login to instagram
    And I search for a profile "testingjdl4w"
    And I click on a "vikings" picture
    When I add comment
      | This is a Great Picture     |
      | This is a very Ugly Picture |
    Then I can scrape all the comments from the picture


