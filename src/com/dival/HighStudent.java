package com.dival;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by bandi on 1/30/2017.
 */
public class HighStudent extends Student {

    public double findFees(){
        double TotalFees = 0;
        for(int i = 0; i < this.myClasses.size(); i++){
            TotalFees += this.myClasses.get(i).myFees;
        }
        this.myTotalFees = TotalFees;
        return TotalFees;
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

    public double calculateGPA() {
        double GPA = 0;
        int TotalGPAPoints = 0;

        for (int i = 0; i < this.myClasses.size(); i++) {
            if (this.myClasses.get(i).myGrade == "A") {
                TotalGPAPoints += 4;
            } else if (this.myClasses.get(i).myGrade == "B") {
                TotalGPAPoints += 3;
            } else if (this.myClasses.get(i).myGrade == "C") {
                TotalGPAPoints += 2;
            } else if (this.myClasses.get(i).myGrade == "D") {
                TotalGPAPoints += 1;
            }
        }
        GPA = (TotalGPAPoints / this.myClasses.size());
        this.myGPA = GPA;
    }
}
