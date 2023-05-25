package com.eurotech.pages;

import com.eurotech.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class DashboardPage extends BasePage{


    @FindBy(css = "#dashboard-p1")
    public WebElement welcomeMessage;


    @FindBy(css = ".nav__menu-item")
    public List<WebElement> menuList;


    @FindBy(linkText = "All Posts")
    public WebElement allPosts;


    @FindBy(linkText = "Developers")
    public WebElement developers;

    @FindBy(linkText = "My Account")
    public WebElement myAccount;

    @FindBy(css = ".btn.btn-light")
    public List<WebElement> dashboardList;

    @FindBy(xpath = "//table[@id='dashboard-experience-table']/thead/tr")
    public List<WebElement> headerList;


    @FindBy(xpath = "//*[text()='Edit Profile']")
    public WebElement editProfileButton;

    @FindBy(xpath = "//*[text()='Apple']/following-sibling::*[1]")
    public WebElement applesJobTitle;

    @FindBy(xpath = "//*[@id='dashboard-experince-item-raw']//time/..")
    public WebElement experienceDate;


    @FindBy(xpath = "//*[text()='Experience Added']")
    public WebElement experienceAddedMessage;


    public void navigateMenu(String menuName){
        Driver.get().findElement(By.xpath("//*[text()='"+menuName+"']")).click();
    }

    public void navigateSubMenu(String menuName){
        Driver.get().findElement(By.xpath("//span[text()='"+menuName+"']")).click();
    }
    public boolean isDisplayedBln(String menuName){
        return Driver.get().findElement(By.xpath("//*[text()='"+menuName+"']")).isDisplayed();
    }
    public String getCurrentExperienceTitle(){
        return Driver.get().findElement(By.xpath("//table/tbody/tr/td[2]")).getText();
    }
    public String getCurrentExperienceTitle2(String company){
        return Driver.get().findElement(By.xpath("//td[text()='" + company + "']/../td[2]")).getText();
    }
    public String getCurrentExperienceCompany(){
        return Driver.get().findElement(By.xpath("//table/tbody/tr/td[1]")).getText();
    }

    public String getCurrentExperienceCompany2(String title){

        return Driver.get().findElement(By.xpath("//*[text()='" + title + "']/../td[1]")).getText();
    }
    public String setDate(String company){
        return Driver.get().findElement(By.xpath("//td[text()='" + company + "']/../td[3]")).getText();
    }
    public String getHeader(String name){
        return   Driver.get().findElement(By.xpath("//*[text()='"+name+"']")).getText();
    }
    public String getCompanyName(String title){
        return Driver.get().findElement(By.xpath("//td[text()='"+title+"']/../td[1]")).getText();
    }
}
