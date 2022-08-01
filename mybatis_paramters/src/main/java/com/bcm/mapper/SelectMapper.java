package com.bcm.mapper;

import com.bcm.paramters.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

//当查询的数据为多条时，不能使用实体类作为返回值，否则会抛出异常
// TooManyResultsException；但是若查询的数据只有一条，可以使用实体类或集合作为返回值
public interface SelectMapper {


    User getUseById(@Param("id") Integer id);

    List<User> getAllUser();

    Map<String,Object>getUserByIdToMap(@Param("id") Integer id);

    List<Map<String ,Object>>getAllUserToMap();
}
