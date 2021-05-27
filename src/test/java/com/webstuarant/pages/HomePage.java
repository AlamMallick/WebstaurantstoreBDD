package com.webstuarant.pages;

import com.webstuarant.utlities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage {


    public HomePage() {
        PageFactory.initElements(Driver.getDriver(),this);

    }


    @FindBy(xpath = "//input[@id='searchval']")
    public WebElement searchTextBox;

    @FindBy(xpath = "//button[.='Search']")
    public WebElement searchButton;





}
