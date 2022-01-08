package pl.jaro;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pl.jaro.beans.HelloWorld;
import pl.jaro.task03.Ship;

public class SpringDiApplication {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);


        HelloWorld helloWorld = context.getBean("helloWorld",HelloWorld.class);

        helloWorld.hello();



        Ship ship = context.getBean("blackPearl", Ship.class);
        ship.getCaptain().startSailing();
    }
}
