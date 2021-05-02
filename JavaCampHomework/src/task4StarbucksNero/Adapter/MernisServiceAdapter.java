package task4StarbucksNero.Adapter;

import task4StarbucksNero.Abstract.CustomerCheckService;
import task4StarbucksNero.Entities.Customer;

public class MernisServiceAdapter implements CustomerCheckService {

	@Override
	public boolean CheckIfRealPerson(Customer customer) {

		if (customer.getFirstName().length() > 3 && customer.getLastName().length() > 2
				&& customer.getNationaltyId().length() == 11 && !customer.getNationaltyId().startsWith("0")
				&& customer.getDateOfBirth() != null) {
			return true;
		} else {
			return false;
		}

	}

}
