Feature: Login Feature


 Background:
    Given user enters valid credentials
    Then home page should be displayed

    @addProduct @product
  Scenario Outline:-Validate User is able to add the product
    And user add the product "<Test Case ID>"
    #Then product should be added to the cart
    Examples:
      | Test Case ID |
      | TC001        |

  @checkOut @product
  Scenario Outline:-Validate User is able to checkout the product
    And user add the product "<Test Case ID>"
    And product should be added to the cart
    Then user should be checkout the product
    Examples:
      | Test Case ID |
      | TC002        |