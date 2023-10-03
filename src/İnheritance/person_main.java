package İnheritance;

public class person_main {
     public static void main(String[] args)
     {
    	 customer customer1 = new customer();
    	 customer1.age = 32;
    	 customer1.email = "dneixkaraca";
    	 
    	 employee person1= new employee();
    	 person1.age =19;
    	 person1.firstName ="Nilüfer";
    	 
    	 CustomerManager  customer =new CustomerManager();
    	 customer.Add();
    	 customer.welcome();
    	 employeeManager employe =new employeeManager();
    	 employe.Add();
    	 employe.enİyiCalısan();
     }
}
