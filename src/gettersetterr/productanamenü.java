package gettersetterr;

public class productanamenü {
	 public static void main(String[] args) 
	    {
	    	productencapsltion nothing = new productencapsltion();
	    	nothing.id=1;
	    	nothing.name = "Laptop";
	    	nothing.description = "HP Laptop";
	    	nothing.price = 300.5;
	    	nothing.stockAmount= 3;
	    	
	    	System.out.println(nothing.getKod());
	    	System.out.println(nothing.description);
	    	System.out.println(nothing.getName());
	    }
}
