package task4StarbucksNero.Entities;

import task4StarbucksNero.Abstract.Entity;

public class Customer implements Entity {
	private int id;
	private String firstName;
	private String lastName;
	private String dateOfBirth;
	private String nationaltyId;
	
	public Customer(int id, String firstName, String lastName, String dateOfBirth, String nationaltyId) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.nationaltyId = nationaltyId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getNationaltyId() {
		return nationaltyId;
	}

	public void setNationaltyId(String nationalityId) {
		this.nationaltyId = nationalityId;
	}

}
