package com.bcm.mapper;

import com.bcm.paramters.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.Map;

public interface UserMapper {
    /**
     * @description: 根据用户名查询用户
     * @author: Maoping
     * @date: 2022/7/28 10:37
     * @param: [name]
     * @return: com.bcm.paramters.User
     **/
    User getUserByUserName(String name);

    /**
     * @description: 验证登录
     * @author: Maoping
     * @date: 2022/7/28 11:27
     * @param: [name, password]
     * @return: com.bcm.paramters.User
     **/
    User CheckLogin(String name,String password);

    User CheckLoginByMap(Map<String,Object> map);

    int InsertUser(User user);

    User CheckLoginParam(@Param("name") String username,@Param("password") String password);

    int updateUser(Map<String,Object> map);

}
