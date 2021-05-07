package abstracts;

import java.rmi.RemoteException;

import entities.Customer;

public abstract class BaseCustomerManager implements CustomerService{

	@Override
	public void save(Customer customer) throws RemoteException {
		System.out.println("Saved to db : " +customer.getFirstName());
		
	}

}
