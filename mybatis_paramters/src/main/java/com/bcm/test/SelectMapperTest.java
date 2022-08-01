package com.bcm.test;

import com.bcm.mapper.SelectMapper;
import com.bcm.paramters.User;
import com.bcm.utlis.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;
import java.util.Map;

/**
 * @Author: Maoping
 * @CreateTime: 2022-07-28  15:10
 * @Description:
 * @Version: 1.0
 */
public class SelectMapperTest {
    @Test
    public void testSelect() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
        User user = mapper.getUseById(3);
        System.out.println(user);
        sqlSession.close();
    }

    @Test
    public void testSelectByList() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
        List<User> list = mapper.getAllUser();
        list.forEach(System.out::println);
        sqlSession.close();

    }

    @Test
    public void testSelectByIdToMap() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
        Map<String, Object> map = mapper.getUserByIdToMap(1);
        System.out.println(map);
        //{password=123456, gender=男, id=1, age=22, email=22686@qq.com, username=admin}
        sqlSession.close();

    }

    @Test
    public void testSelectAllUserToMap() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
        List<Map<String, Object>> list = mapper.getAllUserToMap();
        list.forEach(System.out::println);
        sqlSession.close();
    }

}
