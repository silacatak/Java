package javakurs;

public class thelargestnumber {
    public static void main(String[] args) {
    	
    	int num1= 367;
    	int num2=434;
    	int num3=321;
    	int biggernumber=250;
    	if(biggernumber<num3) {
    		biggernumber=num3;
    	}
        	
    	if(biggernumber<num1) {
    		biggernumber=num1;
    	}
    	if(biggernumber<num2) {
    		biggernumber=num2;
    	}
    	System.out.println("Biggest number:" +biggernumber);
    }
}
