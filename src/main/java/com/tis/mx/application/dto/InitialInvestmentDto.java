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
