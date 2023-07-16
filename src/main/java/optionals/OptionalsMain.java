package optionals;

import java.util.Optional;
import java.util.stream.Stream;

public class OptionalsMain {
    public static void main(String[] args) {

        Optional.of("Hello").ifPresent(value -> Stream.of(1,2,3,4,5,6,7,8)
                .filter(values -> values % 2 == 0)
                .forEach(System.out::println));



    }
}
