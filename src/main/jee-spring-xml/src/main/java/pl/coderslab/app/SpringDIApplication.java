package pl.coderslab.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDIApplication {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("beans.xml");
        context.close();
    }

}
