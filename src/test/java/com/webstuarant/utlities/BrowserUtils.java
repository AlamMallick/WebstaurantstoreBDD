package com.webstuarant.utlities;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class BrowserUtils {

    private static String parentWindow;

    public static void sleep(double seconds) {
        try {
            Thread.sleep((long) (seconds * 1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static WebElement getElement(String xpath, String value) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 5);
        return wait.until(ExpectedConditions
                .presenceOfElementLocated(By.xpath(String.format(xpath, value))));
    }

    public static WebElement getElement(String xpath) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 5);
        return wait.until(ExpectedConditions
                .presenceOfElementLocated(By.xpath(xpath)));
    }

    public static List<WebElement> getElements(String xpath) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 5);
        return wait.until(ExpectedConditions
                .presenceOfAllElementsLocatedBy(By.xpath(xpath)));
    }

    public static Select getDropdown(WebElement element) {
        return new Select(element);
    }

    public static Select getDropdown(String xpath, String value) {
        return new Select(getElement(xpath, value));
    }

    public static void clickElement(WebElement element) {
        waitUntilClickable(element).click();
    }


    public static void clickElement(String xpath) {
        waitUntilClickable(getElement(xpath)).click();
    }

    public static void clickElement(String xpath, String value) {
        waitUntilClickable(getElement(xpath, value)).click();
    }


    public static void scrollTo(String xpath, String value) {
        ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].scrollIntoView(true);",
                getElement(xpath, value));
    }


    public static WebElement waitUntilClickable(WebElement element) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 5);
        return wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public static void waitForClickable(WebElement element, int timeToWaitInSec) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), timeToWaitInSec);
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }




    public static String getCurrentPageTitle() {
        return Driver.getDriver().getTitle();
    }

    public static String getCurrentPageURL() {
        return Driver.getDriver().getCurrentUrl();
    }

    public static void closeCurrentPage() {
        Driver.getDriver().close();
    }


    public static void waitUntilVisibilityOfAllElements(List<WebElement> elements) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 5);
        wait.until(ExpectedConditions.visibilityOfAllElements(elements));
    }

    public static void waitUntilVisible(WebElement element) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 5);
        wait.until(ExpectedConditions.visibilityOf(element));
    }
}
