package Model;

public class Livro {

	private Long idLivro;
	private String isbn;
	private String titulo;
	private Double valorDiaria;
	private Integer exemplares;
	private Integer reservadas;
	LocacaoItem locacaoItem;
	
	public Livro() {
			
		}
  
	 public Livro(Long idLivro, String isbn, String titulo, Double valorDiaria, Integer exemplares, Integer reservadas, LocacaoItem locacaoItem) {
			
			this.idLivro = idLivro;
			this.isbn = isbn;
			this.titulo = titulo;
			this.valorDiaria = valorDiaria;
			this.exemplares = exemplares;
			this.reservadas = reservadas;
			this.locacaoItem = locacaoItem;
	}
	 
	 public Long getidLivro() {
		 return idLivro;
	 }
	 public void setidLivro(Long idLivro) {
		 this.idLivro = idLivro;
	 }
	 
	 public String getisbn() {
		 return isbn;
	 }
	 public void setisbn(String isbn) {
		 this.isbn = isbn;
	 }
	 
	 public String gettitulo() {
		 return titulo;
	 }
	 public void settitulo(String titulo) {
		 this.titulo = titulo;
	 }
	 
	 public Double getvalorDiaria() {
		 return valorDiaria;
	 }
	 public void setvalorDiaria(Double valorDiaria) {
		 this.valorDiaria = valorDiaria;
	 }
	 
	 public Integer getexemplares() {
		 return exemplares;
	 }
	 public void setexemplares(Integer exemplares) {
		 this.exemplares = exemplares;
	 }	  
	 
	 public Integer getreservadas() {
		 return reservadas;
	 }
	 public void setreservadas(Integer reservadas) {
		 this.reservadas = reservadas;
	 }
	 
	 public LocacaoItem getlocacaoItem() {
		 return locacaoItem;
	 }
	 public void setlocacaoItem(LocacaoItem locacaoItem) {
		 this.locacaoItem = locacaoItem;
	 }


}
