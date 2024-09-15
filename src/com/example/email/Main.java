package com.example.email;

public class Main {
    public static void main(String[] args) {
        Email email = new Builder()
                .setFrom("Maria@example.com")
                .addTo("Mishell@example.com")
                .setSubject("¡Hola, Mishell!")
                .setBody("Te envio los archivos para el proyecto.")
                .addAttachment("archivo1.txt")
                .addAttachment("archivo2.txt")
                .build();

        System.out.println("De: " + email.getFrom());
        System.out.println("Para: " + email.getTo());
        System.out.println("Asunto: " + email.getSubject());
        System.out.println("Cuerpo: " + email.getBody());
        System.out.println(email.getAttachments());

    }
}