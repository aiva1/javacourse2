package lv.activestudio.java2.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * The configuration class for Spring MVC. It is a replacement for spring-servlet.xml configuration.
 * Contains all the info about component scanning and view resolver.
 */
@Configuration
@EnableWebMvc //enables support for @Controller-annotated classes that use @RequestMapping
@ComponentScan(basePackages = {"lv.activestudio.java2"})
public class SpringWebMvcConfig extends WebMvcConfigurerAdapter {

    @Bean
    public ViewResolver viewResolver() {
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setPrefix("/jsp/");
        viewResolver.setSuffix(".jsp");
        return viewResolver;
    }

    //TODO: add resource handlers here (for any images, etc)
}
