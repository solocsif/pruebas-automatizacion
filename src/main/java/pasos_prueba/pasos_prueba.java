package pasos_prueba;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import selenium.selenium;
public class pasos_prueba {
	selenium hotel= new selenium();
	@Given("^abrir el navegador$")
	public void abrir_el_navegador() throws Throwable {
	   hotel.abrir();
	}

	@When("^ingresar a la url$")
	public void ingresar_a_la_url() throws Throwable {
	   hotel.abrirpagina();
	}

	@Then("^Enviar los datos del check$")
	public void enviar_los_datos_del_check() throws Throwable {
	    hotel.Enviarlosdatosdelcheck();
	}

	@Then("^elegir la tarifa mas barata$")
	public void elegir_la_tarifa_mas_barata() throws Throwable {
		hotel.elegirlatarifamasbarata();
	}
}
