package com.eurotech.step_definitions;

import com.eurotech.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.time.Duration;

public class Hooks {
    @Before //cucumber
    public void setUp(){

        Driver.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    @After //cucumber
    public void tearDown(Scenario scenario) throws InterruptedException {
        if(scenario.isFailed()){
            final byte[] screenshot = ((TakesScreenshot) Driver.get()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot,"image/png","screenshot");
        }
        Thread.sleep(2000);
        Driver.closeDriver();
    }
    @Before("@db")
    public void setUpDB(){
        System.out.println("This is coming from Before DB");
        System.out.println("Connecting DataBase");
    }

    @After("@db")
    public void tearDownDB(){
        System.out.println("This is coming from After DB");
        System.out.println("Disconnecting DataBase");
    }
}
