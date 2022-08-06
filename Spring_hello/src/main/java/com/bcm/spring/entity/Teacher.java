package com.bcm.spring.entity;

/**
 * @Author: Maoping
 * @CreateTime: 2022-08-05  17:40
 * @Description:
 * @Version: 1.0
 */
public class Teacher {

    private Integer tid;

    private String name;

    public Teacher() {
    }

    public Teacher(Integer tid, String name) {
        this.tid = tid;
        this.name = name;
    }

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "tid=" + tid +
                ", name='" + name + '\'' +
                '}';
    }
}
