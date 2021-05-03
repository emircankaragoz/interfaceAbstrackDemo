package Adapters;

import java.rmi.RemoteException;

import Abstract.ICustomerCheckManager;
import Entity.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MerninsServiceAdapter implements ICustomerCheckManager{

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		KPSPublicSoap client = new KPSPublicSoapProxy();
		boolean result = false;
		
		try {
			result = client.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()) , customer.getFirstName().toUpperCase(), customer.getLastName().toUpperCase(), customer.getDateofBirth());
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

}
