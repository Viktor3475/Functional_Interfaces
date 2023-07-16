package finalsection;


import java.util.function.BiFunction;

public class Lambdas {

    static BiFunction<String, Integer, String> upperCaseName = (name, age) ->
    {
        if(name.isBlank()) throw new IllegalArgumentException("Name cannot be blank");
        System.out.println(age);
        return name.toUpperCase();
    };
    public static void main(String[] args) {
        System.out.println(upperCaseName.apply("name", 24));
    }
}
