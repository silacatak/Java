package javakurs;

public class whileloop {
     public static void main(String[] args) {
    	 //print even numbers on the screen
    	 
    	 int x= -11;
    	 
    	 while(x<10) 
    	 {
    		 System.out.println(x);
    		 x+=2;
    	 }
    	 
    	 int y=29;
    	 do {
    		 System.out.println(y);
    		 y-=4;
    	 }while(y<22);
    	 System.out.println("Do-While finished");
     }
}
