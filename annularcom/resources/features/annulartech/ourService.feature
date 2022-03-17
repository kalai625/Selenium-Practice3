Feature: verify our service page dispalyed
  
  
  @ourservice
  Scenario Outline: verify our service page dispalyed
    Given User is in annulartechnology home page
    Then verify our services are displayed home page
    Then click website designing service in our service
    And verify website desinging page dispalyed
    Then click analytic service in our service
    And verify analytic page dispalyed
    Then click Testing service in our service
    And verify Testing page dispalyed
    
    
    Examples: 
      | searchString |
      | annulartech  |
    