Feature: Product Feature

  Scenario Outline:-Validate User is able to login with valid credentials
    Given user launch the application
    When user enters valid credentials "<Test Case ID>"
    Then home page should be displayed
    Examples:
      | Test Case ID |
      | TC001        |

    @Sanity
  Scenario Outline:-Validate User is able to add the product
    Given user launch the application
    When user enters valid credentials "<Test Case ID>"
    Then home page should be displayed
    And user add the product
    Then product should be added to the cart
    Examples:
      | Test Case ID |
      | TC001        |

  Scenario Outline:-Validate User is able to checkout the product
    Given user launch the application
    When user enters valid credentials "<Test Case ID>"
    Then home page should be displayed
    And user add the product
    And product should be added to the cart
    Then user should be checkout the product
    Examples:
      | Test Case ID |
      | TC001        |




