Feature: User Login, select package and confirm booking

  Scenario Outline: User Login to application and select travel package and confirm Booking

    # User login to application
    Given Redirect to the application Home page
    When User enter the username "<username>"
    And User enter the password "<password>"
    Then User should be able to login to the website

    # User select the travel package
    Given User click on View Package option to see all the packages
    When User select view details for the London Extravaganza
    Then User click on Book now option

    # User confirmed the booking
    Given User enter the traveller information
    When User click on Confirm booking
    Then User should be able to see the booking confirmation message

    Examples:
      | username | password |
      | mathanmsc@hotmail.com | $2b$10$U3eNveaKzw3UhA7SmprtTO7jFBc7iypi9sBoUQMZbsFY5HK2.nt2. |