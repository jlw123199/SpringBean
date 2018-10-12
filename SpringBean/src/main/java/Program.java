import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Program {


    public static void main(String[] args) {

        //加载
        ApplicationContext context =
                new ClassPathXmlApplicationContext("benasCon.xml");


        BeanUser beanUser = (BeanUser) context.getBean("beanUser");

//        BeanUser beanUser = new BeanUser();

        System.out.println("----");

        String beanPorcessResult = beanUser.AuthorToUser("this is bean assemble app");
        System.out.println(beanPorcessResult);
    }


}
