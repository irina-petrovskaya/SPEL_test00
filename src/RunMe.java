import a.b.c.B1;
import a.b.c.BB2;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import java.io.File;
import java.util.Properties;
import java.util.PropertyResourceBundle;

/**
 * Created with IntelliJ IDEA.
 * User: Irina.Petrovskaya
 * Date: 5/6/13
 * Time: 2:44 PM
 */
public class RunMe {

    public static void main(String[] args) {
       /* GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:/configs/spring-config.xml");
        ctx.refresh();*/
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:/configs/spring-config.xml");
        B1 b1 = (B1) ctx.getBean("b1");
        System.out.println("rez = " + b1.getNum1());
        BB2 BB2 = (BB2) ctx.getBean("b2");
        System.out.println("rez2 = " + BB2.getNum2());


    }
}
