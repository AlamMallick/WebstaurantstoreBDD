package com.webstuarant.pages;

import com.webstuarant.utlities.BrowserUtils;
import com.webstuarant.utlities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ResultPage {

    public ResultPage() {
        PageFactory.initElements(Driver.getDriver(),this);

    }


    @FindBy(xpath= "//a[starts-with(@class,\"description\")]")
    public List<WebElement> productItem;

    @FindBy(xpath="(//a[@href='/regency-30-x-72-18-gauge-304-stainless-steel-commercial-work-table-with-galvanized-legs-and-undershelf/600T3072G.html'])[1]")
    public WebElement lastProductItem;




    public void theLastProduct() {
        for (int i = 0; i <= productItem.size()-1 ; i++) {
            if(i==productItem.size()-1){
                productItem.get(i).click();
        }

            }
        }
    }

