package org.example.springbootpractice.CustomQualifiers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BillCollector {

    Payment payment;


    @Autowired
    //Inject Using Custom Qualifier in BillCollector
    public BillCollector(@DebitCard Payment payment) {
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
