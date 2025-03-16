package com.springboottoturial.store.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service("stripe")
@Primary
public class StripePaymentService implements PaymentService {

    @Value("${stripe.apiUrl}")
    private String apiUrl;

    @Override
    public void processPayment(double amount) {
        // apiUrl
        // apiKey
        System.out.println("STRIPE");
        System.out.println("Amount: " + amount);
    }
}
