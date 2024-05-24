Feature: Login in the page
  As a user of the Page Uninorte
  I want a message to be displayed
  to entering credentials

  Scenario: Login success
    Given User logs in the with credentials
      | email               | password |
      | stivenjcr@gmail.com | 123456   |
    Then View the page option Inicio de sesión exitoso

  Scenario: Login failed
    Given User logs in the with credentials
      | email       | password |
      | a@gmail.com | 123345   |
    Then View the message Firebase: Error (auth/invalid-credential).