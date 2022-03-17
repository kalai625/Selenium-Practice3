Feature: Validate Home page Contact  mandatory fields

  @homeconval
  Scenario Outline: Validate Home page Contact  mandatory fields
    Given User is in annulartechnology home page
    Then it should display home page
    And click submit in home page
    Then validate mandatory "<error>" displayed for name 
    Then validate mandatory "<error>" displayed for email
    

    Examples: 
      | searchString |	error							|
      | annulartech  |	constReqFieldErr	|