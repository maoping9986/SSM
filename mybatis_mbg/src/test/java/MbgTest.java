import com.bcm.mbg.entity.Emp;
import com.bcm.mbg.entity.EmpExample;
import com.bcm.mbg.mapper.EmpMapper;
import com.bcm.mbg.utils.SqlSessionUtil;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @Author: Maoping
 * @CreateTime: 2022-08-01  17:06
 * @Description:
 * @Version: 1.0
 */
public class MbgTest {
    @Test
    public void mbgTest(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        //根据id查询数据
       /* Emp emp = mapper.selectByPrimaryKey(3);
        System.out.println(emp);*/
        //查询所有数据
    /*    List<Emp> list = mapper.selectByExample(null);
        list.forEach(System.out::println);*/
        EmpExample example = new EmpExample();
        example.createCriteria().andEmpNameEqualTo("Tom").andAgeEqualTo(20);
        List<Emp> list = mapper.selectByExample(example);
        list.forEach(System.out::println);

    }


    @Test
    public void  testPage(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        //查询功能之前开启分页功能
        Page<Object> page = PageHelper.startPage(1, 4);
        List<Emp> list = mapper.selectByExample(null);
        //
        PageInfo<Emp> pageInfo = new PageInfo<>(list,5);

        list.forEach(System.out::println);
    }
}
