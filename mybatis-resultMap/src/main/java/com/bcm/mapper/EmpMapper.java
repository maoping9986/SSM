package com.bcm.mapper;

import com.bcm.entity.Emp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EmpMapper {

    /*
     * @description: 获取员工信息
     * @author: Maoping
     * @date: 2022/7/30 16:03
     * @param: [empid]
     * @return: com.bcm.entity.Emp
     **/
    Emp getEmpById(@Param("empid") Integer emPid);
    /*
     * @description: 获取员工和部门信息
     * @author: Maoping
     * @date: 2022/7/30 16:04
     * @param: [emPid]
     * @return: com.bcm.entity.Emp
     **/
    Emp getEmpDeptById(@Param("emPid") Integer emPid);


    Emp getEmpAndDept(@Param("empId") Integer empId);

    List<Emp> getAllEmps(@Param("deptId") Integer deptId);
}
