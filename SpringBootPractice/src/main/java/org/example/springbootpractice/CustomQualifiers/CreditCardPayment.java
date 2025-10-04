package org.example.springbootpractice.CustomQualifiers;

import org.springframework.stereotype.Component;

@Component
//step2:Annotate Payment Implementations
@CreditCard
public class CreditCardPayment implements Payment {

    @Override
    public void pay() {
        System.out.println("Payment credit card");
    }
}
