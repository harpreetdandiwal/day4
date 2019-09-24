package com.lambton;
import java.time.LocalDate;
public class fulltimefaculty extends faculty
{
  private float bonus;



    public fulltimefaculty(int id, String firstname, String lastname, LocalDate birthdate, String gender, String designatiom, float salary, String specialization) {
        super(id, firstname, lastname, birthdate, gender, designatiom, salary, specialization);
        this.bonus = bonus;
    }


}
