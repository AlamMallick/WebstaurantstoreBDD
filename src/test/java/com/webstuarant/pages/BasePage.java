package com.webstuarant.pages;

import com.webstuarant.utlities.Driver;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {
    public BasePage() {
        PageFactory.initElements(Driver.getDriver(),this);

    }
}
