package com.bcm.test;

import com.bcm.mapper.SpecialSQLMapper;
import com.bcm.paramters.User;
import com.bcm.utlis.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

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
        User user = new User(null,"maoping","123456",22,'男',"123@qq.com");
        mapper.insertUserGetId(user);
        System.out.println(user.getId());
    }

}

