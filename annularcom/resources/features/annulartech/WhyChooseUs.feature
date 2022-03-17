Feature: Why Choose Us

  @chooseus
  Scenario Outline: Why ChooseUs
    Given User is in annulartechnology home page
    Then select about in home page
    Then it should display about us page
    Then the best quality work should show in why choose us
    Then the support after delivery should show in why choose us
    Then the result oriented approach should show in why choose us
    

    Examples: 
      | searchString |
      | annulartech  |
