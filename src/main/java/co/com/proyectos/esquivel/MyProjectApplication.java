package co.com.proyectos.esquivel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class },scanBasePackages = "co.com.proyectos.esquivel")
@ComponentScan(basePackages="co.com.proyectos.esquivel")
@EnableJpaRepositories(basePackages = "co.com.proyectos.esquivel.jpa.repository")
@EntityScan("co.com.proyectos.esquivel.jpa.entity")
public class MyProjectApplication {
	public static void main(String[] args) {
		SpringApplication.run(MyProjectApplication.class, args);
	}
}
