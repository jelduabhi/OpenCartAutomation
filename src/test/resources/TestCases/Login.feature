Feature: Login Feature


 Background:
    Given user enters valid credentials
    Then home page should be displayed

    @addProduct @product @Demo1 @Sanity
  Scenario Outline:-Validate User is able to add the product
    And user add the product "<Test Case ID>"
    #Then product should be added to the cart
    Examples:
      | Test Case ID |
      | TC001        |

  @addProduct @product @Demo
  Scenario Outline:-Validate User is able to add the product
    And user add the product "<Test Case ID>"
    #Then product should be added to the cart
    Examples:
      | Test Case ID |
      | TC001        |

  @addProduct @product @Demo
  Scenario Outline:-Validate User is able to add the product
    And user add the product "<Test Case ID>"
    #Then product should be added to the cart
    Examples:
      | Test Case ID |
      | TC001        |

  @addProduct @product @Demo
  Scenario Outline:-Validate User is able to add the product
    And user add the product "<Test Case ID>"
    #Then product should be added to the cart
    Examples:
      | Test Case ID |
      | TC001        |

  @addProduct @product @Demo
  Scenario Outline:-Validate User is able to add the product
    And user add the product "<Test Case ID>"
    #Then product should be added to the cart
    Examples:
      | Test Case ID |
      | TC001        |

  @checkOut @product @Demo
  Scenario Outline:-Validate User is able to checkout the product
    And user add the product "<Test Case ID>"
    And product should be deleted to the cart
   # Then user should be checkout the product
    Examples:
      | Test Case ID |
      | TC002        |

  @addProduct @product @Demo
  Scenario Outline:-Validate User is able to add the product
    And user add the product "<Test Case ID>"
    #Then product should be added to the cart
    Examples:
      | Test Case ID |
      | TC001        |

  @addProduct @product @Demo
  Scenario Outline:-Validate User is able to add the product
    And user add the product "<Test Case ID>"
    #Then product should be added to the cart
    Examples:
      | Test Case ID |
      | TC001        |

  @addProduct @product @Demo
  Scenario Outline:-Validate User is able to add the product
    And user add the product "<Test Case ID>"
    #Then product should be added to the cart
    Examples:
      | Test Case ID |
      | TC001        |