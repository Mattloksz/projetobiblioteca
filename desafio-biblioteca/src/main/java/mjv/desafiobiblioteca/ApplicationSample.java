package mjv.desafiobiblioteca;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.data.jpa.repository.JpaRepository;
import Model.Cadastro;
import repository.CadastroRepository;



@Component
public class ApplicationSample {

	private CadastroRepository cadastroRepository;
	
	@Autowired
	
	public void criarCadastroSample() { 
		Cadastro cad = new Cadastro();
		cad.setIdCadastro(1235464l);
		cad.setEmail("matheus@mjv.com.br");
		cad.setNome("Matheus Pereira");
		cad.setCpf("34050178965");
		cad.setTelefone("18588144654564");
		cad.setLogin("matheusp");
		cad.setSenha("matheusp");
		


		
	}

}
