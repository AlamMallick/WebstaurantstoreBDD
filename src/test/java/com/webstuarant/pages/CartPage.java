package com.webstuarant.pages;

import com.webstuarant.utlities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {
    public CartPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
       @FindBy(id = "buyButton")
    public WebElement addToCart;

  @FindBy(xpath = "(//button[@class='btn btn-primary'])[1]")
  public WebElement viewCart;

}
