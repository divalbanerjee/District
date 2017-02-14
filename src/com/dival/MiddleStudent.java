package com.dival;

import java.util.ArrayList;

/**
 * Created by bandi on 1/30/2017.
 */
public class MiddleStudent extends Student {




    public void generateClasses(){
        ArrayList<Course> AvailableCourses = new ArrayList<Course>();
        AvailableCourses.add(new Course)
    }

    public double findFees(){
        double TotalFees = 0;
        for(int i = 0 ; i < this.myClasses.size(); i++){
            TotalFees += this.myClasses.get(i).myFees;
        }
        return TotalFees;
    }

    public void calculateGPA(){

        double GPA = 0;
        int TotalGPAPoints = 0;

        for(int i = 0;i< this.myClasses.size();i++){
            if(this.myClasses.get(i).myGrade == "A"){
                TotalGPAPoints += 4;
            }
            else if (this.myClasses.get(i).myGrade == "B"){
                TotalGPAPoints += 3;
            }
            else if (this.myClasses.get(i).myGrade == "C"){
                TotalGPAPoints += 2;
            }
            else if (this.myClasses.get(i).myGrade == "D"){
                TotalGPAPoints += 1;
            }
        }
        GPA = (TotalGPAPoints/this.myClasses.size());
        this.myGPA = GPA;
    }
}
