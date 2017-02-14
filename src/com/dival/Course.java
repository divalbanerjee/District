package com.dival;

/**
 * Created by bandi on 2/6/2017.
 */
public class Course {
    String myCourseName;
    String myGrade;
    double myFees;

    public Course(String courseName, String grade, double Fees){
        this.myCourseName = courseName;
        this.myGrade = grade;
        this.myFees = Fees;
    }

    public void setCourseName(String courseName){
        this.myCourseName = courseName;
    }

    public void setGrade(String grade) {
        this.myGrade = grade;
    }

    public void setCourseFee(double Fees){
        this.myFees = Fees;
    }

    public String getCourseName(){
        return this.myCourseName;
    }

    public String getGrade(){
        return this.myGrade;
    }

    public void setFees(double Fees){
        this.myFees = Fees;
    }

}
