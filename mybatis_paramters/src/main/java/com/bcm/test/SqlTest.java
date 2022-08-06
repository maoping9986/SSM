package com.bcm.test;

import com.bcm.mapper.SpecialSQLMapper;
import com.bcm.mapper.UserMapper;
import com.bcm.paramters.User;
import com.bcm.utlis.SqlSessionUtil;
import com.sun.media.sound.RIFFInvalidDataException;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: Maoping
 * @CreateTime: 2022-07-29  10:48
 * @Description:
 * @Version: 1.0
 */
public class SqlTest {

    @Test
    public void  testSql(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SpecialSQLMapper mapper = sqlSession.getMapper(SpecialSQLMapper.class);
        List<User> list = mapper.getAllUserByMuhu("a");
        list.forEach(System.out::println);
    }

    @Test
    public void  testSqlDelete(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SpecialSQLMapper mapper = sqlSession.getMapper(SpecialSQLMapper.class);
        mapper.deleteMoreUser("10");
    }
    @Test
    public void  testGetUserId(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SpecialSQLMapper mapper = sqlSession.getMapper(SpecialSQLMapper.class);
        User user = new User(null,"maoping","123456",22,'男'," ");
        mapper.insertUserGetId(user);
        System.out.println(user.getId());
    }

    @Test
    public void updateUser(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        Map<String, Object> userMap = new HashMap<String,Object>();

        userMap.put("username","Tony");
        userMap.put("id",3);

        int i = mapper.updateUser(userMap);
        if (i > 0) {
            System.out.println("修改成功");
        }

        sqlSession.close();
    }

}

