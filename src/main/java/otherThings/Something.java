package otherThings;

import java.util.ArrayList;
import java.util.List;

public class Something {
    public static void main(String[] args) {

        List<String> stringList = new ArrayList<>();
        stringList.add("viktor viktoria");
        stringList.add("alex alexandra");
        stringList.add("mario maria");

        stringList.stream()
                .map(symbol -> symbol.replaceAll("\\s+",""))
                .forEach(System.out::println);
    }
}
