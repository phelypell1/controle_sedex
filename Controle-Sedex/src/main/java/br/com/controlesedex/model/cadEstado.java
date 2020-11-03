package br.com.controlesedex.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "cadestado")
public class cadEstado {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "EST_Codigo")
	private long EST_Codigo;
	
	@Column(name = "EST_Estado", nullable = true)
	private String EST_Estado;
	
	@Column(name = "EST_UF")
	private String EST_UF;
	
	//Gets e Sets//
	public long getEST_Codigo() {
		return EST_Codigo;
	}

	public void setEST_Codigo(long eST_Codigo) {
		EST_Codigo = eST_Codigo;
	}

	public String getEST_Estado() {
		return EST_Estado;
	}

	public void setEST_Estado(String eST_Estado) {
		EST_Estado = eST_Estado;
	}

	public String getEST_UF() {
		return EST_UF;
	}

	public void setEST_UF(String eST_UF) {
		EST_UF = eST_UF;
	}

}
