Feature: Verify Phonenumber and email displayed home page

  @phoneEmail
  Scenario Outline: Verify Phonenumber and email displayed home page
    Given User is in annulartechnology home page
    Then verify phone number dispalyed homepage
    Then verify email dispalyed home page
    
    Examples: 
      | searchString |
      | annulartech  |