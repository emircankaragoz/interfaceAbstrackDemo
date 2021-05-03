package interfaceAbstractDemo;

import Abstract.BaseCustomerManager;
import Adapters.MerninsServiceAdapter;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entity.Customer;

public class Main {

	public static void main(String[] args) {
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MerninsServiceAdapter());
		
		Customer customer = new Customer();
		customer.setId(1);
		customer.setFirstName("Emircan");
		customer.setLastName("Karagöz");
		customer.setDateofBirth(2000);
		customer.setNationalityId("");
		
		customerManager.save(customer);
	}

}
