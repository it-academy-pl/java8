package pl.itacademy.api;

public class Address {
    private String City;

    public Address(String city) {
        City = city;
    }

    @Override
    public String toString() {
        return "Address{" +
                "City='" + City + '\'' +
                '}';
    }
}
