package com.nttdata.stepsdefinitions;

import com.nttdata.steps.AirbnbSearchSteps;
import com.nttdata.steps.YoutubeSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.jruby.RubyProcess;
import org.junit.Assert;

public class YoutubeStepsDefs {

    @Steps
    YoutubeSteps youtube;

    @Given("estoy en la app de Youtube")
    public void estoyEnLaAppDeYoutube() {
        System.out.println("estoyEnLaAppDeYouTube");
    }

    @When("busco termino {string}")
    public void buscoTermino(String arg0) {
        System.out.println("buscoTermino ini");
        youtube.searchByText(arg0);
        System.out.println("buscoElTermino fin");
    }

    @Then("valido los resultados de la busqueda")
    public void validoLosResultadosDeLaBusqueda() {
        try {
            Thread.sleep(10000);
        } catch (Exception e) {
        }
    }
}
