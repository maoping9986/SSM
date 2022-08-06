package com.bcm.spring.entity;

import java.util.List;

/**
 * @Author: Maoping
 * @CreateTime: 2022-08-03  15:35
 * @Description:
 * @Version: 1.0
 */
public class Clazz {

    private Integer cid;

    private String cname;

    private List<Student> stu;

    public Clazz() {
    }

    public Clazz(Integer cid, String cname) {
        this.cid = cid;
        this.cname = cname;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public List<Student> getStu() {
        return stu;
    }

    public void setStu(List<Student> stu) {
        this.stu = stu;
    }

    @Override
    public String toString() {
        return "Class{" +
                "cid=" + cid +
                ", cname='" + cname + '\'' +
                ", stu=" + stu +
                '}';
    }
}
