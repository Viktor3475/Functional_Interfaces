package combinatorpattern;

import java.time.LocalDate;

import static combinatorpattern.CustomerRegistrationValidator.*;
import static combinatorpattern.CustomerRegistrationValidator.ValidationResult.SUCCESS;

public class MainCustomer {
    public static void main(String[] args) {

        Customer customer = new Customer(
                "Viktoria",
                "viktoria@gmail.com",
                "+0987654321",
                LocalDate.of(2000,1,1)
        );

        ValidationResult result = isEmailValid()
                .and(isPhoneNumberValid())
                .and(isAnAdult())
                .apply(customer);

        System.out.println(result);

        if(result != SUCCESS){
            throw new IllegalStateException(result.name());
        }

    }
}
