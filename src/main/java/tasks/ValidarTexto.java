package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.containsText;
import static userInterfaces.PagoPage.*;

public class ValidarTexto implements Task {

    String texto;

    public ValidarTexto(String texto){
        this.texto = texto;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.should(
                seeThat(the(TXT_VALID), containsText(texto))
        );
    }

    public static ValidarTexto validarTexto(String texto) {
        return instrumented(ValidarTexto.class, texto);
    }
}
