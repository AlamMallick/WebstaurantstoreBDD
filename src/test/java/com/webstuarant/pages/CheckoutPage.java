package com.webstuarant.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.webstuarant.utlities.BrowserUtils.waitUntilVisible;


public class CheckoutPage extends BasePage {


    @FindBy(xpath = "//a[.=\"Empty Cart\"]")
    public WebElement emptyCartButton;

    @FindBy(xpath = "//button[.=\"Empty Cart\"]")
    public WebElement verifyEmptyCartButton;

    @FindBy(css = "p[class='header-1']")
    public WebElement emptyCartHeader;





    public void waitForText(){
        waitUntilVisible(emptyCartHeader);
    }


    public void verifyingTheEmptyCard(){
        Assert.assertEquals(emptyCartHeader.getText(), "Your cart is empty.");

    }

    public void waitAndClick() {
        waitUntilVisible(verifyEmptyCartButton);
        verifyEmptyCartButton.click();
    }



}