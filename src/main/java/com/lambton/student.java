package com.lambton;

import java.time.LocalDate;

public class student extends person
{
    private String coursename;
    private int currentsemester;

    public student(int id) {
        super(id);
    }

    public student(int id, String firstname, String lastname, LocalDate birthdate, String gender, String coursename, int currentsemester) {
        super(id, firstname, lastname, birthdate, gender);
        this.coursename = coursename;
        this.currentsemester = currentsemester;
    }

    public String getCoursename() {
        return coursename;
    }

    public void setCoursename(String coursename) {
        this.coursename = coursename;
    }

    public int getCurrentsemester() {
        return currentsemester;
    }

    public void setCurrentsemester(int currentsemester) {
        this.currentsemester = currentsemester;
    }
    @Override
    public void display() {
        System.out.println("student id is " + getId());
        System.out.println("student firstname is " + getFirstname());
        System.out.println("student lastname is " + getLastname());
        System.out.println("gender " + getGender());
        System.out.println("student course" + this.getCoursename());
        System.out.println("student semester is " + this.getCurrentsemester());

    }

    }

