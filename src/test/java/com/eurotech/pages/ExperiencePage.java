package com.eurotech.pages;

import com.eurotech.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ExperiencePage extends BasePage{

    @FindBy(css = "#addexperience-heading")
    public WebElement addExperienceTitle;

    @FindBy(xpath = "//*[@type='submit']")
    public WebElement submitBtn;



    public WebElement getField(String fieldName){
        WebElement element = Driver.get().findElement(By.xpath("//*[contains(@placeholder,'"+fieldName+"')]"));
        return element;
    }

    public void fillField(String fieldName,String textValue){
        WebElement element = Driver.get().findElement(By.xpath("//*[contains(@placeholder,'"+fieldName+"')]"));
        element.sendKeys(textValue);
    }
}
