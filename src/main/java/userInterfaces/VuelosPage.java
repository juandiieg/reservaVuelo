package userInterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class VuelosPage {

    public static final Target BTN_SELECCIONAR = Target.the("Boton seleccionar vuelo")
            .locatedBy("//body/div[@id='flights-container-wrapper']/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[4]/app-root[1]/app-common[1]/items[1]/div[1]/span[1]/div[1]/span[1]/cluster[1]/div[1]/div[1]/div[2]/fare[1]/span[1]/span[1]/div[2]/buy-button[1]/a[1]/div[1]");

}
