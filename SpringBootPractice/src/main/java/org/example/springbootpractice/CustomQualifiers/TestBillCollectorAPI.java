package org.example.springbootpractice.CustomQualifiers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class TestBillCollectorAPI {
    public static void main(String[] args) {
        // Manual wiring (without Spring)
        //Payment payment = new DebitCardPayment();  // you decide which impl
        //BillCollector bc = new BillCollector(payment);

       // bc.collectBill();



        //using spring boot

        ApplicationContext ctx = SpringApplication.run(TestBillCollectorAPI.class, args);
        BillCollector billCollector = (BillCollector) ctx.getBean(BillCollector.class);
        //BillCollector billCollector = (BillCollector) ctx.getBean("billCollector");
        billCollector.collectBill();


    }
}
