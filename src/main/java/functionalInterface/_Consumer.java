package functionalInterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {
    public static void main(String[] args) {



        Customer customerV = new Customer("Viktoria", "9099");
        Customer customerV2 = new Customer("Anna", "9099");

        customerConsumer.accept(customerV);
        customerBiConsumer.accept(customerV2, false);

    }

    // Consumer
    static Consumer<Customer> customerConsumer = customer ->
            System.out.println("Hello, " + customer.customerName + " with num " + customer.customerPhoneNumber);

    // BiConsumer
    static BiConsumer<Customer, Boolean> customerBiConsumer = (customer, show) ->
            System.out.println("Hello, " + customer.customerName + " with num " + (show ? customer.customerPhoneNumber: "**********"));

    record Customer(String customerName, String customerPhoneNumber){}
}
