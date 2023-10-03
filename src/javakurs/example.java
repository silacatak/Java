package javakurs;

public class example {
   public static void main(String[] args) {
	   double[] mylist = {1,1.5,21,433,0.222};
	   double total = 0;
	   double max = mylist[0];
	   
	   for(double number:mylist) {
		   total = total + number;
		   System.out.println("Number:"+number);  
		  if(max<number) {
			  max = number;
			
		  }
		  
	   }
	   System.out.println("Total:"+total);
	 
	   System.out.println("Max number:"+max);
   }
}
