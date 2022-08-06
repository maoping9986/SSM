package com.bcm.spring.entity;

import java.util.Arrays;
import java.util.Map;

/**
 * @Author: Maoping
 * @CreateTime: 2022-08-02  15:31
 * @Description:
 * @Version: 1.0
 */
public class Student {

    private Integer sid;

    private String sname;

    private Integer sage;

    private String gender;

    private Clazz aClass;

    private String[] hobby;

    private Map<String,Teacher> teacherMap;


    public Student() {
    }

    public Student(Integer sid, String sname, Integer sage, String gender) {
        this.sid = sid;
        this.sname = sname;
        this.sage = sage;
        this.gender = gender;
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public Integer getSage() {
        return sage;
    }

    public void setSage(Integer sage) {
        this.sage = sage;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Clazz getaClass() {
        return aClass;
    }

    public void setaClass(Clazz aClass) {
        this.aClass = aClass;
    }

    public String[] getHobby() {
        return hobby;
    }

    public void setHobby(String[] hobby) {
        this.hobby = hobby;
    }

    public Map<String, Teacher> getTeacherMap() {
        return teacherMap;
    }

    public void setTeacherMap(Map<String, Teacher> teacherMap) {
        this.teacherMap = teacherMap;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sid=" + sid +
                ", sname='" + sname + '\'' +
                ", sage=" + sage +
                ", gender='" + gender + '\'' +
                ", aClass=" + aClass +
                ", hobby=" + Arrays.toString(hobby) +
                ", teacherMap=" + teacherMap +
                '}';
    }
}
