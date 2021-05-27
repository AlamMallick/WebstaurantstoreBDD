package com.webstuarant.step_definations;

import com.webstuarant.pages.CartPage;
import com.webstuarant.pages.CheckoutPage;
import com.webstuarant.pages.HomePage;
import static com.webstuarant.utlities.BrowserUtils.*;
import com.webstuarant.pages.ResultPage;
import com.webstuarant.utlities.BrowserUtils;
import com.webstuarant.utlities.ConfigurationReader;
import com.webstuarant.utlities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;

import java.util.List;

public class humm {

    HomePage wr = new HomePage();
    ResultPage rp = new ResultPage();
    CartPage cart = new CartPage();
    CheckoutPage checkoutPage = new CheckoutPage();

    @Given("User in on Webstaurant Page")
    public void user_in_on_webstaurant_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    @When("User search for {string}.")
    public void user_search_for(String workTable) throws InterruptedException {
        wr.searchTextBox.sendKeys(workTable);
        clickElement(wr.searchButton);
        sleep(5);


    }

    @Then("Check the search result ensuring every product item has the word {string} its title.")
    public void check_the_search_result_ensuring_every_product_item_has_the_word_its_title(String table) {
        List<String> allText = BrowserUtils.getTextOfElements(rp.productItem);
        for (String each : allText
        ) {
            Assert.assertTrue("Name does not contain the given string", each.contains(table));
        }


    }

    @Then("User Add the last of found items to Cart.")
    public void add_the_last_of_found_items_to_cart() {
        rp.lastProductItem.click();
        cart.addToCart.click();
       cart.viewCart.click();
       sleep(10);
    }

    @Then("User Empty the Cart.")
    public void empty_the_cart() {
        checkoutPage.emptyingTheCart();
        sleep(10);

    }

}
