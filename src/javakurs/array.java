package javakurs;

public class array {
    public static void main(String[] args) {
    	String[] öğrenciler=new String[3];
    	öğrenciler[0]="Sıla";
    	öğrenciler[1]="Efsun";
    	öğrenciler[2]="Deniz";
    	
    	for(int i=0;i<öğrenciler.length;i++)
    		System.out.println(öğrenciler[i]);
    
    	
    	
    	System.out.println("----------------------------------");
    	
    	
       for(String ögr:öğrenciler)
    	   System.out.println(ögr);
    }
    
    
}
