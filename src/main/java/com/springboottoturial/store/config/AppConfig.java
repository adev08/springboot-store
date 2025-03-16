package com.springboottoturial.store.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;

import com.springboottoturial.store.services.OrderService;
import com.springboottoturial.store.services.PayPalPaymentService;
import com.springboottoturial.store.services.PaymentService;
import com.springboottoturial.store.services.StripePaymentService;

public class AppConfig {

    @Value("${payment-gateway:stripe}")
    private String paymentGateway;

    public PaymentService stripe() {
        return new StripePaymentService();
    }

    @Bean
    public PaymentService paypal() {
        return new PayPalPaymentService();
    }

    @Bean
    public OrderService orderService() {
        return paymentGateway.equals("stripe") ? new OrderService(stripe()) : new OrderService(paypal());
    }
}
