package absTract;

public class CustomerManager {
	
	baseDatabaseManager basedatabasemanager;
	
	public void getCustomers() {
		basedatabasemanager.getData();
	}

}
