package com.eurotech.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/cucumber.json",
                "html:target/default-html-reports.html",
                "rerun:target/rerun.txt"},
        features = "src/test/resources/Features", // copy from content root
        glue = "com/eurotech/step_definitions", // copy from source root
        dryRun = false,
        // if true, dryRun will get only undefined step definition, if false, it will execute normal

        tags = "@wip"

//        tags = "@login and not @wip" // except @wip, all scenarios will be executed
//        tags = "@login and not @wip and @blaBla" // what if there are more than one  except tags:)
//        tags = "@Teacher and @AllPostMenu" // all tags must be matched
//        tags = "@Teacher or @AllPostMenu" // which be matched will execute
//        tags = "@login" // all scenarios will be executed
//        tags = "@DevelopersMenu" // Run only specific @tags // case sensitive

)

public class CukesRunner {

}
