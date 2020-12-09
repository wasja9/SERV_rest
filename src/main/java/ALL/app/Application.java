package ALL.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.security.SpringBootWebSecurityConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by asu on 15.08.2020.
 */

@SpringBootApplication
@ComponentScan(basePackages = "ALL")
@EnableJpaRepositories(basePackages = "ALL.repository")
@EntityScan(basePackages = "ALL.models")

//@EnableAutoConfiguration(exclude = SpringBootWebSecurityConfiguration.class)
//<security.ignored=/**

public class Application  extends WebMvcConfigurerAdapter {

    @Override

    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**");
        // .allowedOrigins("http://localhost:4200/test");
        //.allowedMethods("*");
    }

    @Bean
    public PasswordEncoder passwordEncoder(){
        return  new BCryptPasswordEncoder();
    }


    public static void main(String[] args){


        SpringApplication.run(Application.class);

      //  ArrayList<Integer> cats = new ArrayList<>();
      //  int i = 10;
       // cats.add(10);
    }
}
