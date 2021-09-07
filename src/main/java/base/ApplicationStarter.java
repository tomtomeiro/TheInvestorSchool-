package base;

import base.dto.Products;

public class ApplicationStarter {

  public static void main(String[] args) {
   /*Products product = new Products();
    product.setName("Un producto");
    product.setPrecio(Double.valueOf(200));
    product.setDescripcion("Descripcion del producto");
    

    product.getName();*/
    Products product = new Products("Producto",200.0,"leche");
    Products product2 = new Products();
    
    System.out.println(product);
  
  }

}
