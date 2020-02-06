Feature: Creation of new user address


  Scenario Outline: Fill users data - alias, address, city and zip/postal

    Given User logged in to CodersLab shop

    When User goes to Profile

    And User goes to Addresses

    And User creates new address

    And User fill "<alias>", "<address>", "<city>", "<postcode>", "<country>" and "<phone>" info

    Then User sees info "Address successfully added!"
    Examples:
      | alias     | address | city      | postcode    | country         | phone       |
      |alias 1    |Road 10  | Birmingham|01567      |United Kingdom   |567578589    |
      |alias 2    |Road 9   |Leeds      |07564      |United Kingdom   |765754743    |
      |alias 3    |Road 4   |London     |03428      |United Kingdom   |859483753    |