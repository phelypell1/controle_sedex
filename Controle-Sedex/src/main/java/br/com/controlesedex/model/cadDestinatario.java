package br.com.controlesedex.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "caddestinatario")
public class cadDestinatario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "DES_Codigo")
	private long DES_Codigo;
	
	@Column(name = "DES_Destinatario", nullable = true, length = 50 )
	private String DES_Destinatario;
	
	@Column(name = "DES_ac", nullable = true, length = 75)
	private String DES_ac;
	


	@Column(name = "DES_acabreviado", nullable = true, length = 75)
	private String DES_AcAbreviado;
	
	@Column(name = "DES_CPF", nullable = true, length = 11 )
	private String DES_CPF;
	
	@Column(name = "DES_Logradouro", nullable = true, length = 100 )
	private String DES_Logradouro;
	
	@Column(name = "DES_Numero", nullable = true, length = 10)
	private String DES_Numero;
	
	@Column(name = "DES_Complmento", nullable = true, length = 70)
	private String DES_Complemento;
	
	@Column(name = "DES_Bairro", nullable = true, length = 50)
	private String DES_Bairro;
	
	@OneToOne
	@JoinColumn(name = "CID_Codigo", referencedColumnName = "CID_Codigo")
	private cadCidade CID_Codigo;
	
	@OneToOne
	@JoinColumn(name = "EST_Codigo", referencedColumnName = "EST_Codigo")
	private cadEstado EST_Codigo;
	
	@Column(name = "DES_CEP", nullable = true, length = 8)
	private String DES_CEP;
	
	@Column(name = "DES_Fixo", nullable = true, length = 11)
	private String DES_Fixo;
	
	@Column(name = "DES_Movel", nullable = true, length = 12)
	private String DES_Movel;
	
	@OneToOne
	@JoinColumn(name = "DES_Transportadora", referencedColumnName = "EMP_Codigo" )
	private cadEmpresa DES_Transportadora;
	
	@Column(name = "DES_Ativo", nullable = true)
	private boolean DES_Ativo;
	
	@Column(name = "DES_Operador", nullable = true)
	private int DES_Operador;
	
	@Column(name = "DES_dataalteracao", nullable = true)
	private Date DES_DataAlteracao;
	
	@Column(name = "DES_Latitude", nullable = true)
	private String DES_Latitude;
	
	@Column(name = "DES_Longitude", nullable = true )
	private String DES_Longitude;

	
	
	//////////////////////////////
	public long getDES_Codigo() {
		return DES_Codigo;
	}

	public void setDES_Codigo(long dES_Codigo) {
		DES_Codigo = dES_Codigo;
	}

	public String getDES_Destinatario() {
		return DES_Destinatario;
	}

	public void setDES_Destinatario(String dES_Destinatario) {
		DES_Destinatario = dES_Destinatario;
	}

	public String getDES_AcAbreviado() {
		return DES_AcAbreviado;
	}

	public void setDES_AcAbreviado(String dES_AcAbreviado) {
		DES_AcAbreviado = dES_AcAbreviado;
	}

	public String getDES_CPF() {
		return DES_CPF;
	}

	public void setDES_CPF(String dES_CPF) {
		DES_CPF = dES_CPF;
	}

	public String getDES_Logradouro() {
		return DES_Logradouro;
	}

	public void setDES_Logradouro(String dES_Logradouro) {
		DES_Logradouro = dES_Logradouro;
	}

	public String getDES_Numero() {
		return DES_Numero;
	}

	public void setDES_Numero(String dES_Numero) {
		DES_Numero = dES_Numero;
	}

	public String getDES_Complemento() {
		return DES_Complemento;
	}

	public void setDES_Complemento(String dES_Complemento) {
		DES_Complemento = dES_Complemento;
	}

	public String getDES_Bairro() {
		return DES_Bairro;
	}

	public void setDES_Bairro(String dES_Bairro) {
		DES_Bairro = dES_Bairro;
	}

	public cadCidade getCID_Codigo() {
		return CID_Codigo;
	}

	public void setCID_Codigo(cadCidade cID_Codigo) {
		CID_Codigo = cID_Codigo;
	}

	public cadEstado getEST_Codigo() {
		return EST_Codigo;
	}

	public void setEST_Codigo(cadEstado eST_Codigo) {
		EST_Codigo = eST_Codigo;
	}

	public String getDES_CEP() {
		return DES_CEP;
	}

	public void setDES_CEP(String dES_CEP) {
		DES_CEP = dES_CEP;
	}

	public String getDES_Fixo() {
		return DES_Fixo;
	}

	public void setDES_Fixo(String dES_Fixo) {
		DES_Fixo = dES_Fixo;
	}

	public String getDES_Movel() {
		return DES_Movel;
	}

	public void setDES_Movel(String dES_Movel) {
		DES_Movel = dES_Movel;
	}

	public cadEmpresa getDES_Transportadora() {
		return DES_Transportadora;
	}

	public void setDES_Transportadora(cadEmpresa dES_Transportadora) {
		DES_Transportadora = dES_Transportadora;
	}

	public boolean isDES_Ativo() {
		return DES_Ativo;
	}

	public void setDES_Ativo(boolean dES_Ativo) {
		DES_Ativo = dES_Ativo;
	}

	public int getDES_Operador() {
		return DES_Operador;
	}

	public void setDES_Operador(int dES_Operador) {
		DES_Operador = dES_Operador;
	}

	public Date getDES_DataAlteracao() {
		return DES_DataAlteracao;
	}

	public void setDES_DataAlteracao(Date dES_DataAlteracao) {
		DES_DataAlteracao = dES_DataAlteracao;
	}

	public String getDES_Latitude() {
		return DES_Latitude;
	}

	public void setDES_Latitude(String dES_Latitude) {
		DES_Latitude = dES_Latitude;
	}

	public String getDES_Longitude() {
		return DES_Longitude;
	}

	public void setDES_Longitude(String dES_Longitude) {
		DES_Longitude = dES_Longitude;
	}
	
	public String getDES_ac() {
		return DES_ac;
	}

	public void setDES_ac(String dES_ac) {
		DES_ac = dES_ac;
	}

}
