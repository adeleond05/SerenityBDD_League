package co.com.uninorte.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/login.feature",
        glue = "co.com.uninorte.stepdefinitions",
        snippets = SnippetType.CAMELCASE)
public class Login {
}
