/* 
* This program is free software: you can redistribute it and/or modify  
* it under the terms of the GNU General Public License as published by  
* the Free Software Foundation, version 3.
*
* This program is distributed in the hope that it will be useful, but 
* WITHOUT ANY WARRANTY; without even the implied warranty of 
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU 
* General Public License for more details.
*
* Nombre de archivo: ApplicationControllerTest.java
* Autor: tflores
* Fecha de creación: 9 sep. 2021
*/
package application.controller;

import static org.junit.Assert.assertEquals;


import application.dto.InitialInvestmentDto;
import application.dto.InvestmentYieldDto;
import application.service.CompoundInterestCalculator;
import application.service.impl.CompoundInterstCalculatorImpl;
import org.junit.Before;
import org.junit.Test;
import java.util.List;

public class ApplicationControllerTest {

  private ApplicationController controller;
  private InitialInvestmentDto initialInvestment;
  private CompoundInterestCalculator calculator;

  @Before
  public void createValuesBeforeToTest() {
    // Creando una calculadora
    this.calculator = new CompoundInterstCalculatorImpl();
    // Crear controlador con su dependencia de una calculadora
    this.controller = new ApplicationController(this.calculator);


    // creando los valores iniciales de la inversion
    this.initialInvestment = new InitialInvestmentDto();

    this.initialInvestment.setInitialinvestment(Double.valueOf(5000.0));
    this.initialInvestment.setYearlyinput(Double.valueOf(3000.0));
    this.initialInvestment.setYearlyInputIncrement(Integer.valueOf(1));
    this.initialInvestment.setInvestmentYears(5);
    this.initialInvestment.setInvestmentYield(Float.valueOf(0.21f));

  }

  /**
   * Should generate table yield.
   */
  @Test
  public void shouldGenerateTableYield() {
    List<InvestmentYieldDto> tableYield = controller.createTableYield(initialInvestment);
    assertEquals(5, tableYield.size());
  }


}
