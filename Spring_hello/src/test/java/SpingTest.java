import com.bcm.spring.entity.Clazz;
import com.bcm.spring.entity.Helloworld;
import com.bcm.spring.entity.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: Maoping
 * @CreateTime: 2022-08-02  15:03
 * @Description:
 * @Version: 1.0
 */
public class SpingTest {

    @Test
    public void springTest(){
        //获取IOC容器
        ApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
        Helloworld helloword = (Helloworld) ioc.getBean("helloworld");
        helloword.sayHello();
    }
    @Test
    public void testStudent(){
        //获取IOC容器
        ApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
        //获取Bean对象
        //1.根据Id获取
       /* Student stu = (Student) ioc.getBean("studentone");
        System.out.println(stu);*/
        //2.更加beanl类型获取 常用
        //Student bean = ioc.getBean(Student.class);
        //3.根据Id和bean类型获取
        Student studentone = ioc.getBean("stu3", Student.class);
        System.out.println(studentone);
    }
    @Test
    public void classTest(){
      ApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
        Clazz bean = ioc.getBean(Clazz.class);
        System.out.println(bean);
    }
}

