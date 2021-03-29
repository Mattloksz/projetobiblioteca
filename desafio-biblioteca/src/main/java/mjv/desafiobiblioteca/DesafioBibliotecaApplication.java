package mjv.desafiobiblioteca;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DesafioBibliotecaApplication {

	public static void main(String[] args) {
		SpringApplication.run(DesafioBibliotecaApplication.class, args);
		 
		}
	@Bean
	public CommandLineRunner run(ApplicationSample as) throws Exception{
		return args -> {
			as.criarCadastroSample();
		};
	}

	

}
