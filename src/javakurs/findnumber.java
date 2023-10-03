package javakurs;

public class findnumber { 
 public static void main(String[] args) {
	 int[] numerals= new int[] {1,2,3,4,5};
	  
	 int number = 1;
	 boolean bool =false ;
	 
	 for (int num:numerals) {
		 if(num==number) {
			  bool = true;
			  break;
		 } 
	 }
	 
	if(bool) {
		System.out.println("TRUE");
	}
	else {
		System.out.println("FALSE");

	}
 }
 
}
