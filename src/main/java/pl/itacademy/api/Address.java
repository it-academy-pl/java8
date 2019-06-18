package pl.itacademy.api;

public class Address {
    private String City;

    public Address(String city) {
        City = city;
    }

    public String getCity() {
        return City;
    }

    @Override
    public String toString() {
        return "Address{" +
                "City='" + City + '\'' +
                '}';
    }
}
