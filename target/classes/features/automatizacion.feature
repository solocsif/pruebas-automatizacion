Feature: reserva de hotel
Scenario: la reservacion del hotel con precio correcto
Given abrir el navegador
When ingresar a la url
Then Enviar los datos del check
And elegir la tarifa mas barata
