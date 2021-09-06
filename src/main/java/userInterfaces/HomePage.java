package userInterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import net.serenitybdd.screenplay.targets.Target;

@DefaultUrl("https://www.despegar.com")
public class HomePage extends PageObject{

    public static final Target INP_CIUDADORIGEN = Target.the("Input ciudad origen")
            .locatedBy("//body/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]");
    public static final Target INP_CIUDADDESTINO = Target.the("Input ciudad destino")
            .locatedBy("//body/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/input[1]");
    public static final Target LST_CIUDAD = Target.the("Lista despegable de ciudad origen")
            .locatedBy("//body/div[3]/div[1]/div[1]/ul[1]/li[1]");
    public static final Target LST_CIUDADDESTINO = Target.the("Lista despegable de ciudad origen")
            .locatedBy("//body/div[3]/div[1]/div[1]/ul[1]/li[1]");
    public static final Target BTN_FECHA = Target.the("Calendario fecha salida")
            .locatedBy("//body/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]");
    public static final Target BTN_DIASALIDA = Target.the("Dia fecha de salida")
            .locatedBy("//body/div[@id='component-modals']/div[1]/div[1]/div[2]/div[1]/div[3]/div[9]/div[1]");
    public static final Target BTN_DIAVUELTA = Target.the("Dia fecha de salida")
            .locatedBy("//body/div[@id='component-modals']/div[1]/div[1]/div[2]/div[2]/div[3]/div[19]/div[1]");
    public static final Target BTN_BUSCAR = Target.the("Botón buscar")
            .locatedBy("//body/div[2]/div[1]/div[1]/div[1]/div[2]/div[3]/button[1]");
}
