Feature: Scenarios

  Background:
    Given user passes onboarding screens
    And user checks if home page exists or not

  @case1
  Scenario:
    Given User changes category to Baby Care
    And User open a random product detail
    And User adds this product to basket return last page
    And User changes category to Snacks
    And User open a random product detail
    And User adds this product to basket and return last page
    And User goes to basket and control added products and prices

  @case2
  Scenario:
    Given User gets the number of categories and write this number to console
    And User open a random category
    And User adds 3 random products to wishlist via mini heart icon
    And User opens the menu in the left
    And User go to ‘My Wishlist’
    And User controls the page and products
    And User deletes all of them from Wishlist

  @bug1
  Scenario:
    And User open a random category
    And User adds 1 random products to wishlist via mini heart icon
    And User tabs mini heard icon again to remove added product
    And User opens the menu in the left
    And User go to ‘My Wishlist’
    And User checks the page that there is no product on the page
#
  @bug2
  Scenario:
    And User open a random category
    And User adds 1 random products to wishlist via mini heart icon
    And user checks item added toaster message
    And User tabs mini heard icon again to remove added product
    And user checks item removed toaster message