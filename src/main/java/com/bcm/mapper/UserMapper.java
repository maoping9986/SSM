package com.bcm.mapper;

import com.bcm.mybatis.User;

public interface UserMapper {
    /**
     * @description: 添加用户信息
     * @author: Maoping
     * @date: 2022/7/27 14:37
     * @param: []
     * @return: int
     **/
    int insertUser();

    /** 更新用户信息
     * @description:
     * @author: Maoping
     * @date: 2022/7/27 14:38
     * @param: []
     * @return: void
     **/
     void updateUser();
     /*
      * @description: 删除用户信息
      * @author: Maoping
      * @date: 2022/7/27 14:48
      * @param: []
      * @return: void
      **/
     void deleteUser();

    /*
     * @description: 根据id查询用户信息
     * @author: Maoping
     * @date: 2022/7/27 14:56
     * @param: [id]
     * @return: com.bcm.mybatis.User
     **/
     User findUserById();
}
