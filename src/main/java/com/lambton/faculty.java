package com.lambton;

import java.time.LocalDate;

public class faculty extends person {
    private String designatiom;
    private float salary;
    private String specialization;

    public faculty(int id, String firstname, String lastname, LocalDate birthdate, String gender, String designatiom, float salary, String specialization) {
        super(id, firstname, lastname, birthdate, gender);
        this.designatiom = designatiom;
        this.salary = salary;
        this.specialization = specialization;
    }

    public faculty(int id, String designatiom, float salary, String specialization) {
        super(id);
        this.designatiom = designatiom;
        this.salary = salary;
        this.specialization = specialization;
    }

    public String getDesignatiom() {
        return designatiom;
    }

    public void setDesignatiom(String designatiom) {
        this.designatiom = designatiom;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    @Override
    public void display() {
        System.out.println("faculty id " + getId());
        System.out.println("faculty designation is  " + getDesignatiom());
        System.out.println("faculty specialization is " + getSpecialization());
        System.out.println("faculty id " + getSalary());

    }
}
