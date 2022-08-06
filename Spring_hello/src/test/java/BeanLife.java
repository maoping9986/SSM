import com.bcm.spring.entity.User;
import org.junit.Test;
import org.springframework.context.support.AbstractRefreshableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: Maoping
 * @CreateTime: 2022-08-06  09:56
 * @Description:
 * @Version: 1.0
 */
public class BeanLife {
    @Test
    public void testBeanLife(){
        ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("spring-lifecycle.xml");
        ioc.getBean(User.class);
        ioc.close();

    }
}
