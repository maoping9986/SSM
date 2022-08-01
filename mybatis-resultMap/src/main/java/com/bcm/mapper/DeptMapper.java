package com.bcm.mapper;

import com.bcm.entity.Dept;
import org.apache.ibatis.annotations.Param;

public interface DeptMapper {

    Dept getEmpAndDept(@Param("deptId") Integer deptId);
    /*
     * @description: 查询部门以及部门的员工
     * @author: Maoping
     * @date: 2022/8/1 9:39
     * @param: [deptId]
     * @return: com.bcm.entity.Dept
     **/
    Dept getDeptAndEmps(@Param("deptId") Integer deptId);

    /*
     * @description:  使用分步查询部门以及部门员工
     * @author: Maoping
     * @date: 2022/8/1 10:00
     * @param: []
     * @return: com.bcm.entity.Dept
     **/
    Dept getDeptAndEmpsStepOne(@Param("deptId") Integer deptId);

}
