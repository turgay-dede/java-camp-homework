package task4StarbucksNero.Concreate;

import task4StarbucksNero.Abstract.CustomerCheckService;
import task4StarbucksNero.Entities.Customer;

public class CustomerCheckManager implements CustomerCheckService {

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		
		return true;
	}

	

	
}
