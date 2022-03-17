Feature: Submit homepage Contact request - App Constants

  @homecontact
  Scenario Outline: Verify user can submit contact us request
    Given User is in annulartechnology home page
    And enter name "<custname>"
    And enter email "<custemail>"
    And enter phone number "<custphoneno>"
    And enter subject "<custsubject>"
    And enter message "<messagenote>"
    And click submit in home page
    
    
    
    Examples: 
       | custname | custemail | messagenote |	string					| custphoneno | custsubject |
       | name     | email     | message     |	contReqSuccMsg	| phoneno     | subject     |