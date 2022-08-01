import com.bcm.entity.Dept;
import com.bcm.mapper.DeptMapper;
import com.bcm.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @Author: Maoping
 * @CreateTime: 2022-08-01  09:50
 * @Description:
 * @Version: 1.0
 */
public class DeptTest {

    @Test
    public void testDeptAndEmp(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        DeptMapper mapper = sqlSession.getMapper(DeptMapper.class);
        Dept dept = mapper.getDeptAndEmps(1);
        System.out.println(dept);

    }

    @Test
    public void testDeptAndEmpStep(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        DeptMapper mapper = sqlSession.getMapper(DeptMapper.class);
        Dept dept = mapper.getDeptAndEmpsStepOne(1);
        System.out.println(dept);

    }
}
