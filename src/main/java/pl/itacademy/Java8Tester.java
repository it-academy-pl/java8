package pl.itacademy;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.*;
import static pl.itacademy.Sex.*;

public class Java8Tester {

	public static void main(String[] args) {

		List<Person> people = Arrays.asList(
				new Person("Jan", "Nowak", "Kraków", LocalDate.of(1990, 01, 01), MALE, 4000),
				new Person("Adam", "Słodowy", "Warszawa", LocalDate.of(1950, 05, 06), MALE, 2000),
				new Person("Anna", "Iksińska", "Kraków", null, FEMALE, 3000),
				new Person("Gertuda", "Nowak", "Łódź", LocalDate.of(1920, 12, 12), FEMALE, 1500),
				new Person("Tomasz", "Bogacki", "Warszawa", LocalDate.of(1975, 10, 10), MALE, 10000));

		// ------------- Men under 65 ----------------//

		List<Person> menUnder65 = people.stream()
				.filter(person -> person.getSex() == MALE)
				.filter(person -> person.getAge().orElse(999) < 65)
				.sorted(Comparator.comparing(Person::getLastName))
				.collect(Collectors.toList());

		System.out.println("Men under 65");
		menUnder65.forEach(System.out::println);

		// ------------- Women with salary under 5000 ----------------//

		List<Person> womenUnder5000 = people.stream()
				.filter(person -> person.getSex() == FEMALE)
				.filter(person -> person.getSalary() < 5000)
				.collect(Collectors.toList());

		System.out.println("\nWomen with salary under 5000");
		womenUnder5000.forEach(System.out::println);

		// ------------- People not from Kraków ----------------//

		List<Person> peopleNotFromKrakow = people.stream()
				.filter(person -> !"Kraków".equals(person.getCity()))
				.collect(Collectors.toList());

		System.out.println("\nPeople not from Kraków");
		peopleNotFromKrakow.forEach(System.out::println);

		// ------------- The youngest person ----------------//

		Person youngest = people.stream()
				.min(Comparator.comparingInt(person -> person.getAge().orElse(999)))
				.get();

		System.out.println("\nYoungest person: " + youngest);

		// ------------- Average salary ----------------//

		double averageSalary = people.stream()
				.mapToDouble(Person::getSalary)
				.average()
				.getAsDouble();

		System.out.printf("\nAverage salary: %.0f", averageSalary);

		// ------------- Total salary ----------------//

		int totalSalary = people.stream()
				.mapToInt(Person::getSalary)
				.sum();

		System.out.println("\nTotal salary: " + totalSalary);

		// ------------- Create user names ----------------//

		List<String> userNames = people.stream()
				.map(person -> createUserName(person))
				.collect(Collectors.toList());

		System.out.println();
		userNames.forEach(System.out::println);

		// ------------- User names grouped by city ----------------//

		Map<String, List<String>> zamieszkanie = people.stream()
				.collect(Collectors.groupingBy(Person::getCity,
						Collectors.mapping(person -> createUserName(person),
								Collectors.toList())));

		System.out.println("\nGrouped by city");
		zamieszkanie.forEach((k, v) -> System.out.println(k + ": " + v));
	}

	/**
	 * <p>
	 * Creates user name for login
	 * <p>
	 * User name consists of
	 * <ul>
	 * <li>the first character of First Name</li>
	 * <li>the whole Surname</li>
	 * <li>the year of birth (yyyy)</li>
	 * </ul>
	 * <p>
	 * Jan Kowalski born in 2005 will get username {@code JKowalski2005}.
	 * <p>
	 * If birth date is not provided then the current year is used.
	 * 
	 * @param person Person for which to create user name
	 * @return username as string
	 */
	public static String createUserName(Person person) {
		return person.getFirstName().substring(0, 1)
				+ removePolish(person.getLastName())
				+ person.getDayOfBirth().orElse(LocalDate.now()).getYear();
	}

	/**
	 * <p>
	 * Removes polish diacritic marks from a string
	 * 
	 * @param text as String
	 * @return text without polish marks
	 */
	public static String removePolish(String text) {

		final String polishText = "ąćęłńóśżźĄĆĘŁŃÓŚŻŹ";
		final String poliszText = "acelnoszzACELNOSZZ";

		char[] textAsChars = text.toCharArray();

		for (int i = 0; i < textAsChars.length; i++) {
			char letter = textAsChars[i];
			if (letter > 127) { // standard ASCII are not checked at all
				for (int pos = 0; pos < polishText.length(); pos++) {
					if (letter == polishText.charAt(pos)) {
						textAsChars[i] = poliszText.charAt(pos);
					}
				}
			}
		}
		return new String(textAsChars);
	}
}
