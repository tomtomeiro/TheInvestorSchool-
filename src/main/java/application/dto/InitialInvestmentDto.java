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
* Nombre de archivo: InitialInvestmentDto.java
* Autor: tflores
* Fecha de creación: 7 sep. 2021
*/
package application.dto;

import lombok.Getter;
import lombok.Setter;

/**
 * Gets the investment years.
 *
 * @return the investment years
 */
@Getter

/**
 * Sets the investment years.
 *
 * @param investmentYears the new investment years
 */
@Setter
public class InitialInvestmentDto {
  
  /** The initialinvestment. */
  private Double initialInvestment;
  
  /** The yearlyinput. */
  private Double yearlyInput;
  
  /** The yearly input increment. */
  private Integer yearlyInputIncrement;
  
  /** The investment yield. */
  private Float investmentYield;
  
  /** The investment years. */
  private Integer investmentYears;

  

}
