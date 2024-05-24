package co.com.uninorte.stepdefinitions;

import co.com.uninorte.models.Account;
import co.com.uninorte.tasks.LogIn;
import co.com.uninorte.tasks.NavigateTo;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class GeneralStepDefinitions {

    @Managed(driver = "firefox")
    protected WebDriver hisBrowser;

    @Before
    public void prepareStage() {
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("USER");
    }

    @Given("^User logs in the with credentials$")
    public void user_logs_in_the_with_credentials(List<Account> accountList) {
        OnStage.theActorInTheSpotlight().wasAbleTo(NavigateTo.site(),
                LogIn.with(accountList.get(0)));
    }
}
