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
* Nombre de archivo: ApplicationController.java
* Autor: tflores
* Fecha de creación: 8 sep. 2021
*/
package application.controller;


import java.util.List;
import application.dto.InitialInvestmentDto;
import application.dto.InvestmentYieldDto;
import application.service.CompoundInterestCalculator;

/**
 * The Class ApplicationController.
 */
public class ApplicationController {

  /** The calculator. */
  private CompoundInterestCalculator calculator;

  public ApplicationController(CompoundInterestCalculator calculator) {
    this.calculator=calculator;
  }
  
  public List<InvestmentYieldDto> createTableYield(InitialInvestmentDto initialInvestment){
  if(calculator.validateInput(initialInvestment)){
    return calculator.createRevenueGrid(initialInvestment);
  }
  throw new RuntimeException("El calculo no puede se ejecutado");
    
  }
  

}
