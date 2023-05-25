package com.eurotech.step_definitions;

import com.eurotech.pages.DashboardPage;
import com.eurotech.pages.ExperiencePage;
import com.eurotech.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

public class AddExperienceStepDef {
    DashboardPage dashboardPage=new DashboardPage();
    ExperiencePage experiencePage=new ExperiencePage();


    @Then("The user should land on Add an Experience page")
    public void the_user_should_land_on_add_an_experience_page() {
        Assert.assertTrue(experiencePage.addExperienceTitle.isDisplayed());
    }
    @Then("The user fills {string} field as {string}")
    public void the_user_fills_field_as(String fieldName, String textValue) {

//        experiencePage.getField(fieldName).sendKeys(text);
        experiencePage.fillField(fieldName,textValue);
    }


    @And("The user picks {string} as {string}")
    public void theUserPicksAs(String experienceDateField, String  experienceDateValue) {
        Driver.get().findElement(By.xpath("//h4[text()='"+experienceDateField+"']/../input")).sendKeys( experienceDateValue);
    }

    @And("The user submits the experience form")
    public void theUserSubmitsTheExperienceForm() {
        experiencePage.submitBtn.click();
    }

    @Then("The user should see {string} message")
    public void theUserShouldSeeMessage(String expectedMessage) {
        Assert.assertEquals(expectedMessage,dashboardPage.experienceAddedMessage.getText());
    }
}
