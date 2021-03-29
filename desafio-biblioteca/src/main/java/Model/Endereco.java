package Model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.sun.istack.NotNull;

public class Endereco {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idEndereco;
	
	@Column (nullable = false , length = 9)
	private String cep;
	
	@Column @NotNull
	private String logradouro;
	
	@Column
	private String bairro;
	
	@Column
	private String localidade;
	
	@Column
	private String uf;
	
	@Column
	private Integer ibge;
	
	Cadastro cadastro;
	
	public Endereco() {
		
	}
  
	 public Endereco(Long idEndereco, String cep, String logradouro, String bairro, String localidade, String uf, Integer ibge, Cadastro cadastro) {
			
			this.idEndereco = idEndereco;
			this.cep = cep;
			this.logradouro = logradouro;
			this.bairro = bairro;
			this.localidade = localidade;
			this.uf = uf;
			this.ibge = ibge;
			this.cadastro = cadastro;
	}
	 
	 public Long getidEndereco() {
		 return idEndereco;
	 }
	 public void setidEndereco(Long idEndereco) {
		 this.idEndereco = idEndereco;
	 }
	 
	 public String getcep() {
		 return cep;
	 }
	 public void setcep(String cep) {
		 this.cep = cep;
	 }
	 
	 public String getlogradouro() {
		 return logradouro;
	 }
	 public void setlogradouro(String logradouro) {
		 this.logradouro = logradouro;
	 }
	 
	 public String getbairro() {
		 return bairro;
	 }
	 public void setbairro(String bairro) {
		 this.bairro = bairro;
	 }
	 
	 public String getlocalidade() {
		 return localidade;
	 }
	 public void setlocalidade(String localidade) {
		 this.localidade = localidade;
	 }
	 
	 public String getuf() {
		 return uf;
	 }
	 public void setuf(String uf) {
		 this.uf = uf;
	 }
	 
	 public Integer getibge() {
		 return ibge;
	 }
	 public void setibge(Integer ibge) {
		 this.ibge = ibge;
	 }	  
	 
	 public Cadastro getcadastro() {
		 return cadastro;
	 }
	 public void setcadastro(Cadastro cadastro) {
		 this.cadastro = cadastro;
	 }


}
