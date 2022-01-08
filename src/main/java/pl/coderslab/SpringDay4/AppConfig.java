package pl.coderslab.SpringDay4;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import javax.servlet.Filter;

import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
import pl.coderslab.SpringDay4.config.WebConfig;

@Configuration
@EnableWebMvc
@ComponentScan
public class AppConfig extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getRootConfigClasses() {
        // Tutaj klasa konfiguracyjna z adnotacją @ComponentScan
        // (jedna taka na aplikację)
        return new Class[]{AppConfig.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        // Tutaj klasa konfiguracyjna implementująca WebMvcConfigurer
        return new Class[]{WebConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
        // Tutaj ścieżka, pod którą rejestrujemy DispatcherServlet
        // (raczej zawsze tak)
        return new String[] {"/"};
    }

    @Override
    protected Filter[] getServletFilters() {
        // Tutaj zestaw filtrów, które podpinamy pod DispatcherServlet
        // (nie określamy dla nich adresów, bo nie filtrują pod adres
        // a pod żądania do DispatcherServlet)
        CharacterEncodingFilter encodingFilter = new CharacterEncodingFilter();
        encodingFilter.setEncoding("UTF-8");
        encodingFilter.setForceEncoding(true);

        return new Filter[] {encodingFilter};
    }
}