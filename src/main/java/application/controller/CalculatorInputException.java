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
* Nombre de archivo: CalculatorInputException.java
* Autor: tflores
* Fecha de creación: 9 sep. 2021
*/
package application.controller;

public class CalculatorInputException extends RuntimeException {

  /**
   * 
   */
  private static final long serialVersionUID = 7309182492429429203L;

  /**
   * Instantiates a new calculator input exception.
   *
   * @param message the message
   */
  public CalculatorInputException(String message) {
    super(message);
  }


}
 