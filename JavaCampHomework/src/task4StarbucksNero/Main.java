package task4StarbucksNero;

import task4StarbucksNero.Abstract.BaseCustomerManager;
import task4StarbucksNero.Adapter.MernisServiceAdapter;
import task4StarbucksNero.Concreate.NeroCustomerManager;
import task4StarbucksNero.Concreate.StarbucksCustomerManager;
import task4StarbucksNero.Entities.Customer;

public class Main {

	public static void main(String[] args) {
		Customer customer = new Customer(1, "Turgay", "Dede", "1996", "12345678901");
		
		BaseCustomerManager baseCustomerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		//BaseCustomerManager baseCustomerManager = new NeroCustomerManager();
		baseCustomerManager.Save(customer);

	}

}
