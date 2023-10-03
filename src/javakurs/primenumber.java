package javakurs;

public class primenumber {
  public static void main(String[] args) {
	   int number = 11;
	   Boolean isprime = true;
	   
	   for(int i=2;i<number;i++) {
		   if(number % i == 0) {
			   isprime =false;
			   
		   }
		   }
	   if(isprime) {
		   System.out.println("Number is prime");
	   }
	   else {
		   System.out.println("Number is  not prime");
	   }
        }
  }

