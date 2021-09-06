package dSteps;

import cucumber.api.java.en.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Consequence;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import tasks.*;
import userInterfaces.*;

public class reservaSteps {

    @Managed(driver = "chrome")
    private WebDriver navegador;
    private Actor actor = Actor.named("Juan");
    private HomePage home = new HomePage();

    @Given("^Que un usuario ingresa a la pagina web despegar$")
    public void queUnUsuarioIngresaALaPaginaWebDespegarCom() {
        actor.can(BrowseTheWeb.with(navegador));
        navegador.manage().window().maximize();
        actor.wasAbleTo(Open.browserOn(home));
    }

    @When("^El ingresa los datos del vuelo (.*), (.*)$")
    public void elIngresaLosDatosDelVueloMedellinBogota(String origen, String destino) {
        actor.wasAbleTo(
                IngresarDatosReserva.ingresarDatos(origen, destino)
        );
    }

    @When("^Selecciona el primer vuelo$")
    public void seleccionaElPrimerVuelo() {
        actor.wasAbleTo(
                SeleccionarVuelo.seleccionarVuelo()
        );
    }

    @Then("^El valida el texto: (.*). En la pagina de pago$")
    public void elValidaElTextoEnLaPaginaDePago(String texto) {
        actor.wasAbleTo(
                ValidarTexto.validarTexto(texto)
        );
    }

}
