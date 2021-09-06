package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userInterfaces.VuelosPage.*;

public class SeleccionarVuelo implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_SELECCIONAR)
        );
    }

    public static SeleccionarVuelo seleccionarVuelo() {
        return instrumented(SeleccionarVuelo.class);
    }

}
