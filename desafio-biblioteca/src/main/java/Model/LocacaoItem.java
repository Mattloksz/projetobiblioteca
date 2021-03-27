package Model;

import java.sql.Date;

public class LocacaoItem {

	private Long idLocacaoItem;
	private Date dataPrevisaoEntrega;
	private Date dataEntrega;
	private Integer diarias;
	private Double valorDiaria;
	private Double valorLocacao;
	Locacao locacao;
	
	public LocacaoItem() {
		
	}
  
	 public LocacaoItem(Long idLocacaoItem, Date dataPrevisaoEntrega, Date dataEntrega, Integer diarias, Double valorDiaria, Double valorLocacao, Locacao locacao) {
			
			this.idLocacaoItem = idLocacaoItem;
			this.dataPrevisaoEntrega = dataPrevisaoEntrega;
			this.dataEntrega = dataEntrega;
			this.diarias = diarias;
			this.valorDiaria = valorDiaria;
			this.valorLocacao = valorLocacao;
			this.locacao = locacao;
	}
	 
	 public Long getidLocacaoItem() {
		 return idLocacaoItem;
	 }
	 public void setidLocacaoItem(Long idLocacaoItem) {
		 this.idLocacaoItem = idLocacaoItem;
	 }
	 
	 public Date getdataPrevisaoEntrega() {
		 return dataPrevisaoEntrega;
	 }
	 public void setdataPrevisaoEntrega(Date dataPrevisaoEntrega) {
		 this.dataPrevisaoEntrega = dataPrevisaoEntrega;
	 }
	 
	 public Date getdataEntrega() {
		 return dataEntrega;
	 }
	 public void setdataEntrega(Date dataEntrega) {
		 this.dataEntrega = dataEntrega;
	 }
	 
	 public Integer getdiarias() {
		 return diarias;
	 }
	 public void setdiarias(Integer diarias) {
		 this.diarias = diarias;
	 }
	 
	 public Double getvalorDiaria() {
		 return valorDiaria;
	 }
	 public void setvalorDiaria(Double valorDiaria) {
		 this.valorDiaria = valorDiaria;
	 }
	 
	 public Double getvalorLocacao() {
		 return valorLocacao;
	 }
	 public void setvalorLocacao(Double valorLocacao) {
		 this.valorLocacao = valorLocacao;
	 }
	 
	 public Locacao getlocacao() {
		 return locacao;
	 }
	 public void setlocacao(Locacao locacao) {
		 this.locacao = locacao;
	 }
}
