package com.eurotech.pages;

import com.eurotech.utilities.ConfigurationReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

public class LoginPage extends BasePage{




    @FindBy(css = "#rcc-confirm-button")
    public WebElement iUnderstandButton;

    @FindBy(name = "email")
    public WebElement usernameInput;

    @FindBy(name = "password")
    public WebElement passwordInput;

    @FindBy(id = "loginpage-form-btn")
    public WebElement loginButton;

    @FindBy(xpath = "//div[@class='alert alert-danger']")
    public WebElement warningMessage;

   @FindBy(xpath = "//*[@id='loginpage-form']")
    public WebElement loginPart;


    //@FindAll
    //To use multiple locator if at least one of them is matching it will find the web element.
    @FindAll({
            @FindBy(id = "loginpage-input-email"),
            @FindBy(name = "email")})
    public WebElement emailInput;


    //@FindBys
    // if the locators are matching with element then it will return it. And logic applies here
    @FindBys({
            @FindBy(xpath="//input[@type='email']"),
            @FindBy(id="loginpage-input-email")})

    public WebElement passwordInputFindBys;


    public void login(String username, String password){
        iUnderstandButton.click();
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginButton.click();
    }

    public void loginAsTeacher(){
        String username = ConfigurationReader.get("userTeacher");
        String password = ConfigurationReader.get("userPassword");
        login(username, password);
    }

    public void loginAsStudent(){
        String username = ConfigurationReader.get("usernameStudent");
        String password = ConfigurationReader.get("passwordStudent");
        login(username, password);
    }
    public void loginAsDeveloper() {
        String username = ConfigurationReader.get("usernameDeveloper");
        String password = ConfigurationReader.get("passwordDeveloper");
        login(username, password);
    }

    public String getWarningMessage(String message){
        String actualMessage = null;
        if(message.contains("@")||message.contains("fill")||message.contains("position")) {
            actualMessage = usernameInput.getAttribute("validationMessage");
        }else if(message.contains("character")) {
            actualMessage = passwordInput.getAttribute("validationMessage");
        }else {
            actualMessage = warningMessage.getText();
        }

        return actualMessage;
    }

}
