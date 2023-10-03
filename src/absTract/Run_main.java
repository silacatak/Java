package absTract;

public class Run_main {
	public static void main(String[] args) {
	//	baseDatabaseManager manager = new baseDatabaseManager();// abstract ve interface ler new lenemez
		CustomerManager customer = new CustomerManager();
		customer.basedatabasemanager = new SqlServer(); // customer ın basedatabasemanager ı kim olucak o belirlenir
		customer.getCustomers();
	}

}
