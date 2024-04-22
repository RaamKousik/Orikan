Feature: To verify the account creation feature in orikan website

  Background: 
    Given To launch the browser and launch orikan url

  Scenario: To create an new account in orikan site
    When To pass datas into email, password, confirm password into required text box and click next button
    And To pass datas into firstname, lastname, address, postcode, city in required field
    And To select state in state drop down and click next
    And To pass datas into holdername, cardnumber, cvvnumber, expiry year in required field
    And To select master card and choose state and click next
    And To enable agreement checkbox and click submit
    And To verify the text account is successfully registered
    Then To close browser

  Scenario: To create and account with another email
    When To pass datas into email, password, confirm password field
    And To click login button
