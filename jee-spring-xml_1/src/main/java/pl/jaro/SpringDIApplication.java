package pl.jaro;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pl.jaro.beans.HelloWorld;

public class SpringDIApplication {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        HelloWorld helloWorld = context.getBean("helloWorld", HelloWorld.class);
        helloWorld.printMessage();

        HelloWorld helloWorld2 = context.getBean("helloWorld2",HelloWorld.class);
        helloWorld2.printMessage();
    }
}
