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
* Nombre de archivo: InvestmentYieldDto.java
* Autor: tflores
* Fecha de creación: 9 sep. 2021
*/


package application.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


/**
 * Gets the final balance.
 *
 * @return the final balance
 */
@Getter

/**
 * Sets the final balance.
 *
 * @param finalBalance the new final balance
 */
@Setter

/**
 * Instantiates a new investment yield dto.
 *
 * @param investmentYear the investment year
 * @param initialInvestment the initial investment
 * @param yearlyInput the yearly input
 * @param investmentYield the investment yield
 * @param finalBalance the final balance
 */
@AllArgsConstructor
@NoArgsConstructor
public class InvestmentYieldDto {


  /** The investment year. */
  private int investmentYear;
  
  /** The initial investment. */
  private double initialInvestment;
  
  /** The yearly input. */
  private double yearlyInput;
  
  /** The investment yield. */
  private double investmentYield;
  
  /** The final balance. */
  private double finalBalance;



}
