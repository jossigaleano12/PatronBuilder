package com.example.email;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Builder {
    public String from;
    public Set<String> to;
    public String subject;
    public String body;
    public List<String> attachments;

    public Builder() {
        this.to = new HashSet<>();
        this.attachments = new ArrayList<>();
    }

    public Builder setFrom(String from) {
        this.from = from;
        return this;
    }

    public Builder addTo(String to) {
        this.to.add(to);
        return this;
    }

    public Builder setSubject(String subject) {
        this.subject = subject;
        return this;
    }

    public Builder setBody(String body) {
        this.body = body;
        return this;
    }

    public Builder addAttachment(String attachment) {
        this.attachments.add(attachment);
        return this;
    }

        public Email build() {
        if (from == null || to.isEmpty() || subject == null || body == null) {
            throw new IllegalStateException("El correo electrónico debe tener un remitente, ademas un asunto y un cuerpo.");
        }
        return new Email(this);
    }


}
