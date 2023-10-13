package com.suturehealth.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DemoPage extends BasePage{

    @FindBy(xpath="//h1[@class='Home_title__T09hD']")
    public WebElement title;

    @FindBy(id="get-ditto-data")
    public WebElement getDittoDataButton;

    @FindBy(xpath="//p[@data-testid=\"ditto-abilities\"]")
    public WebElement dittoAbilitiesLimber;
}
