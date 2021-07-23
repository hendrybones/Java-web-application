package com.pluralsight.calcengine;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class Student {
    String regNo;
    Gender gender;
    Date dateOfBirth;
    String course;
    Date dateOfAdmission;

    public Student(String regNo, Gender gender, Date dateOfBirth, String course, Date dateOfAdmission) {
        this.regNo = regNo;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.course = course;
        this.dateOfAdmission = dateOfAdmission;
    }

    public String getRegNo() {
        return regNo;
    }

    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public Date getDateOfAdmission() {
        return dateOfAdmission;
    }

    public void setDateOfAdmission(Date dateOfAdmission) {
        this.dateOfAdmission = dateOfAdmission;
    }

    @Override
    public String toString() {
        return "Student{" +
                "regNo='" + regNo + '\'' +
                ", gender=" + gender +
                ", dateOfBirth=" +new SimpleDateFormat("dd-MM-yyyy").format(dateOfBirth) +
                ", course='" + course + '\'' +
                ", dateOfAdmission=" + new SimpleDateFormat("dd-MM-yyyy").format(dateOfAdmission)+
                '}';
    }

}
