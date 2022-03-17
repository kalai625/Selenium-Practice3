Feature: Validate Contact Us mandatory fields

  @ai
  Scenario Outline: Verify mandatory error displayed for blank values
    Given User is in annulartechnology home page
    And click contact in home page
    Then it should display contact us page
    And click submit
    Then validate mandatory "<error>" displayed for name 
    Then validate mandatory "<error>" displayed for email
    #Then validate mandatory "<error>" displayed for message

    Examples: 
      | searchString |	error							|
      | annulartech  |	constReqFieldErr	|