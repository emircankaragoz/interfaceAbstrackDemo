package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.ICustomerCheckManager;
import Entity.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {
	
	ICustomerCheckManager customerCheckManager;
	
	public StarbucksCustomerManager(ICustomerCheckManager customerCheckManager) {
		super();
		this.customerCheckManager = customerCheckManager;
	}

	@Override
	public void save(Customer customer) {
		if(customerCheckManager.CheckIfRealPerson(customer)) {
			super.save(customer);
		}else {
			System.out.println("Not a valid person.");
		}
		
		
	}

	
	
}
