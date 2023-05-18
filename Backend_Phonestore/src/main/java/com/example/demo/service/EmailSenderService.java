package com.example.demo.service;

import com.example.demo.entity.MailInfo;
import jakarta.mail.MessagingException;

public interface EmailSenderService {
    public void send (MailInfo mail) throws MessagingException;
    public void send (String to, String subject, String body) throws MessagingException;
    void queue(MailInfo mail)throws MessagingException ;

    void queue(String to, String subject, String body)throws MessagingException ;
}
