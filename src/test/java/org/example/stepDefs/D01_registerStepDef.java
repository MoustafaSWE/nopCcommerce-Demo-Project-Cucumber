package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P01_register;
import org.testng.asserts.SoftAssert;

public class D01_registerStepDef {
    P01_register register = new P01_register();
    SoftAssert softAssert = new SoftAssert();

    @Given("user go to register page")
    public void goRegisterPage(){
        register.clickOnRegisterLink();
    }

    @When("user select gender type")
    public void userClickOnMaleGender(){
        register.selectMaleGender();
    }

    @And("user enter first name \"automation\" and last name \"tester\"")
    public void userEnterFirstNameAndLastName(){
        register.enterFirstName("automation");
        register.enterLastName("tester");
    }

    @And("user enter date of birth")
    public void userEnterDateOfBirth(){
        register.selectDay(1);
        register.selectMonth(1);
        register.selectYear(25);
    }

    @And("user enter email \"test@example.com\" field")
    public void userEnterEmail(){
        register.enterEmail("test1@example.com");
    }

    @And("user fills Password fields \"P@ssw0rd\" \"P@ssw0rd\"")
    public void userEnterPassword(){
        register.enterPassword("P@ssw0rd");
        register.enterConfirmPassword("P@ssw0rd");
    }

    @And("user clicks on register button")
    public void userClickOnRegisterButton(){
        register.clickOnRegisterButton();
    }

    @Then("success message is displayed")
    public void assertOnSuccessMessage(){
        softAssert.assertTrue(register.successMessageText().getText().contains("Your registration completed"));
        softAssert.assertEquals(register.successMessageColor().getCssValue("color"),"rgba(76, 177, 124, 1)");
        softAssert.assertAll();
    }
}
