Feature: Verify Blog page navigation

  @Blog
  Scenario Outline: Verify Blog page navigation
    Given User is in annulartechnology home page
    Then select about in home page
    Then it should display about us page
    Then click recnet post in aboutus page
    Then verify navigate to blog page
    

    Examples: 
      | searchString |
      | annulartech  |