package com.example.email;
import java.util.Set;
import java.util.List;

public class Email {
    private String from;
    private Set<String> to;
    private String subject;
    private String body;
    private List<String> attachments;

    public Email(Builder builder) {
        this.from = builder.from;
        this.to = builder.to;
        this.subject = builder.subject;
        this.body = builder.body;
        this.attachments = builder.attachments;
    }

    public String getFrom() {
        return from;
    }

    public Set<String> getTo() {
        return to;
    }

    public String getSubject() {
        return subject;
    }

    public String getBody() {
        return body;
    }

    public List<String> getAttachments() {
        return attachments;
    }

}
