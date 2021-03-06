package concrete;

import java.rmi.RemoteException;

import abstracts.BaseCustomerManager;
import abstracts.CustomerCheckService;
import entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager{
	
	
	private CustomerCheckService customerCheckService;
	
	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
        this.customerCheckService = customerCheckService;
    }
	
	
	  @Override
	    public void save(Customer customer) throws RemoteException {

	        if (customerCheckService.CheckIfRealPerson(customer)) {
	            super.save(customer);
	        } else {
	            System.out.println("Not a valid person");
	        }

	  }
}
