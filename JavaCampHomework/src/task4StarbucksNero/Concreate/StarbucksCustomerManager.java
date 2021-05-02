package task4StarbucksNero.Concreate;

import task4StarbucksNero.Abstract.BaseCustomerManager;
import task4StarbucksNero.Abstract.CustomerCheckService;
import task4StarbucksNero.Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {
	CustomerCheckService customerCheckService;

	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	}

	@Override
	public void Save(Customer customer) {
		if (customerCheckService.CheckIfRealPerson(customer)) {
			super.Save(customer);

		} else {
			System.out.println("Not a valid person");
		}
	}


	

}
