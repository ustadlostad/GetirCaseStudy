# Project Title

Getir Mobile Automation Case Study

## Before Starting

* Cucumber, Junit, Selenium and Appium are used for this project.

* Test is running on Android emulator by default.

## Test Coverage

### Case 1

• User should pass onboarding screens

• User checks if home page exists or not

• User changes category to ‘Baby Care’

• User open a random product detail

• User adds this product to basket and return last page

• User changes category to ‘Snacks’

• User open a random product detail

• User adds this product to basket and return last page

• User goes to basket and control added products and prices

• User should deletes all products from basket and makes controls

### Case2

• User should pass onboarding screens

• User checks if home page exists or not

• User gets the number of categories and write this number to console

• User open a random category

• User adds 3 random products to wishlist via mini heart icon

• User opens the menu in the left

• User go to ‘My Wishlist’

• User controls the page and products

• User deletes all of them from Wishlist

### Case3

* User open a random category
* User adds 1 random products to wishlist via mini heart icon
* User tabs mini heard icon again to remove added product
* User opens the menu in the left
* User go to ‘My Wishlist’
* User checks the page that there is no product on the page
-------------------------------------------------------------------
* User open a random category 
* User adds 1 random products to wishlist via mini heart icon
* user checks item added toaster message
* User tabs mini heard icon again to remove added product
* user checks item removed toaster message

## How To Run Test

* After cloning the project you need to start appium server and need to run an AVD.
* AVD name need to be set in the project.
* After running AVD and appium server, mvn clean verify can be used for run the tests and get the test results after tests are done.
* You can find the test reports under target/cucumber-report-html/cucumber-html-reports/report-feature_XXXX.html
* If you open this html file with the browser you can see the detailed test results.

## Structure

MAVEN - Project Structure.

## Project Owner

Batur Türkmen [ustadlostad](https://github.com/ustadlostad)
