Feature: Reserva de vuelo desde plataforma web
  Como usuario no existente quiero reservar un vuelo

  @ScenarioReservaVuelo
  Scenario: Realizar una reserva
    Given Que un usuario ingresa a la pagina web despegar
    When El ingresa los datos del vuelo medellin, bogota
    And Selecciona el primer vuelo
    Then El valida el texto: ¡Falta poco! Completa tus datos y finaliza tu compra. En la pagina de pago