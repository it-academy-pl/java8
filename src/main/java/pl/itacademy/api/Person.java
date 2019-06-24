package pl.itacademy.api;

import java.time.LocalDate;
import java.util.Objects;

public class Person {

    public Person(String firstName, String lastName, Sex sex, LocalDate birthDay, int salary, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.sex = sex;
        this.birthDay = birthDay;
        this.salary = salary;
        this.address = address;
    }

    private String firstName;
    private String lastName;
    private LocalDate birthDay;
    private int salary;
    private Address address;
    private Sex sex;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public int getSalary() {
        return salary;
    }

    public Address getAddress() {
        return address;
    }

    public Sex getSex() {
        return sex;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthDay=" + birthDay +
                ", salary=" + salary +
                ", address=" + address +
                ", sex=" + sex +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return salary == person.salary &&
                Objects.equals(firstName, person.firstName) &&
                Objects.equals(lastName, person.lastName) &&
                Objects.equals(birthDay, person.birthDay) &&
                Objects.equals(address, person.address) &&
                sex == person.sex;
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, birthDay, salary, address, sex);
    }
}
