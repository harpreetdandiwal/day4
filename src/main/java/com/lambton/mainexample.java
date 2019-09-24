package com.lambton;



import java.time.LocalDate;
import java.util.Date;

public class mainexample {
    public static void main (String[]args){
        person p1 ;
        student s1 = new student(1, "harpreet","dandiwal",LocalDate.now(),"male","madt",2);
        s1.display();
    }
}
