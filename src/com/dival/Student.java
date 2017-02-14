package com.dival;

import java.util.ArrayList;

/**
 * Created by bandi on 1/30/2017.
 */

//random, arraylist, file constructors
    //add sort delete modify

abstract public class Student {
    int myID;
    double myGPA;
    String myFirstName;
    String myLastName;
    int myGrade;
    int myGender;
    double myTotalFees;
    ArrayList<Course> myClasses;


    public Student(){

    }

    public void setID(int ID){
        this.myID = ID;
    }

    public void setFirstName(String FirstName){this.myFirstName = FirstName;}

    public void setLastName(String LastName) {this.myLastName = LastName;}

    public void setFullName(String FirstName, String LastName){this.myFirstName = FirstName; this.myLastName = LastName;}

    public void setGrade(int Grade){this.myGrade = Grade;}

    public void setGender(int gender){this.myGender = gender;}

    abstract public void calculateGPA();

    abstract public void generateClasses();

    abstract public double findFees();


}
