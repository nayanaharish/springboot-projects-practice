package org.example.springbootpractice.CustomQualifiers;

import org.springframework.stereotype.Component;

@Component
//Step2 :Annotate Payment Implementations
@DebitCard
public class DebitCardPayment  implements Payment {

    @Override
    public void pay() {
        System.out.println("Debit Card Payment Method");
    }
}
