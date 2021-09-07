package base.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor //crear un constructor 
@NoArgsConstructor //Crear constructores sin argumentos
@ToString
public class Products {
 private String name;
 private Double precio;
 private String descripcion;
 

}
