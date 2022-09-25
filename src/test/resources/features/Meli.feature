@Meli
Feature: Testing actions on MercadoLibre webpage

  Background: Navigate to webpage
  Given I navigate to MercadoLibre webpage

@MeliCat
Scenario Outline: As a test engineer, I want to test the functionality of MercadoLibre webpage with different categories items
    When I select the category <Category> from Tecnologia submenu
    Then I can validate I am looking for <Category> and the total results for it

    Examples:
      |Category               |
      |Audio                  |

@MeliProd
Scenario Outline: As a test engineer, I want to test the functionality of MercadoLibre webpage with different products
    And Enter <Item> as a search criteria
    And Click Montevideo as location filter
    When Select a random publication
    Then I can validate the seller has the highest reputation

  Examples:
    |Item               |
    |Iphone             |




