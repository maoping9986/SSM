package com.bcm.entity;

/**
 * @Author: Maoping
 * @CreateTime: 2022-08-01  11:24
 * @Description:
 * @Version: 1.0
 */
public class Emp {

    private Integer empId;

    private String empName;

    private int age;

    private char gender;

    public Emp() {

    }

    public Emp(Integer empId, String empName, int age, char gender) {
        this.empId = empId;
        this.empName = empName;
        this.age = age;
        this.gender = gender;
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
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

    @Override
    public String toString() {
        return "Emp{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
