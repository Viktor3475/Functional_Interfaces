package functionalInterface;

import java.util.List;
import java.util.Set;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class _Supplier {
    public static void main(String[] args) {

        // Getting result from the Supplier and printing it into the console.
        getName.get().forEach(System.out::println);
        evenNum.get().forEach(System.out::println);

    }


    // Returning list with elements: Viktoria, Viktor.
    static Supplier<List<String>> getName = () ->
            Stream.of(
                    "Viktoria",
                    "Viktor",
                    "Alex",
                    "Alexa"
            ).filter(name -> name.startsWith("V")).toList();

    static Supplier<Set<Integer>> evenNum = () ->
            Set.of(1,2,3,4,5,6,7,8,9,10)
                    .stream().filter(num -> num % 2 == 0).collect(Collectors.toSet());



}
