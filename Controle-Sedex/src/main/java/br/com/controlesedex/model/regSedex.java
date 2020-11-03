package br.com.controlesedex.model;


import java.util.Date;

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
@Table(name = "regsedex")
public class regSedex {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "SED_Codigo")
	private long SED_Codigo;
	
	@Column(name = "SED_Data", nullable = true)
	private Date SED_Data;
	
	@Column(name = "SED_datapostagem", nullable = true)
	private Date SED_DataPostagem;
	
	@OneToOne
	@JoinColumn(name = "EMP_Codigo", referencedColumnName = "EMP_Codigo")
	private cadEmpresa EMP_Codigo;
	
	@OneToOne
	@JoinColumn(name = "REM_Codigo", referencedColumnName = "REM_Codigo")
	private cadRemetente REM_Codigo;
	
	@OneToOne
	@JoinColumn(name = "CID_Codigo", referencedColumnName = "CID_Codigo")
	private cadCidade CID_Codigo;
	
	@OneToOne
	@JoinColumn(name = "EST_Codigo", referencedColumnName = "EST_Codigo")
	private cadEstado EST_Codigo;
	
	@OneToOne
	@JoinColumn(name = "DES_Codigo", referencedColumnName = "DES_Codigo")
	private cadDestinatario DES_Codigo;
	
	@Column(name = "SED_Cod_Rastreamento", nullable = true)
	private String SED_Cod_Rastreamento;
	
	@Column(name = "SED_Valor", nullable = true)
	private Double SED_Valor;
	
	@Column(name = "SED_Pago", nullable = true)
	private boolean SED_Pago;
	
	@Column(name = "SED_Extraviou", nullable = true)
	private boolean SED_Extraviou;
	
	@Column(name = "SED_Operador", nullable = true)
	private String SED_Operador;
	
	@Column(name = "SED_datamodificacao", nullable = true)
	private Date SED_DataModificacao;

	public long getSED_Codigo() {
		return SED_Codigo;
	}

	public void setSED_Codigo(long sED_Codigo) {
		SED_Codigo = sED_Codigo;
	}

	public Date getSED_Data() {
		return SED_Data;
	}

	public void setSED_Data(Date sED_Data) {
		SED_Data = sED_Data;
	}

	public Date getSED_DataPostagem() {
		return SED_DataPostagem;
	}

	public void setSED_DataPostagem(Date sED_DataPostagem) {
		SED_DataPostagem = sED_DataPostagem;
	}

	public cadEmpresa getEMP_Codigo() {
		return EMP_Codigo;
	}

	public void setEMP_Codigo(cadEmpresa eMP_Codigo) {
		EMP_Codigo = eMP_Codigo;
	}

	public cadRemetente getREM_Codigo() {
		return REM_Codigo;
	}

	public void setREM_Codigo(cadRemetente rEM_Codigo) {
		REM_Codigo = rEM_Codigo;
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

	public cadDestinatario getDES_Codigo() {
		return DES_Codigo;
	}

	public void setDES_Codigo(cadDestinatario dES_Codigo) {
		DES_Codigo = dES_Codigo;
	}

	public String getSED_Cod_Rastreamento() {
		return SED_Cod_Rastreamento;
	}

	public void setSED_Cod_Rastreamento(String sED_Cod_Rastreamento) {
		SED_Cod_Rastreamento = sED_Cod_Rastreamento;
	}

	public Double getSED_Valor() {
		return SED_Valor;
	}

	public void setSED_Valor(Double sED_Valor) {
		SED_Valor = sED_Valor;
	}

	public boolean isSED_Pago() {
		return SED_Pago;
	}

	public void setSED_Pago(boolean sED_Pago) {
		SED_Pago = sED_Pago;
	}

	public boolean isSED_Extraviou() {
		return SED_Extraviou;
	}

	public void setSED_Extraviou(boolean sED_Extraviou) {
		SED_Extraviou = sED_Extraviou;
	}

	public String getSED_Operador() {
		return SED_Operador;
	}

	public void setSED_Operador(String sED_Operador) {
		SED_Operador = sED_Operador;
	}

	public Date getSED_DataModificacao() {
		return SED_DataModificacao;
	}

	public void setSED_DataModificacao(Date sED_DataModificacao) {
		SED_DataModificacao = sED_DataModificacao;
	}

}
