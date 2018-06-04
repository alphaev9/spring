import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2017/5/12.
 */
public class Test {
    public static void main(String[] args) {
        ApplicationContext ctx=new ClassPathXmlApplicationContext("myconfig.xml");
        A a = ctx.getBean("a", A.class);
        System.out.println(a.getbList());
        System.out.println(a.getbList().getClass().getName());

        System.out.println(a.getbSet());
        System.out.println(a.getbSet().getClass().getName());


        System.out.println(a.getMap());
        System.out.println(a.getMap().getClass().getName());
    }
}
