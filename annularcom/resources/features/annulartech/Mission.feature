Feature: Mission

  @mission
  Scenario Outline: Verify Who We are, Mission and What We Do
    Given User is in annulartechnology home page
    Then select about in home page
    Then it should display about us page
    Then validate who we are is shown in about us
    Then validate our mission is shown in about us
    Then validate what we do is shown in about us

    Examples: 
      | searchString |
      | annulartech  |
