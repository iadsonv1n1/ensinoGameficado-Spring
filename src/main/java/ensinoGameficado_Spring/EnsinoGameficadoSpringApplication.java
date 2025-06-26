package ensinoGameficado_Spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.web.config.EnableSpringDataWebSupport;

@SpringBootApplication
@EnableSpringDataWebSupport
public class EnsinoGameficadoSpringApplication {

	public static void main(String[] args) {

		SpringApplication.run(EnsinoGameficadoSpringApplication.class, args);
	}

}
