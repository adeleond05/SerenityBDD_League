package co.com.uninorte.tasks;

import co.com.uninorte.models.Account;
import co.com.uninorte.userinterfaces.LoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class LogIn implements Task {
    private Account account;

    public LogIn(Account account) {
        this.account = account;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(account.getUsername()).into(LoginPage.INPUT_USERNAME),
                Enter.theValue(account.getPassword()).into(LoginPage.INPUT_PASSWORD),
                Click.on(LoginPage.BUTTON_LOGIN)
        );
    }

    public static LogIn with(Account account){
        return Tasks.instrumented(LogIn.class, account);
    }
}
