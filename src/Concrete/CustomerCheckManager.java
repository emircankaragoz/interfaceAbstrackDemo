package Concrete;

import Abstract.ICustomerCheckManager;
import Entity.Customer;



public class CustomerCheckManager implements ICustomerCheckManager {

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		// TODO Auto-generated method stub
		return true;
	}




}
