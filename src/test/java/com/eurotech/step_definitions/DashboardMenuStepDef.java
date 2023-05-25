package com.eurotech.step_definitions;

import com.eurotech.pages.DashboardPage;
import com.eurotech.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;

public class DashboardMenuStepDef {

    DashboardPage dashboardPage = new DashboardPage();
    @Then("The user should be able to see following menu")
    public void the_user_should_be_able_to_see_following_menu(List<String> expectedList) {
        System.out.println("Menu option size: "+expectedList.size());
        System.out.println("Menu option: "+expectedList);

        List<String> actualList = BrowserUtils.getElementsText(dashboardPage.menuList);
        System.out.println(actualList);
        Assert.assertEquals(expectedList,actualList);

    }

    @When("The user clicks {string}")
    public void the_user_clicks(String menuName) {
        dashboardPage.navigateMenu(menuName);
    }

}
