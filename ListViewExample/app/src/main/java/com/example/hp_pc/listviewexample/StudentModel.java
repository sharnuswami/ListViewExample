package com.example.hp_pc.listviewexample;

/**
 * Created by hp-pc on 10-07-2017.
 */

public class StudentModel {

    int id;
    String Name;
    String Address;
    String Age;

    public StudentModel(int id, String name, String address, String age) {
        this.id = id;
        Name = name;
        Address = address;
        Age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getAge() {
        return Age;
    }

    public void setAge(String age) {
        Age = age;
    }


    @Override
    public String toString() {
        return "StudentModel{" +
                "id=" + id +
                ", Name='" + Name + '\'' +
                ", Address='" + Address + '\'' +
                ", Age='" + Age + '\'' +
                '}';
    }

}
