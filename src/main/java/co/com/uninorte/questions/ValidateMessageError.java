package co.com.uninorte.questions;

import co.com.uninorte.userinterfaces.LoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ValidateMessageError implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return Text.of(LoginPage.TXT_ERROR_MESSAGE).viewedBy(actor).asString();
    }

    public static ValidateMessageError equalTo(){
        return new ValidateMessageError();
    }
}
