Feature: Buying product Hummingbird Printed Sweater

  Scenario: Add product to cart and finish buying procedure

    Given User logged in CodersLab shop

    When Chose product - Hummingbird Printed Sweater with discount

    And Chose size M and quantity

    And Added product to cart

    And Went to checkout

    And Confirmed address

    And Chose PrestaShop shipping method - pick up in store

    And Pay by check and clicked order with an obligation to pay

    And Created Screenshot with conformation of order and price

    Then Customer sees info "YOUR ORDER IS CONFIRMED"



