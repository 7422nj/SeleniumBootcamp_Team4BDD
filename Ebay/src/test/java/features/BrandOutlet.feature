Feature: SearchBox Functionality check

  Background:
    Given I am on ebay Brand Outlet



    Scenario Outline: User should be able to search for multiple items
      When User enters "<searchItems>" in search field
      And user should see "<expectedValue>" written in search field
      Then User should see "<pageURL>" as current URL

      Examples:
      |searchItems           | expectedValue   | pageURL                                                |
      |Fashion&Jewelry       | Fashion&Jewelry | https://www.ebay.com/b/Brand-Outlet/bn_7115532402      |
      |Footwear&Apparel      | Footwear&Apparel| https://www.ebay.com/b/Brand-Outlet/bn_7115532402      |
      |Tech                  | Tech            | https://www.ebay.com/b/Brand-Outlet/bn_7115532402      |
      |Watches               | Watches         | https://www.ebay.com/b/Brand-Outlet/bn_7115532402      |
      |SportingGoods         | SportingGoods   | https://www.ebay.com/b/Brand-Outlet/bn_7115532402      |


  Scenario Outline: click on manual links
    When I click the Brand Outlet link
    And I click "<searchLinks>" in Brand Outlet page
    Then verify "<expectedURL>" in each page

    Examples:
    |searchLinks                | expectedURL                                             |
    |Champion - Up to 50% off   | https://www.ebay.com/e/fashion/champion-brand-outlet    |
    |Hanes - Up to 60% off      | https://www.ebay.com/e/fashion/hanes-brand-outlet       |
    |Jewelry.com - Up to 80% off| https://www.ebay.com/e/fashion/jewelry-com-brand-outlet |
    |Levian - Up to 75% off     | https://www.ebay.com/e/fashion/levian-brand-outlet      |

    Scenario Outline: click on manual links
      When I click the Brand Outlet link
      And I click "<searchLinks>" in Brand Outlet page
      Then verify "<expectedURL>" in each page

      Examples:
      |searchLinks                | expectedURL                                             |
      |Superdry - Up to 50% off   | https://www.ebay.com/e/fashion/superdry-brand-outlet    |
      |adidas - Up to 60% off     | https://www.ebay.com/e/fashion/adidas-brand-outlet      |
      |ASICS - Up to 70% off'     | https://www.ebay.com/e/fashion/asics-brand-outlet       |
      |New Balance - Up to 60% off| https://www.ebay.com/e/fashion/new-balance-brand-outlet |

  Scenario Outline: click on manual links
    When I click the Brand Outlet link
    And I click "<searchLinks>" in Brand Outlet page
    Then verify "<expectedURL>" in each page


    Examples:
    |searchLinks                | expectedURL                                                                     |
    |Puma - Up to 60% off       | https://www.ebay.com/e/fashion/puma-brand-outlet                                |
    |Reebok - Up to 60% off     | https://www.ebay.com/e/fashion/reebok-brand-outlet                              |
    |Bosch - Up to 50% off      | https://www.ebay.com/e/home-garden/bosch-certified-refurbished-brand-outlet     |
    |KitchenAid - Up to 30% off | https://www.ebay.com/e/home-garden/kitchenaid-certified-refurbished-brand-outlet|

  Scenario Outline: click on manual links
    When I click the Brand Outlet link
    And I click "<searchLinks>" in Brand Outlet page
    Then verify "<expectedURL>" in each page

    Examples:
    |searchLinks                | expectedURL                                                                    |
    |Makita - Up to 60% off     | https://www.ebay.com/e/home-garden/certified-refurbished-makita-brand-outlet   |
    |Philips - Up to 60% off    | https://www.ebay.com/e/home-garden/certified-refurbished-phillips-brand-outlet |
    |Sun Joe - Up to 40% off'   | https://www.ebay.com/e/home-garden/certified-refurbished-sun-joe-brand-outlet  |
    |Mizuno - Up to 30% off     | https://www.ebay.com/e/sporting-goods/brand-outlet-mizuno-8-3-20               |

  Scenario Outline: click on manual links
    When I click the Brand Outlet link
    And I click "<searchLinks>" in Brand Outlet page
    Then verify "<expectedURL>" in each page

    Examples:
    |searchLinks          | expectedURL
    |Acer - Up to 40% off | https://www.ebay.com/e/_electronics/certified-refurbished-acer-brand-outlet |
    |Bose - Up to 50% off | https://www.ebay.com/e/_electronics/certified-refurbished-bose-brand-outlet |
    |Dell - Up to 40% off | https://www.ebay.com/e/_electronics/certified-refurbished-dell-brand-outlet |
    |HP - Up to 40% off   | https://www.ebay.com/e/_electronics/hp-certified-refurbished-brand-outlet   |

  Scenario Outline: click on manual links
    When I click the Brand Outlet link
    And I click "<searchLinks>" in Brand Outlet page
    Then verify "<expectedURL>" in each page

    Examples:
    |searchLinks               | expectedURL                                                                       |
    |Microsoft - Up to 40% off | https://www.ebay.com/e/_electronics/microsoft-certified-refurbished-brand-outlet  |
    |Razer - Up to 30% off     | https://www.ebay.com/e/_electronics/certified-refurbished-razer-brand-outlet      |
    |Skullcandy - Up to 60% off| https://www.ebay.com/e/_electronics/certified-refurbished-skullcandy-brand-outlet |
    |Breitling - Up to 30% off | https://www.ebay.com/e/fashion/breitling-030220                                   |

  Scenario Outline: click on manual links
    When I click the Brand Outlet link
    And I click "<searchLinks>" in Brand Outlet page
    Then verify "<expectedURL>" in each page

    Examples:
    |searchLinks            | expectedURL                                     |
    |Cartier - Up to 30% off| https://www.ebay.com/e/fashion/cartier-030220   |
    |OMEGA - Up to 30% off  | https://www.ebay.com/e/fashion/bo7-omega-021720 |
    |Panerai - Up to 30% off| https://www.ebay.com/e/fashion/panerai-052520   |
    |Rolex - Up to 30% off  | https://www.ebay.com/e/fashion/rolex-021720     |



























