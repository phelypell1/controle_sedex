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
@Table(name = "regItens")
public class cadRegItens {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "IPS_Codigo")
	private long IPS_Codigo;
	
	@OneToOne
	@JoinColumn(name = "SED_Codigo", referencedColumnName = "SED_Codigo")
	private regSedex SED_Codigo;
	
	@OneToOne
	@JoinColumn(name = "TIT_Codigo", referencedColumnName = "TIT_Codigo")
	private cadTipoItem TIT_Codigo;
	
	@Column(name = "IPS_Descricao", nullable = true, length = 200)
	private String IPS_Descricao;
	
	@OneToOne
	@JoinColumn(name = "EQU_Codigo", referencedColumnName = "EQU_Codigo")
	private cadTipoEquipamento EQU_Codigo;
	
	@Column(name = "IPS_CodEquiq", nullable = true)
	private String IPS_CodEquiq;
	
	@Column(name = "IPS_CodRa", nullable = true)
	private String IPS_CodRA;

	public long getIPS_Codigo() {
		return IPS_Codigo;
	}

	public void setIPS_Codigo(long iPS_Codigo) {
		IPS_Codigo = iPS_Codigo;
	}

	public regSedex getSED_Codigo() {
		return SED_Codigo;
	}

	public void setSED_Codigo(regSedex sED_Codigo) {
		SED_Codigo = sED_Codigo;
	}

	public cadTipoItem getTIT_Codigo() {
		return TIT_Codigo;
	}

	public void setTIT_Codigo(cadTipoItem tIT_Codigo) {
		TIT_Codigo = tIT_Codigo;
	}

	public String getIPS_Descricao() {
		return IPS_Descricao;
	}

	public void setIPS_Descricao(String iPS_Descricao) {
		IPS_Descricao = iPS_Descricao;
	}

	public cadTipoEquipamento getEQU_Codigo() {
		return EQU_Codigo;
	}

	public void setEQU_Codigo(cadTipoEquipamento eQU_Codigo) {
		EQU_Codigo = eQU_Codigo;
	}

	public String getIPS_CodEquiq() {
		return IPS_CodEquiq;
	}

	public void setIPS_CodEquiq(String iPS_CodEquiq) {
		IPS_CodEquiq = iPS_CodEquiq;
	}

	public String getIPS_CodRA() {
		return IPS_CodRA;
	}

	public void setIPS_CodRA(String iPS_CodRA) {
		IPS_CodRA = iPS_CodRA;
	}
	
}
