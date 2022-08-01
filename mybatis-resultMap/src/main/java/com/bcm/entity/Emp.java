package com.bcm.entity;

/**
 * @Author: Maoping
 * @CreateTime: 2022-07-30  11:53
 * @Description:
 * @Version: 1.0
 */
public class Emp {


    private Integer emPid;
    private String empName;
    private int age;
    private char gender;
    private Dept dept;

    public Emp() {
    }

    public Emp(Integer empid, String empname, int age, char gender) {
        this.emPid = empid;
        this.empName = empname;
        this.age = age;
        this.gender = gender;
    }

    public Integer getEmPid() {
        return emPid;
    }

    public void setEmPid(Integer emPid) {
        this.emPid = emPid;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "emPid=" + emPid +
                ", empName='" + empName + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", dept=" + dept +
                '}';
    }
}
