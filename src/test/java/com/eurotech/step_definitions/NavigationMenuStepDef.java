package com.eurotech.step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

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



    @Then("The user should be able to see welcome message")
    public void the_user_should_be_able_to_see_welcome_message() {
        System.out.println("The user should be able to see welcome message");
    }
    @Then("The user navigates to Developers Menu")
    public void the_user_navigates_to_developers_menu() {
        System.out.println("The user navigates to Developers Menu");
    }
    @Then("The user able to see developer text")
    public void the_user_able_to_see_developer_text() {
        System.out.println("The user able to see developer text");
    }

    @And("The user navigates to All Post Menu")
    public void theUserNavigatesToAllPostMenu() {
        System.out.println("The user navigates to All Post Menu");
    }

    @Then("The user able to see Post text")
    public void theUserAbleToSeePostText() {
        System.out.println("The user able to see Post text");
    }

    @And("The user navigates to My Account Menu")
    public void theUserNavigatesToMyAccountMenu() {

    }

    @Then("The user able to see Dashboard text")
    public void theUserAbleToSeeDashboardText() {
        System.out.println("The user able to see Dashboard text");
    }
}
