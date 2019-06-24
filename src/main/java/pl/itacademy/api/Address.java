package pl.itacademy.api;

import java.util.Objects;

public class Address {
    private String City;

    public Address(String city) {
        City = city;
    }

    public String getCity() {
        return City;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return Objects.equals(City, address.City);
    }

    @Override
    public int hashCode() {
        return Objects.hash(City);
    }

    @Override
    public String toString() {
        return "Address{" +
                "City='" + City + '\'' +
                '}';
    }
}
