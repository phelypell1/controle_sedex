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
@Table(name = "cadcidade")
public class cadCidade {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CID_Codigo")
	private long CID_Codigo;
	
	@OneToOne
	@JoinColumn(name = "EST_Codigo", referencedColumnName = "EST_Codigo")
	private cadEstado EST_Codigo;
	
	@Column(name = "CID_Municipio", nullable = true)
	private String CID_Municipio;
	
	@Column(name = "CID_Regiao", nullable = true)
	private String CID_Regiao;

	public long getCID_Codigo() {
		return CID_Codigo;
	}

	public void setCID_Codigo(long cID_Codigo) {
		CID_Codigo = cID_Codigo;
	}

	public cadEstado getEST_Codigo() {
		return EST_Codigo;
	}

	public void setEST_Codigo(cadEstado eST_Codigo) {
		EST_Codigo = eST_Codigo;
	}

	public String getCID_Municipio() {
		return CID_Municipio;
	}

	public void setCID_Municipio(String cID_Municipio) {
		CID_Municipio = cID_Municipio;
	}

	public String getCID_Regiao() {
		return CID_Regiao;
	}

	public void setCID_Regiao(String cID_Regiao) {
		CID_Regiao = cID_Regiao;
	}
	

}
