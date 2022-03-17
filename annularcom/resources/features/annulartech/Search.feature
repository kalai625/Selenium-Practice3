Feature: Verify project dispalyed in search of blog page

  @Blogsrh
  Scenario Outline: Verify project dispalyed in search of blog page
    Given User is in annulartechnology home page
    Then select blog in home page
    Then click read more button
    And enter mail id "<srhemail>" in search box
    Then click search icon
    And verify project displayed in blog page
    
    

    Examples: 
        | srhemail       | 
        | searchmail     |