package com.webstuarant.pages;

import com.webstuarant.utlities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage {
    public CheckoutPage() {
        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath = "//a[.=\"Empty Cart\"]")
public WebElement emptyCartButton;

    @FindBy(xpath = "//button[.=\"Empty Cart\"]")
    public WebElement verifyEmptyCartButton;


    public void emptyingTheCart(){
        emptyCartButton.click();
        verifyEmptyCartButton.click();


    }


}