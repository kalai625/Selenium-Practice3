Feature: Happy Clients

  @happy
  Scenario Outline: Verify Happy Clients, Total Projects and Awards
    Given User is in annulartechnology home page
    Then select about in home page
    Then it should display about us page
    Then about us page should display total projects completed
    Then about us page should display happy clients
    Then about us page should year of excellence
    Then about us page should project executed

    Examples: 
      | searchString |
      | annulartech  |
