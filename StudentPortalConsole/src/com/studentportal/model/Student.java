package com.studentportal.model;

public class Student {

    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String department;
    private String dob;
    private String gender;

    public Student(int id, String firstName, String lastName,
                   String email, String phone,
                   String department, String dob, String gender) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.department = department;
        this.dob = dob;
        this.gender = gender;
    }

    public void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phone);
        System.out.println("Department: " + department);
        System.out.println("DOB: " + dob);
        System.out.println("Gender: " + gender);
    }
}
