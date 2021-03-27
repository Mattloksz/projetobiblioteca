package Model;

public class Cadastro {
	
	private Long idCadastro;
	 private String cpf;
	 private String nome;
	 private String email;
	 private String telefone;
	 private String login;
	 private String senha;
	 Locacao locacao;
	 
	 
	 public Cadastro() {
		 
	 }
	 
	 public Cadastro(Long idCadastro, String cpf, String nome, String email, String telefone, String login, String senha, Locacao locacao) {
			
			this.idCadastro = idCadastro;
			this.cpf = cpf;
			this.nome = nome;
			this.email = email;
			this.telefone = telefone;
			this.login = login;
			this.senha = senha;
			this.locacao = locacao;
			
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
	public Locacao getLocacao() {
		return locacao;
	}
	public void setLocacao(Locacao locacao) {
		this.locacao = locacao;
	}
	 
	
	
}
