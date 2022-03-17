Feature: Validate service page links

  @servicelink
  Scenario Outline: Validate Home page Contact  mandatory fields
    Given User is in annulartechnology home page
    Then click service page
    And click digital service Learn more
    And verify website desinging page dispalyed
    Then click service page
    And click analytic service Learn more
    And verify analytic page dispalyed
    Then click service page
    Then click testing service Learn more
    And verify Testing page dispalyed
    
    Examples: 
      | searchString |	
      | annulartech  |	