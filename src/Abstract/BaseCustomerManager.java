package Abstract;

import Entity.Customer;

public abstract class BaseCustomerManager implements ICustomerManager{

	@Override
	public void save(Customer customer) {
		System.out.println("Save to do: " + customer.getFirstName());
		
	}

}
