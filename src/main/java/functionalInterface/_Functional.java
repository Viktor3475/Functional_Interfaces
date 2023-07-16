package functionalInterface;

import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

import static functionalInterface._Functional.Gender.*;

public class _Functional {

    static BiFunction<Integer, Integer, Integer> funcInc = (number, number1) -> (number + 1) * number1;
    static Function<Integer, Integer> funcMul = number -> number * 10;

    public static void main(String[] args) {


        // BiFunction
        BiFunction<Integer, Integer, Integer> chain = funcInc.andThen(funcMul);
        System.out.println(chain.apply(4,5));



        // Some streams
        List<Person> people = List.of(
                new Person("Viktor", MALE),
                new Person("Viktoria", FEMALE),
                new Person("Alex", MALE),
                new Person("Alexa", FEMALE),
                new Person("Anna", FEMALE)
        );

        List<Person> females = people.stream()
                .filter(person -> FEMALE.equals(person.gender))
                .toList();

        females.forEach(System.out::println);

        System.out.println();

        List<Person> peopleWithA = people.stream()
                .filter(person -> person.name.startsWith("Al") && FEMALE.equals(person.gender))
                .toList();

        peopleWithA.forEach(System.out::println);
    }

    record Person(String name, Gender gender){}

    enum Gender{
        MALE, FEMALE
    }
}
