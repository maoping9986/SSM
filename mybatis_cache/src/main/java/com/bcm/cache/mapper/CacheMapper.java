package com.bcm.cache.mapper;

import com.bcm.cache.entity.Emp;
import org.apache.ibatis.annotations.Param;

public interface CacheMapper {

    /*
     * @description: 通过员工Id查询员工信息
     * @author: Maoping
     * @date: 2022/8/1 15:39
     * @param: [empId]
     * @return: com.bcm.cache.entity.Emp
     **/
    Emp getEmpById(@Param("empId") Integer empId);
}
