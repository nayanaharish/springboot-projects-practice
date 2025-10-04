package org.example.springbootpractice.With_DI_AnnotationBased;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("debitCardPayment")
@Primary
public class DebitCardPayment  implements Payment{

    @Override
    public void pay() {
        System.out.println("Debit Card Payment Method");
    }
}
