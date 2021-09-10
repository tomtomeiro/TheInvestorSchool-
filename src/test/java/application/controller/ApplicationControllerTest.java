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

    this.initialInvestment.setInitialInvestment(Double.valueOf(5000.00));
    this.initialInvestment.setYearlyInput(Double.valueOf(3000.00));
    this.initialInvestment.setYearlyInputIncrement(1);
    this.initialInvestment.setInvestmentYears(5);
    this.initialInvestment.setInvestmentYield(21f);

  }

  /**
   * Should generate table yield.  
   */
  @Test
  public void shouldGenerateTableYield() {
    List<InvestmentYieldDto> tableYield = controller.createTableYield(initialInvestment);
    assertEquals(5, tableYield.size());
    
    InvestmentYieldDto firstYear = tableYield.get(0);
    assertEquals(5000.00, firstYear.getInitialInvestment());
    assertEquals(3000.00, firstYear.getYearlyInput());
    assertEquals(1680.00, firstYear.getInvestmentYear());
    assertEquals(9680.00, firstYear.getFinalBalance());
   
    
  }  


}
