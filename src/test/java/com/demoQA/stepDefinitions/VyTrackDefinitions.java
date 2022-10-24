package com.demoQA.stepDefinitions;

import com.demoQA.pages.VyTrackLoginPage;
import com.demoQA.utilities.ConfigurationReader;
import com.demoQA.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.module.Configuration;

public class VyTrackDefinitions {
    VyTrackLoginPage vyTrackLoginPage=new VyTrackLoginPage();

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("vyTrackURL"));

    }
    @When("user enters credentials")
    public void user_enters_credentials() throws IOException {
        String path="Cucumber.xlsx";
        FileInputStream fileInputStream=new FileInputStream(path);
        XSSFWorkbook workbook=new XSSFWorkbook(fileInputStream);
        XSSFSheet sheet=workbook.getSheet("murat1");
        String username=sheet.getRow(0).getCell(0).toString();
        String password=sheet.getRow(0).getCell(1).toString();
        System.out.println(username);
        System.out.println(password);
        vyTrackLoginPage.userNameField.sendKeys(username);
        vyTrackLoginPage.passwordField.sendKeys(password);
        vyTrackLoginPage.loginBtn.click();


    }
    @Then("user should see main modules")
    public void user_should_see_main_modules(io.cucumber.datatable.DataTable dataTable) {

    }
}
