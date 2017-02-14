package com.dival;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by bandi on 1/30/2017.
 */
public class ElementryStudent extends Student {

    public double findFees(){
        double TotalFees = 0;
        return TotalFees;
    }

    public void calculateGPA(){
        this.myGPA = -1;
    }

    public void generateClasses(){
        ArrayList<Course> Courses = new ArrayList<Course>();
        Courses.add(new Course("Math", "P", 15));
        Courses.add(new Course("English", "P", 15));
        Courses.add(new Course("Science" , "P", 15));
        Courses.add(new Course("Intevention", "P",15));
        Courses.add(new Course("Social Studies", "P", 15));
        Collections.shuffle(Courses);
         myClasses = Courses;
    }
}
