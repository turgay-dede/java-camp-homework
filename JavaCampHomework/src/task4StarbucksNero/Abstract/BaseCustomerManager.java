package task4StarbucksNero.Abstract;

import task4StarbucksNero.Entities.Customer;

public abstract class BaseCustomerManager implements CustomerService {

	@Override
	public void Save(Customer customer) {
		System.out.println("Saved to db : "+ customer.getFirstName());
		
	}

}
