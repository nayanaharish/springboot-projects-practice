package org.example.springbootpractice.With_DI_AnnotationBased;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("creditCardPayment")

public class CreditCardPayment implements Payment{

    @Override
    public void pay() {
        System.out.println("Payment credit card");
    }
}
