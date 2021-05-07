package customerManagementSystem;

import java.rmi.RemoteException;
import java.time.LocalDate;

import abstracts.BaseCustomerManager;
import adapters.MernisServiceAdapter;
import concrete.NeroCustomerManager;
import concrete.StarbucksCustomerManager;
import entities.Customer;

public class Main {

	public static void main(String[] args) throws RemoteException {
		
		
		BaseCustomerManager neroCustomerManager = new NeroCustomerManager();
		neroCustomerManager.save(new Customer(1,"CÝHAN","ÝÇELLÝLER",LocalDate.of(2001,10,27),"1111111"));
		
		
		
		BaseCustomerManager starbucksCustomerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		starbucksCustomerManager.save(new Customer(2, "Elfin Zeynep", "Baydemir",LocalDate.of(1835,11,22) , "86587655767851")); 
		
		
		
	}

}