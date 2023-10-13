package com.suturehealth.pages;

import com.suturehealth.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {
    //initialize pageFactory
    public BasePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
}
