package userInterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class PagoPage {
    public static final Target TXT_VALID = Target.the("Texto de validación")
            .locatedBy("//h2[contains(text(),'¡Falta poco! Completa tus datos y finaliza tu comp')]");
}
