package javakurs;

public class perfectnumber {
  public static void main(String[] args) {
	  //6-->1,2,3  1+2+3=6
	  //28-->1,2,4,7,14  1+2+4+7+14=28
	  int number = 32;
	  int total= 0;
	  
	  for(int i=1;i<number;i++) {
		  if(number % i == 0) {
			  total=total + i;
		  }	
	  }
	 
	  if (number==total) {
		  System.out.println("Number is perfect number");
		  
	  }
	  else {
		  System.out.println("Number isn't perfect number");
	  }
	  
  }
}
