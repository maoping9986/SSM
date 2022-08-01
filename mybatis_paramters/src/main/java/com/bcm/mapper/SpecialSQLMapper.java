package com.bcm.mapper;

import com.bcm.paramters.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SpecialSQLMapper {

    List<User> getAllUserByMuhu(@Param("str") String str);

    void deleteMoreUser(@Param("str") String str);

    void  insertUserGetId(User user);
}
