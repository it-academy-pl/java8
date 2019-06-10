package pl.itacademy;

import java.time.LocalDate;
import java.util.Optional;

public class Person {
	private String firstName;
	private String lastName;
	private Address address;
	private final LocalDate dayOfBirth;
	private final Sex sex;
	private int salary;

	public Person(String firstName, String lastName, String city, LocalDate dayOfBirth, Sex sex, int salary) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = new Address(city);
		this.dayOfBirth = dayOfBirth;
		this.sex = sex;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return firstName + " " + lastName + " " + address + " " + dayOfBirth + " " + sex + " " + salary;
	}

	public Sex getSex() {
		return sex;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
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

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getCity() {
		return this.address.getCity();
	}
	
	public void setCity(String city) {
		this.address.setCity(city);
	}
	
	public Optional<LocalDate> getDayOfBirth() {
		return Optional.ofNullable(dayOfBirth);
	}

	public Optional<Integer> getAge() {
		return getDayOfBirth().map(date->date.until(LocalDate.now()).getYears());
	}

}
