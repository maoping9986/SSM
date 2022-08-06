import com.bcm.cache.entity.Emp;
import com.bcm.cache.mapper.CacheMapper;
import com.bcm.cache.utils.SqlSessionUtil;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import java.io.IOException;
import java.io.InputStream;

/**
 * @Author: Maoping
 * @CreateTime: 2022-08-01  15:41
 * @Description:
 *              一级缓存是SqlSession级别的，通过同一个SqlSession查询的数据会被缓存，下次查询相同的数据，就
 *              会从缓存中直接获取，不会从数据库重新访问
 *               使一级缓存失效的四种情况：
 *                  1) 不同的SqlSession对应不同的一级缓存
 *                  2) 同一个SqlSession但是查询条件不同
 *                  3) 同一个SqlSession两次查询期间执行了任何一次增删改操作
 *                  4) 同一个SqlSession两次查询期间手动清空了缓存
 * @Version: 1.0
 */
public class CacheTest {
    @Test
    public void testCache1(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        CacheMapper mapper = sqlSession.getMapper(CacheMapper.class);
        Emp emp = mapper.getEmpById(5);
        System.out.println(emp);
        sqlSession.clearCache();
        Emp emp2 = mapper.getEmpById(5);
        System.out.println(emp2);
        System.out.println("**************************************");
        SqlSession sqlSession1 = SqlSessionUtil.getSqlSession();
        CacheMapper mapper1 = sqlSession1.getMapper(CacheMapper.class);
        Emp emp3 = mapper1.getEmpById(5);
        System.out.println(emp3);
    }
    //二级缓存
    @Test
    public void test2() throws IOException {
        InputStream is = Resources.getResourceAsStream("mybatis_config.xml");
        SqlSessionFactory sqlsessionfactory = new SqlSessionFactoryBuilder().build(is);
        SqlSession sqlSession1 = sqlsessionfactory.openSession(true);
        CacheMapper mapper1 = sqlSession1.getMapper(CacheMapper.class);
        Emp emp = mapper1.getEmpById(1);
        System.out.println(emp);
        sqlSession1.close();
        System.out.println("****************************************************");
        SqlSession sqlSession2 = sqlsessionfactory.openSession(true);
        CacheMapper mapper2 = sqlSession2.getMapper(CacheMapper.class);
        Emp emp2 = mapper2.getEmpById(1);
        System.out.println(emp2);
        sqlSession2.close();

    }
}
