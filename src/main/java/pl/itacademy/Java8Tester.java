package pl.itacademy;

import pl.itacademy.api.Address;
import pl.itacademy.api.Person;
import pl.itacademy.api.Sex;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.stream.Stream;

public class Java8Tester {

    public static void main(String[] args) {
        ArrayList<Person> personArrayList = new ArrayList<>();
        personArrayList.add(new Person("Jan", "Kowalski", Sex.Man, LocalDate.of(1955,1,13), 3100, new Address("Krakow")));
        personArrayList.add(new Person("Patrycja", "Sroka", Sex.Woman, LocalDate.of(1980,3,1), 2100, new Address("Bydgoszcz")));
        personArrayList.add(new Person("Kazimierz", "Wielki", Sex.Man, LocalDate.of(1990,5,23), 5000, new Address("Łódź")));
        personArrayList.add(new Person("Piotr", "Zaleski", Sex.Man, LocalDate.of(1974,12,30), 7710, new Address("Rzeszów")));
        personArrayList.add(new Person("Elzbieta", "Konraska", Sex.Woman, LocalDate.of(2001,7,29), 1660, new Address("Katowice")));
        personArrayList.add(new Person("Aleksandra", "Wolant", Sex.Woman, LocalDate.of(1968,3,3), 2700, new Address("Olsztyn")));
        personArrayList.add(new Person("Marek", "Turski", Sex.Man, LocalDate.of(1996,4,23), 3800, new Address("Gdańsk")));
        personArrayList.add(new Person("Łukasz", "Rocki", Sex.Man, LocalDate.of(1977,5,15), 6400, new Address("Lublin")));
        personArrayList.add(new Person("Jakub", "Nowak", Sex.Man, LocalDate.of(1957,12,9), 3200, new Address("Zamość")));
        personArrayList.add(new Person("Juliusz", "Jagiełło", Sex.Man, LocalDate.of(1933,11,10), 5500, new Address("Sandomierz")));

        System.out.println(personArrayList.get(1));
        Stream<Person> personStream = personArrayList.stream();

        //Stream<Person> filteredStream = personStream.
                //filter(p -> p.getBirthDay() > )

    }
}
