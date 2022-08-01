import com.bcm.entity.Emp;
import com.bcm.mapper.EmpMapper;
import com.bcm.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

/**
 * @Author: Maoping
 * @CreateTime: 2022-07-30  15:19
 * @Description:
 * @Version: 1.0
 */
public class EmpTest {

    @Test
    public void empTestGetEmpById(){
        SqlSession sqlSession  = SqlSessionUtil.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        Emp emp = mapper.getEmpById(1);
        System.out.println(emp);
    }

    @Test
    public void empTestGetEmpDeptById(){
        SqlSession sqlSession  = SqlSessionUtil.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        Emp emp = mapper.getEmpDeptById(1);
        System.out.println(emp);
    }
    @Test
    public void empTestGetEmpAndDeptById(){
        SqlSession sqlSession  = SqlSessionUtil.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        Emp emp = mapper.getEmpAndDept(3);
        System.out.println(emp);
    }
}
