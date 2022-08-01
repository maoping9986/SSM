package com.bcm.test;

import com.bcm.mapper.UserMapper;
import com.bcm.paramters.User;
import com.bcm.utlis.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author: Maoping
 * @CreateTime: 2022-07-28  10:41
 * @Description:
 * @Version: 1.0
 */
public class ParemtersTest {
    @Test
    public void testGetUserByName(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.getUserByUserName("admin");
        System.out.println(user);

    }
    @Test
    public void testCheckLogin(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.CheckLogin("admin","123456");
        System.out.println(user);

    }

    @Test
    public void testCheckLoginByMap(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        Map<String,Object> map = new HashMap<>();
        map.put("username","admin");
        map.put("password","123456");
        User user = mapper.CheckLoginByMap(map);
        System.out.println(user);

    }

    @Test
    public void insertUser(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = new User(null ,"Tom","123456",22,'男',"12345@qq.com");
        mapper.InsertUser(user);
    }
    @Test
    public void checkLogintParam(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.CheckLoginParam("Tom", "123456");
        System.out.println(user);

    }
}
