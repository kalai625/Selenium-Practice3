Feature: Submit Contact Us request - App Constants

  @crsubmit
  Scenario Outline: Verify user can submit contact us request
    Given User is in annulartechnology home page
    And click contact in home page
    Then it should display contact us page
    And enter name "<custname>"
    And enter email "<custemail>"
    And enter phone number "<custphoneno>"
    And enter subject "<custsubject>"
    And enter message "<messagenote>"
    And click submit
    
    
    
    Examples: 
       | custname | custemail | messagenote |	string					| custphoneno | custsubject |
       | name     | email     | message     |	contReqSuccMsg	| phoneno     | subject     |
