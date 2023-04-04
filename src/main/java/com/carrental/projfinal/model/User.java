package com.carrental.projfinal.model;

import jakarta.persistence.*;

@Entity

public class User{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    private String name;
    private String Address;
    private int contact;
    private String email;
    private int age;
    private String Gender;
    @Column(name = "user_details")
    private String UserDetails;
    public User(){}

    public User(String name, String address, int contact, String email, int age, String gender, String userDetails) {
        this.name = name;
        Address = address;
        this.contact = contact;
        this.email = email;
        this.age = age;
        Gender = gender;
        UserDetails = userDetails;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return Address;
    }

    public int getContact() {
        return contact;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return Gender;
    }

    public String getUserDetails() {
        return UserDetails;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public void setContact(int contact) {
        this.contact = contact;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public void setUserDetails(String userDetails) {
        UserDetails = userDetails;
    }
    public String ViewCar(){
        return "Viewing Car";
    }
    public Boolean BookACar(){
        return true;
    }
    public Boolean ViewTripHistory(){
        return true;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", Address='" + Address + '\'' +
                ", contact=" + contact +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", Gender='" + Gender + '\'' +
                ", UserDetails='" + UserDetails + '\'' +
                '}';
    }
}
