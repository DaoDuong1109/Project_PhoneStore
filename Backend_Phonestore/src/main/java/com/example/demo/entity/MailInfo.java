package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.File;
import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MailInfo {
    private String from = "daoxuanduong1109@gmail.com", to, cc[], bcc[], subject, body;
    private List<File> attachments;

    public MailInfo(String to, String subject, String body) {
        this.to = to;
        this.subject = subject;
        this.body = body;
    }
}
