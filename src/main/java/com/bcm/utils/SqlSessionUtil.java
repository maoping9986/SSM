package com.bcm.utils;

import com.bcm.mapper.UserMapper;
import com.bcm.mybatis.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

/**
 * @Author: Maoping
 * @CreateTime: 2022-07-27  11:48
 * @Description:
 * @Version: 1.0
 */
public class SqlSessionUtil {
    public static SqlSession getSqlSession(){
        SqlSession sqlSession = null;
        try {
            //获取核心配置文件输入流
           InputStream is = Resources.getResourceAsStream("mybatis2-config.xml");
           //获取SqlSessonFactoryBuilder
            SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
            //获取SqlSessionFactory
            SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(is);
            //获取SqlsSession对象
            sqlSession =  sqlSessionFactory.openSession(true);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return  sqlSession;
    }

    @Test
    public void testUpdate(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        mapper.updateUser();
        sqlSession.close();
    }

    @Test
    public void testDelete(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        mapper.deleteUser();
        sqlSession.close();
    }
    @Test
    public void testFind(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
       UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.findUserById();
        System.out.println(user);
    }
}
