package com.bcm.mapper;

import com.bcm.entity.Emp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DynamicSQL {

    /*
     * @description: 根据员工条件查询员工信息
     * @author: Maoping
     * @date: 2022/8/1 11:29
     * @param: [emp]
     * @return: java.util.List<com.bcm.entity.Emp>
     **/
    List<Emp> getEmpByCondition(Emp emp);
    /*
     * @description: 批量添加员工信息
     * @author: Maoping
     * @date: 2022/8/1 14:47
     * @param: [emps]
     * @return: void
     **/
    void insertManyEmps(@Param("emps") List<Emp> emps);
    /*
     * @description: 批量删除
     * @author: Maoping
     * @date: 2022/8/1 15:08
     * @param: [empids]
     * @return: void
     **/
    void deleteManyEmps(@Param("empIds") Integer[] empids);
}
