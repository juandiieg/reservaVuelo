package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userInterfaces.HomePage.*;

public class IngresarDatosReserva implements Task {

    private String origen;
    private String destino;
    private String dia;

    public IngresarDatosReserva(String name, String lastname) {
        this.origen = name;
        this.destino = lastname;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(INP_CIUDADORIGEN),
                Enter.theValue(origen).into(INP_CIUDADORIGEN),
                Click.on(LST_CIUDAD),
                Click.on(INP_CIUDADDESTINO),
                Enter.theValue(destino).into(INP_CIUDADDESTINO),
                Click.on(LST_CIUDAD),
                Click.on(BTN_FECHA),
                Click.on(BTN_DIASALIDA),
                Click.on(BTN_DIAVUELTA),
                Click.on(BTN_BUSCAR)
        );
    }

    public static IngresarDatosReserva ingresarDatos(String origen, String destino){
        return instrumented(IngresarDatosReserva.class, origen, destino);
    }

}
