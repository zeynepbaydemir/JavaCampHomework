package adapters;

import java.rmi.RemoteException;
import java.util.Locale;

import abstracts.CustomerCheckService;
import entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService {

	public boolean CheckIfRealPerson(Customer customer) throws RemoteException {         KPSPublicSoapProxy kpsPublic = new KPSPublicSoapProxy();         return kpsPublic.TCKimlikNoDogrula(Long.parseLong(customer.getIdentityNumber()), customer.getFirstName().toUpperCase(Locale.ROOT), customer.getLastName().toUpperCase(Locale.ROOT), customer.getDateOfBirth().getYear());     }
}