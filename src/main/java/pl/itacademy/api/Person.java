package pl.itacademy.api;

import java.time.LocalDate;

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
}
