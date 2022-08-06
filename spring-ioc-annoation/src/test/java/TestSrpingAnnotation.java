import com.bcm.springannoaton.controller.UserContreller;
import com.bcm.springannoaton.dao.UserDao;
import com.bcm.springannoaton.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: Maoping
 * @CreateTime: 2022-08-06  15:52
 * @Description:
 * @Version: 1.0
 */
public class TestSrpingAnnotation {

    @Test
    public void test(){
        ApplicationContext ioc = new ClassPathXmlApplicationContext("spring-ioc-annotation.xml");
//        UserContreller userContreller = ioc.getBean(UserContreller.class);
//        System.out.println(userContreller);

        UserDao userDao = ioc.getBean(UserDao.class);
        System.out.println(userDao);

        UserService userService = ioc.getBean(UserService.class);
        System.out.println(userService);


    }
}
