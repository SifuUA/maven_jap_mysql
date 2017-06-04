package com.okres.entity;

/**
 * Created by Alex on 04.06.2017.
 */
public class Seller {
    private String fullName;
    private int age;
    private float saalry;

    public Seller(String fullName, int age, float saalry) {
        this.fullName = fullName;
        this.age = age;
        this.saalry = saalry;
    }

    public String getFullName() {
        return fullName;
    }

    public int getAge() {
        return age;
    }

    public float getSaalry() {
        return saalry;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSaalry(float saalry) {
        this.saalry = saalry;
    }

    @Override
    public String toString() {
        return "com.okres.entity.Seller{" +
                "fullName='" + fullName + '\'' +
                ", age=" + age +
                ", saalry=" + saalry +
                '}';
    }
}
