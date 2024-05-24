package co.com.uninorte.stepdefinitions;

import co.com.uninorte.exceptions.ValidateMessageException;
import co.com.uninorte.questions.ValidateMessageError;
import co.com.uninorte.questions.ValidateOption;
import cucumber.api.java.en.Then;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import org.hamcrest.Matchers;

public class LoginStepDefinitions {

    @Then("^View the message (.*)$")
    public void view_the_message(String message) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidateMessageError.equalTo(),
                Matchers.equalTo(message)).orComplainWith(Error.class,
                ValidateMessageException.MESSAGE_LOGIN_ERROR));
    }

    @Then("^View the page option (.*)$")
    public void view_the_page_option(String message) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidateOption.equalTo(),
                Matchers.equalTo(message)).orComplainWith(Error.class,
                ValidateMessageException.MESSAGE_LOGIN_ERROR));
    }
}
