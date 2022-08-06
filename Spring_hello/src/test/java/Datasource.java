import com.alibaba.druid.pool.DruidDataSource;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLException;

/**
 * @Author: Maoping
 * @CreateTime: 2022-08-05  22:20
 * @Description:
 * @Version: 1.0
 */
public class Datasource {
    @Test
    public void testDatasource() throws SQLException {
        ApplicationContext ioc = new ClassPathXmlApplicationContext("spring-database.xml");
        DruidDataSource bean = ioc.getBean(DruidDataSource.class);
        System.out.println(bean.getConnection());
    }
}
