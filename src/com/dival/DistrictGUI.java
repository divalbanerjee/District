package com.dival;

import javax.swing.*;
import java.awt.*;

/**
 * Created by bandi on 1/30/2017.
 */
//B: Total fees outputed for 1000 students, including total fees per each student to prove the use of abstract methods and array lists
    //add james smith, delete student with the 15th id num
//abstract find average, generate district, total fees for each student, total fees for each student and the all highschool students, middle school, and elementry and total fees for each s
public class DistrictGUI extends JFrame {

    public JButton btnAddStudent = new JButton("Add");
    public JButton btnRemoveStudent =  new JButton("Remove");
    public JButton btnSetStudent = new JButton("Set");
    public JButton btnGenerateDistrict = new JButton("New District");
    public JButton btnSearchStudent = new JButton("Search");
    public JLabel lblTitle = new JLabel("District");
    //public JButton btnExport = new JButton("Export Student");

    public JMenuItem mnuDistrict = new JMenuItem("District");
    public JMenuItem mnuGenerate = new JMenuItem("mnuGenerate");
    public JMenuItem mnuStudent = new JMenuItem("Student");
    public JMenuItem mnuAdd = new JMenuItem("Add Student");
    public JMenuItem mnuEdit = new JMenuItem("Edit");
    public JMenuItem mnurEditGrades = new JMenuItem("edit Grades");
    public JMenuItem mnuEditBell1 = new JMenuItem("Bell 1");
    public JMenuItem mnuEditBell2 = new JMenuItem("Bell 2");
    public JMenuItem mnuEditBell3 = new JMenuItem("Bell 3");
    public JMenuItem mnuEditBell4 = new JMenuItem("Bel 4");
    public JMenuItem mnuEditBell5 = new JMenuItem("Bell 5");
    public JMenuItem mnuEditBell6 = new JMenuItem("Bell 6");
    public JMenuItem mnuEditBell7 = new JMenuItem("Bell 7");


    public DistrictGUI(){
        Container  windowContainer = this.getContentPane();


    }


}
