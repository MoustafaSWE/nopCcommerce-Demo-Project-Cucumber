package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class P01_register {

    public void clickOnRegisterLink() {
        WebElement element = new WebDriverWait(Hooks.driver, Duration.ofSeconds(30))
                .until(ExpectedConditions.presenceOfElementLocated((By.className("ico-register"))));

        Hooks.driver.findElement(By.className("ico-register")).click();
    }

    public void selectMaleGender() {
        WebElement element = new WebDriverWait(Hooks.driver, Duration.ofSeconds(30))
                .until(ExpectedConditions.presenceOfElementLocated((By.id("gender-male"))));

        Hooks.driver.findElement(By.id("gender-male")).click();
    }

    public WebElement enterFirstName(String firstName) {
        Hooks.driver.findElement(By.id("FirstName")).sendKeys(firstName);

        return Hooks.driver.findElement(By.id("FirstName"));
    }

    public WebElement enterLastName(String lastName) {
        Hooks.driver.findElement(By.id("LastName")).sendKeys(lastName);

        return Hooks.driver.findElement(By.id("LastName"));
    }

    public WebElement selectDay(int day) {
        Select select = new Select(Hooks.driver.findElement(By.name("DateOfBirthDay")));
        select.selectByIndex(day);

        return Hooks.driver.findElement(By.name("DateOfBirthDay"));
    }

    public WebElement selectMonth(int month) {
        Select select = new Select(Hooks.driver.findElement(By.name("DateOfBirthMonth")));
        select.selectByIndex(month);

        return Hooks.driver.findElement(By.name("DateOfBirthMonth"));
    }

    public WebElement selectYear(int year) {
        Select select = new Select(Hooks.driver.findElement(By.name("DateOfBirthYear")));
        select.selectByIndex(year);

        return Hooks.driver.findElement(By.name("DateOfBirthYear"));
    }

    public WebElement enterEmail(String email) {
        Hooks.driver.findElement(By.id("Email")).sendKeys(email);

        return Hooks.driver.findElement(By.id("Email"));
    }

    public WebElement enterPassword(String password) {
        Hooks.driver.findElement(By.id("Password")).sendKeys(password);

        return Hooks.driver.findElement(By.id("Password"));
    }

    public WebElement enterConfirmPassword(String password) {
        Hooks.driver.findElement(By.id("ConfirmPassword")).sendKeys(password);

        return Hooks.driver.findElement(By.id("ConfirmPassword"));
    }

    public void clickOnRegisterButton() {
        Hooks.driver.findElement(By.name("register-button")).click();
    }

    public WebElement successMessageText() {
        return Hooks.driver.findElement(By.className("result"));
    }

    public WebElement successMessageColor() {
        WebElement element = new WebDriverWait(Hooks.driver, Duration.ofSeconds(30))
                .until(ExpectedConditions.presenceOfElementLocated((By.className("result"))));

        return Hooks.driver.findElement(By.className("result"));
    }

}
