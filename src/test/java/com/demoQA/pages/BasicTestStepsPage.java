package com.demoQA.pages;

import com.demoQA.utilities.Driver;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasicTestStepsPage {

    public BasicTestStepsPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//div[@class='card-up']")
    public WebElement elements;

    @FindBy(id = "item-1")
    public WebElement textBoxElement;


}
