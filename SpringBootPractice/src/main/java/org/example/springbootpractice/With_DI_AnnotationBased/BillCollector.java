package org.example.springbootpractice.With_DI_AnnotationBased;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BillCollector {

    Payment payment;


    @Autowired
//    public BillCollector(@Qualifier("debitCardPayment") Payment payment) {
    public BillCollector(Payment payment) { //removed @Qualifier to test @Primary annotation ,default one
        this.payment = payment;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }


    public void collectBill() {
        payment.pay();
        System.out.println("Bill collected");

    }
}
