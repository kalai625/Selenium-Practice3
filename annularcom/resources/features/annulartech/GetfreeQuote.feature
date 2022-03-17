Feature: Verify getfreequote navigate to contact page

  @cntval
  Scenario Outline: Verify getfreequote navigate to contact page
    Given User is in annulartechnology home page
    Then select get free quote in home page
    Then it should display contact us page
    Then select about in home page
    And select get free quote in aboutus page
    Then it should display contact us page
    
    Examples: 
      | searchString |	
      | annulartech |	