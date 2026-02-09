package com.notification.kafka.domain.model;

public class Student {

    private String uuid;
    private String name;
    private String email;
    private String password;
    private String role;

    public Student(String uuid, String name, String email, String password, String role) {
        this.uuid = uuid;
        this.name = name;
        this.email = email;
        this.password = password;
        this.role = role;
    }

    public String getUuid() {
        return uuid;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getRole() {
        return role;
    }

}