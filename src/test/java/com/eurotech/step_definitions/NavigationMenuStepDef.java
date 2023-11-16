package com.eurotech.step_definitions;

import com.eurotech.pages.DashboardPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class NavigationMenuStepDef {
    /*
    Task
Create new feature file navigationMenu
And write scenarios for given requirements and test case
Try to reuse steps from previous feature file.

After finishing the scenarios , add necessary tags , run with cukesRunner and generate undefined steps.

—-Write scenario
Create step definitions
No need to use any JAVA code
Just implement the step definitions by adding print statement.
Create new class NavigationMenu.stepDef


Scenario 1:
Login as a Teacher
At first get the text of Welcome
Then go to Developers Menu and get the text of Developers

Scenario 2:
Login as a Teacher
At first get the text of Welcome
Then go to All Post Menu and get text of Posts

Scenario 3:
Login as a Teacher
At first get the text of Welcome
Then go to my account menu and get the text of Dasboard
     */


    DashboardPage dashboardPage = new DashboardPage();

    @Then("The user should be able to see welcome message")
    public void the_user_should_be_able_to_see_welcome_message() {
        System.out.println("Welcome message is here");

    }

    @Then("The user navigates to Developers Menu")
    public void the_user_navigates_to_developers_menu() {
        System.out.println("Navigates to developer menu");
    }

    @Then("The user able to see developer text")
    public void the_user_able_to_see_developer_text() {
        System.out.println("Developer text is here");
    }

    @Then("The user navigates to All Post Menu")
    public void the_user_navigates_to_all_post_menu() {

        System.out.println("Navigate to all post menu");
    }

    @Then("The user able to see Post text")
    public void the_user_able_to_see_post_text() {
        System.out.println("Post Text is here");
    }

    @And("The user navigates to Dashboard Menu")
    public void theUserNavigatesToDashboardMenu() {

        System.out.println("Navigate Dashboard Menu");
    }

    @Then("The user able to see Dashboard text")
    public void theUserAbleToSeeDashboardText() {
        System.out.println("Dashboard Text is here");
    }

    @Then("The user navigates to {string} Menu")
    public void the_user_navigates_to_menu(String menuName) {


        dashboardPage.navigateMenu(menuName);


    }

    @Then("The user should be able to see header as {string}")
    public void the_user_should_be_able_to_see_header_as(String expectedHeader) {

        String actualHeader = dashboardPage.getHeader(expectedHeader);
        Assert.assertEquals(expectedHeader, actualHeader);


    }


}
