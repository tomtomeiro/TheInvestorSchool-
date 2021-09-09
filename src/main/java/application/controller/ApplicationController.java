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

import java.util.ArrayList;
import application.dto.InvestmentYieldDto;
import application.service.CompoundInterestCalculator;

/**
 * The Class ApplicationController.
 */
public class ApplicationController {

  /** The calculator. */
  private CompoundInterestCalculator calculator;

  /**
   * The main method.
   *
   * @param args the arguments
   */
  public static void main(String[] args) {

    ArrayList<InvestmentYieldDto> listUserInvesYiel = new ArrayList();
    
    InvestmentYieldDto userInvesYiel1 = new InvestmentYieldDto();
    
    userInvesYiel1.setInvestmentYear(3);
    userInvesYiel1.setInitialInvestment(1200.0);
    userInvesYiel1.setYearlyInput(0);
    userInvesYiel1.setInvestmentYear(0);
    userInvesYiel1.setFinalBalance(0);
    
        
    


  }

}
