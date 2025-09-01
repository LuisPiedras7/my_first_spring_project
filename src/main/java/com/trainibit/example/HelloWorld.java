package com.trainibit.example;

public class HelloWorld {
    private String message;
    private User user; // Nuevo atributo

    public void setMessage(String message) {
        this.message = message;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void printMessage() {
        System.out.println("Message: " + message);
        if (user != null) {
            System.out.println("User: " + user.getName() + " " + user.getLastName()
                    + " | Birthdate: " + user.getBirthDate());
        }
    }
}
