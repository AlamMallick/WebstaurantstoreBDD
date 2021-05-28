package com.webstuarant.step_definations;

import com.webstuarant.pages.*;
import com.webstuarant.utlities.*;
import io.cucumber.java.en.*;
import org.openqa.selenium.Keys;

public class TestStepDefinitions {

    HomePage homePage = new HomePage();
    ResultPage searchPage = new ResultPage();
    CartPage cartPage = new CartPage();
    CheckoutPage checkoutPage = new CheckoutPage();


    @Given("User in on Webstaurant Page")
    public void user_in_on_webstaurant_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }


    @When("User search for {string}.")
    public void user_search_for(String workTable) {
        homePage.searchTextBox.sendKeys(workTable + Keys.ENTER);
    }

    @Then("Check the search result ensuring every product item has the word {string} its title.")
    public void check_the_search_result_ensuring_every_product_item_has_the_word_its_title(String table) {
        searchPage.assertingTable(table);

    }

    @Then("User Add the last of found items to Cart.")
    public void add_the_last_of_found_items_to_cart() {
        searchPage.scrollingDown();
        searchPage.clickTheLastElement();
        cartPage.viewCart.click();
    }

    @Then("User Empty the Cart.")
    public void empty_the_cart() {
        checkoutPage.emptyCartButton.click();
        checkoutPage.waitAndClick();
        checkoutPage.waitForText();
        checkoutPage.verifyingTheEmptyCard();

    }

}
