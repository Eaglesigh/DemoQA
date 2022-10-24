package com.demoQA.pages;

import com.demoQA.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VyTrackLoginPage {
    public VyTrackLoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "prependedInput")
    public WebElement userNameField;

    @FindBy(id = "prependedInput2")
    public WebElement passwordField;

    @FindBy(id = "_submit")
    public WebElement loginBtn;

}
