package classes;

public class product {
   public static void main(String[] args) 
   {
	   product2 product =new product2();
	   product.id=1;
	   product.name="Laptop";
	   product.description= "HP Laptop";
	   product.price = 5000.0;
	   product.stockAmount = 3;
	   
	  product3 productManager = new product3();
	  productManager.Add(product);
	  
	   
   }
}
