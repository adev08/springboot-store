package com.springboottoturial.store.services;

import org.springframework.stereotype.Service;

@Service
public class SMSNotificationService implements NotificationService {

    @Override
    public void send(String message, String recipientEmail){
        System.out.println("Sending SMS: " + message);
    }
}