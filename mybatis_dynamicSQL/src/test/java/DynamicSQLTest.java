import com.bcm.entity.Emp;
import com.bcm.mapper.DynamicSQL;
import com.bcm.utilsql.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * @Author: Maoping
 * @CreateTime: 2022-08-01  11:37
 * @Description:
 * @Version: 1.0
 */
public class DynamicSQLTest {
    @Test
    public void testGetEmpByCondition(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        DynamicSQL mapper = sqlSession.getMapper(DynamicSQL.class);
        Emp emp = new Emp(null,null,20,'男');
        List<Emp> emps = mapper.getEmpByCondition(emp);
        emps.forEach(System.out::println);
    }

    @Test
    public void testInsetManyEmp(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        DynamicSQL mapper = sqlSession.getMapper(DynamicSQL.class);
        Emp emp1 = new Emp(null,"Tom",20,'男');
        Emp emp2 = new Emp(null,"Jerry",20,'男');
        Emp emp3 = new Emp(null,"小毛",20,'男');
        List<Emp> emps = Arrays.asList(emp1, emp2, emp3);
        mapper.insertManyEmps(emps);

    }

    @Test
    public void testDeleteMany(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        DynamicSQL mapper = sqlSession.getMapper(DynamicSQL.class);
        Integer[] empids = new Integer[]{6,7,8};
        mapper.deleteManyEmps(empids);

    }
}
