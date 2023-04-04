package com.carrental.projfinal.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Car")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "car_name")
    private String CarName;
    @Column(name = "car_model")
    private String CarModel;
    @Column(name = "milage")
    private int Milage;
    @Column(name = "passagers")
    private int Passagers;
    private int Rent;
    private String Detail;

    public void Car(){}

    public Car(String carName, String carModel, int milage, int passagers, int rent, String detail) {
        CarName = carName;
        CarModel = carModel;
        Milage = milage;
        Passagers = passagers;
        Rent = rent;
        Detail = detail;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCarName() {
        return CarName;
    }

    public void setCarName(String carName) {
        CarName = carName;
    }

    public String getCarModel() {
        return CarModel;
    }

    public void setCarModel(String carModel) {
        CarModel = carModel;
    }

    public int getMilage() {
        return Milage;
    }

    public void setMilage(int milage) {
        Milage = milage;
    }

    public int getPassagers() {
        return Passagers;
    }

    public void setPassagers(int passagers) {
        Passagers = passagers;
    }

    public int getRent() {
        return Rent;
    }

    public void setRent(int rent) {
        Rent = rent;
    }

    public String getDetail() {
        return Detail;
    }

    public void setDetail(String detail) {
        Detail = detail;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", CarName='" + CarName + '\'' +
                ", CarModel='" + CarModel + '\'' +
                ", Milage=" + Milage +
                ", Passagers=" + Passagers +
                ", Rent=" + Rent +
                ", Detail='" + Detail + '\'' +
                '}';
    }
}
