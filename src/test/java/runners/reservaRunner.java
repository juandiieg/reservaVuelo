package runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/reserva.feature",
        glue = "dSteps",
        tags = "@ScenarioReservaVuelo",
        snippets = SnippetType.CAMELCASE
)

public class reservaRunner {

}
