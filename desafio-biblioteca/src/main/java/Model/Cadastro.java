package Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



import com.sun.istack.NotNull;

@Entity
public class Cadastro {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idCadastro;

	@Column(nullable = false, length = 12)
	private String cpf;

	@Column
	@NotNull
	private String nome;

	@Column
	private String email;

	@Column
	private String telefone;

	@Column(nullable = false, length = 20)
	private String login;

	@Column
	private String senha;
	// Locacao locacao;

	public Cadastro() {

	}

	public Cadastro(Long idCadastro, String cpf, String nome, String email, String telefone, String login, String senha,
			Locacao locacao) {

		this.idCadastro = idCadastro;
		this.cpf = cpf;
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
		this.login = login;
		this.senha = senha;
		// this.locacao = locacao;

	}

	public Long getIdCadastro() {
		return idCadastro;
	}

	public void setIdCadastro(Long idCadastro) {
		this.idCadastro = idCadastro;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
//	public Locacao getLocacao() {
	// return locacao;
	// }
//	public void setLocacao(Locacao locacao) {
	// this.locacao = locacao;
//	}

}
