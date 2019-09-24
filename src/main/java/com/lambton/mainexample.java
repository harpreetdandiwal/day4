package com.lambton;



import java.time.LocalDate;
import java.util.Date;

public class mainexample {
    public static void main (String[]args){
        person p1 ;
        student s1 = new student(1, "harpreet","dandiwal",LocalDate.now(),"male","madt",2);
        s1.display();
        p1 =s1;
        p1.display();

        faculty f1;
        f1 =new faculty(2,"beant","singh",LocalDate.now(),"male","professor", (float) 52000.12,"coading");
        p1=f1;
        p1.display();


        double a=2000.123;
        int x =4354134;
        System.out.println(x);
        int y= 0x213dfdf;
        System.out.println(y);

        double b=1_00_5565;
        System.out.println(b);
        }


    }





