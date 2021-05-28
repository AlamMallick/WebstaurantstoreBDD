Feature: Search for stainless work table

  Scenario:Testing Websturant functionality
  Given User in on home Page
  When  User search for 'stainless work table'.
  Then Check the search result ensuring every product item has the word "Table" its title.
  Then User Add the last of found items to Cart.
   And User Empty the Cart.
