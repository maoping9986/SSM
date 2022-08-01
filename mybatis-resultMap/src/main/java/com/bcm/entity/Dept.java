package com.bcm.entity;

import java.util.List;

/**
 * @Author: Maoping
 * @CreateTime: 2022-07-30  11:55
 * @Description:
 * @Version: 1.0
 */
public class Dept {

    private Integer deptId;
    private String deptName;
    private List<Emp> emps;


    public Dept() {
    }

    public Dept(Integer deptid, String deptname) {
        this.deptId = deptid;
        this.deptName = deptname;
    }

    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public List<Emp> getEmps() {
        return emps;
    }

    public void setEmps(List<Emp> emps) {
        this.emps = emps;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "deptId=" + deptId +
                ", deptName='" + deptName + '\'' +
                ", emps=" + emps +
                '}';
    }
}
