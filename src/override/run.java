package override;

public class run {
	 public static void main(String[] args) {
	
     basemanager[] bases = new basemanager[]{new agriculture_credit(), new teacher_credit()};
     
     
     for(basemanager base : bases) 
     {
    	 System.out.println(base.calculate(10.3));
  
     } 
}
}