package co.com.uninorte.userinterfaces;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPage {

    public static final Target INPUT_USERNAME = Target.the("input email")
            .located(By.id("email"));

    public static final Target INPUT_PASSWORD = Target.the("input password")
            .located(By.id("password"));

    public static final Target BUTTON_LOGIN = Target.the("button login")
            .locatedBy("//button[text()='Iniciar Sesión']");

    public static final Target TXT_ERROR_MESSAGE = Target.the("error message login")
            .locatedBy("//p[@class='mt-4 text-center text-red-500']");

    public static final Target TXT_TABLA_POSICIONES = Target.the("view option tabla posiciones")
            .locatedBy("//*[text()='Inicio de sesión exitoso']");
}
