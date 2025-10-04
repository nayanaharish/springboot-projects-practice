package org.example.springbootpractice.With_DI_AnnotationBased;

import org.springframework.stereotype.Component;

@Component
public class DebitCardPayment  implements Payment{

    @Override
    public void pay() {
        System.out.println("Debit Card Payment Method");
    }
}
