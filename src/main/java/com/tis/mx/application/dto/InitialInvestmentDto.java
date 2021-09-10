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
* Fecha de creación: 10 sep. 2021
*/
package com.tis.mx.application.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class InitialInvestmentDto {


  private Double initialInvestment;
  private Double yearlyInput;
  
  /** The yearly input increment. */
  private Integer yearlyInputIncrement;
  private Float investmentYield;
  private Integer investmentYears;

}
