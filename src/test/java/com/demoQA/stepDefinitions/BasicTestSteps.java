package com.demoQA.stepDefinitions;

import com.demoQA.pages.BasicTestStepsPage;
import com.demoQA.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class BasicTestSteps {

    BasicTestStepsPage basicTestStepsPage = new BasicTestStepsPage();

    @Given("navigate to main page")
    public void navigate_to_main_page() {
        Driver.getDriver().get("https://demoqa.com/");
    }
    @When("user clicks on elements tab")
    public void user_clicks_on_elements_tab() {
        basicTestStepsPage.elements.click();
    }
    @When("user clicks on Text Box Element")
    public void user_clicks_on_text_box_element() throws InterruptedException {
        Thread.sleep(6000);
        basicTestStepsPage.textBoxElement.click();
    }

}
