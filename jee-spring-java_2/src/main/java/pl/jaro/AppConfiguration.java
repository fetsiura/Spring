package pl.jaro;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pl.jaro.beans.HelloWorld;
import pl.jaro.task03.Captain;
import pl.jaro.task03.Ship;

@Configuration
public class AppConfiguration {

    @Bean
    public HelloWorld helloWorld (){
        return new HelloWorld();
    }
    @Bean
    public Captain jackSparrow() {
        return new Captain();
    }

    @Bean
    public Ship blackPearl() {
        return new Ship(jackSparrow());
    }

}
