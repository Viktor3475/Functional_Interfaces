package functionalInterface;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class _Predicate {
    public static void main(String[] args) {

        System.out.println(isValidPhoneNumber.and(contains3).test("0894562943"));


        System.out.println(equalsBiPredicate.test("0897365721", "0897365721"));

        int[] arr = {1,2,3,4,5,6,7,8,9,10};

        for (int j : arr) {
            if (even.test(j)) {
                System.out.println(j);
            }

        }

    }

    // using some predicates

    static Predicate<String> isValidPhoneNumber = phoneNumber ->
            phoneNumber.startsWith("089") && phoneNumber.length() == 10;

    static Predicate<String> contains3 = phoneNumber ->
            phoneNumber.contains("3");

    static Predicate<Integer> even = evenNumber ->
            evenNumber % 2 == 0;

    static BiPredicate<String, String> equalsBiPredicate = String::equals;
}
