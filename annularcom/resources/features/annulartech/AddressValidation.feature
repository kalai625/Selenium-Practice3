Feature: verify address displayed in contactpage

  @address
  Scenario Outline: verify address displayed in contactpage
    Given User is in annulartechnology home page
    And click contact in home page
    Then it should display contact us page
    And verify use address displayed contact page
    And verify india address displayed contact page

    Examples: 
      | searchString |
      | annulartech  |
