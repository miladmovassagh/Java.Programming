package com.usc;

public class Student<Name,StudentId,FatherName> {
    private Name name;
    private StudentId studentId;
    private FatherName fatherName;

    public Student() {

    }

    public Student(Name name, StudentId studentId, FatherName fatherName) {
        setName(name);
        setStudentId(studentId);
        setFatherName(fatherName);
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public StudentId getStudentId() {
        return studentId;
    }

    public void setStudentId(StudentId studentId) {
        this.studentId = studentId;
    }

    public FatherName getFatherName() {
        return fatherName;
    }

    public void setFatherName(FatherName fatherName) {
        this.fatherName = fatherName;
    }

    public void showStudentInformation() {
        System.out.println("student information:");
        System.out.println("name is: " + getName());
        System.out.println("student id is: " + getStudentId());
        System.out.println("father name is: " + getFatherName());
    }
}
