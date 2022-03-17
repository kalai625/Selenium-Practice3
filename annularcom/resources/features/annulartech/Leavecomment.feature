Feature: Write comment about project

  @api
  Scenario Outline: Write comment about project
    Given User is in annulartechnology home page
    Then select about in home page
    Then it should display about us page
    Then click recnet post in aboutus page
    And enter name "<custname>" in leave comment
    And enter email "<custemail>" in leave comment
    And enter message "<messagenote>" in leave comment
    Then click submit button in leavecomment
    
    
    
    Examples: 
      | custname | custemail | messagenote |	
      | name     | email     | message     |