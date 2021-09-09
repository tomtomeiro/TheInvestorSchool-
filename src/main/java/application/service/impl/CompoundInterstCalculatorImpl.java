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
* Nombre de archivo: CompoundInterstCalculatorImpl.java
* Autor: tflores
* Fecha de creación: 7 sep. 2021
*/
package application.service.impl;

import java.util.ArrayList;
import application.dto.InitialInvestmentDto;
import application.dto.InvestmentYieldDto;
import application.service.CompoundInterestCalculator;

/**
 * The Class CompoundInterstCalculatorImpl.
 */
public class CompoundInterstCalculatorImpl implements CompoundInterestCalculator {
  
  /** The input. */
  private double input;
  
  /** The performance. */
  private double performance;
  
  /** The final balence. */
  private double finalBalence;
  

  /**
   * Creates the revenue grid.
   *
   * @param initialInvestment the initial investment
   * @return the array list
   */
  @Override
  public ArrayList<InvestmentYieldDto> createRevenueGrid(InitialInvestmentDto initialInvestment) {
    ArrayList<InvestmentYieldDto> userInvestmentYiel = new ArrayList();
    
    return null;
  }

  /**
   * Validate input.
   *
   * @param initialInvestment the initial investment
   * @return true, if successful
   */
  @Override
  public boolean validateInput(InitialInvestmentDto initialInvestment) {
    InvestmentYieldDto userInvesYiel1 = new InvestmentYieldDto();
    input= userInvesYiel1.getInitialInvestment()*(1+userInvesYiel1.getYearlyInput()/100);
    return false;
  }
  
  
  

}
