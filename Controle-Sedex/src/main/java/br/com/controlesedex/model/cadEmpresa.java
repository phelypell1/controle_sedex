package br.com.controlesedex.model;

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
@Table(name = "cadempresa")
public class cadEmpresa {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "EMP_Codigo")
	private long EMP_Codigo;
	
	@Column(name = "EMP_CNPJ", nullable = true, length = 14)
	private String EMP_CNPJ;
	
	@Column(name = "EMP_rasaosocial", nullable = true, length = 50)
	private String EMP_RasaoSocial;
	
	@Column(name = "EMP_tipoempresa", nullable = true, length = 10)
	private String EMP_TipoEmpresa;
	
	@Column(name = "EMP_Descricao", nullable = true, length = 50)
	private String EMP_Descricao;
	
	@Column(name = "EMP_logradouro", nullable = true, length = 100)
	private String EMP_Logradouro;
	
	@Column(name = "EMP_Numero", nullable = true, length = 5)
	private String EMP_Numero;
	
	@Column(name = "EMP_Complemento", nullable = true, length = 50)
	private String EMP_Complemento;
	
	@Column(name = "EMP_Bairro", nullable = true, length = 50)
	private String EMP_Bairro;
	
	@OneToOne
	@JoinColumn(name = "CID_Codigo", referencedColumnName = "CID_Codigo")
	private cadCidade CID_Codigo;
	
	@OneToOne
	@JoinColumn(name = "EST_Codigo", referencedColumnName = "EST_Codigo")
	private cadEstado EST_Codigo;
	
	@Column(name = "EMP_CEP")
	private String EMP_CEP;
	
	@Column(name = "EMP_Fixo", nullable = true, length = 50)
	private String EMP_Fixo;
	
	@OneToOne
	@JoinColumn(name = "TEM_Codigo", referencedColumnName = "TEM_Codigo")
	private cadTipoEmpresa TEM_Codigo;
	
	
	public long getEMP_Codigo() {
		return EMP_Codigo;
	}
	public void setEMP_Codigo(long eMP_Codigo) {
		EMP_Codigo = eMP_Codigo;
	}
	public String getEMP_CNPJ() {
		return EMP_CNPJ;
	}
	public void setEMP_CNPJ(String eMP_CNPJ) {
		EMP_CNPJ = eMP_CNPJ;
	}
	public String getEMP_RasaoSocial() {
		return EMP_RasaoSocial;
	}
	public void setEMP_RasaoSocial(String eMP_RasaoSocial) {
		EMP_RasaoSocial = eMP_RasaoSocial;
	}
	public String getEMP_TipoEmpresa() {
		return EMP_TipoEmpresa;
	}
	public void setEMP_TipoEmpresa(String eMP_TipoEmpresa) {
		EMP_TipoEmpresa = eMP_TipoEmpresa;
	}
	public String getEMP_Descricao() {
		return EMP_Descricao;
	}
	public void setEMP_Descricao(String eMP_Descricao) {
		EMP_Descricao = eMP_Descricao;
	}
	public String getEMP_Logradouro() {
		return EMP_Logradouro;
	}
	public void setEMP_Logradouro(String eMP_Logradouro) {
		EMP_Logradouro = eMP_Logradouro;
	}
	public String getEMP_Numero() {
		return EMP_Numero;
	}
	public void setEMP_Numero(String eMP_Numero) {
		EMP_Numero = eMP_Numero;
	}
	public String getEMP_Complemento() {
		return EMP_Complemento;
	}
	public void setEMP_Complemento(String eMP_Complemento) {
		EMP_Complemento = eMP_Complemento;
	}
	public String getEMP_Bairro() {
		return EMP_Bairro;
	}
	public void setEMP_Bairro(String eMP_Bairro) {
		EMP_Bairro = eMP_Bairro;
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
	public String getEMP_CEP() {
		return EMP_CEP;
	}
	public void setEMP_CEP(String eMP_CEP) {
		EMP_CEP = eMP_CEP;
	}
	public String getEMP_Fixo() {
		return EMP_Fixo;
	}
	public void setEMP_Fixo(String eMP_Fixo) {
		EMP_Fixo = eMP_Fixo;
	}
	public cadTipoEmpresa getTEM_Codigo() {
		return TEM_Codigo;
	}
	public void setTEM_Codigo(cadTipoEmpresa tEM_Codigo) {
		TEM_Codigo = tEM_Codigo;
	}
	
}
