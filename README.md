# Java 8 features practice task

This is practice task related to lesson about java 8 new features

## Getting Started

From this lesson you will get chance to practice on creating lambdas, using functions, streams and Time API.

### Task

1. Clone repository
2. Create branch in local repository. All the changes should be done in new branch.
3. Create class Person
* String firstName
* String lastName
* LocalDate birthDay
* some_enum sex
* int salary
* Address address
4. Class Address
* String city
5. In Java8Tester class create list of different persons.
6. Using streams and lambda functions (or method references) create new lists with:
* all men under 65 years
* all women with salary less than 5000
* all persons younger than 18 years from Krakow
* all persons who are not from Krakow
* during streaming try to sort lists by firstName, or lastName, or birthDay
* try to sort in reverse order
* _hint: use stream, filter, predicate, sort, collect, collector_
7. Using streams and lambda functions find:
* average salary
* number of women in Krakow
* number of men after 65 years
* oldest person
* youngest person from Krakow
* total salary
* _hint: use map, count, max, min, reduce_
8. Using streams on new lists from p.6. check:
* does any person has first letter 'A' in firstName
* does all persons contains letter 'a' in lastName
* _hint: use anyMatch, allMatch_ 
9. Create method which accept Person and returns Person's userName
* user name is: first character from firstName + lastName + birthYear
* using Optional check if birthDate is null use today's date
10. In main method create list of userNames for all persons from Krakow.