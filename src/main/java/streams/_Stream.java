package streams;

import java.util.List;

public class _Stream {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("Viktor", Gender.MALE),
                new Person("Viktoria", Gender.FEMALE),
                new Person("Alex", Gender.MALE),
                new Person("Alexa", Gender.FEMALE),
                new Person("Anna", Gender.FEMALE)
        );

        //Filtering elements of a list that start with the letter 'A'

        people.stream().map(person -> person.name)
                .filter(person -> person.startsWith("A"))
                .forEach(System.out::println);
    }

    record Person(String name, Gender gender){}

    enum Gender{
        MALE, FEMALE
    }
}
