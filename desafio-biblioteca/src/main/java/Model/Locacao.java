package Model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Locacao {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idLocacao;
	
	@Column
	private Date dataAgendamento;
	
	@Column
	private Date dataRetirada;
	
	@Column
	private Date dataFinalizada;
	
	@Column
	private Double valorTotal;
	 
	 public Locacao() {
			
		}
	  
		 public Locacao(Long idLocacao, Date dataAgendamento, Date dataRetirada, Date dataFinalizada, Double valorTotal) {
				
				this.idLocacao = idLocacao;
				this.dataAgendamento = dataAgendamento;
				this.dataRetirada = dataRetirada;
				this.dataFinalizada = dataFinalizada;
				this.valorTotal = valorTotal;
		}
		 
		 public Long getidLocacao() {
			 return idLocacao;
		 }
		 public void setidLocacao(Long idLocacao) {
			 this.idLocacao = idLocacao;
		 }
		 
		 public Date getdataAgendamento() {
			 return dataAgendamento;
		 }
		 public void setdataAgendamento(Date dataAgendamento) {
			 this.dataAgendamento = dataAgendamento;
		 }
		 
		 public Date getdataRetirada() {
			 return dataRetirada;
		 }
		 public void setdataRetirada(Date dataRetirada) {
			 this.dataRetirada = dataRetirada;
		 }
		 
		 public Date getdataFinalizada() {
			 return dataFinalizada;
		 }
		 public void setdataFinalizada(Date dataFinalizada) {
			 this.dataFinalizada = dataFinalizada;
		 }
		 
		 public Double getvalorTotal() {
			 return valorTotal;
		 }
		 public void setvalorTotal(Double valorTotal) {
			 this.valorTotal = valorTotal;
		 }

}
