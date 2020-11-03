package br.com.controlesedex.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "cadTipoEquipamento")
public class cadTipoEquipamento {

	@Id
	@Column(name = "EQU_Codigo")
	private long EQU_Codigo;
	
	@Column(name = "EQU_Tipo", nullable = false, length = 10)
	private String EQU_Tipo;

	public long getEQU_Codigo() {
		return EQU_Codigo;
	}

	public void setEQU_Codigo(long eQU_Codigo) {
		EQU_Codigo = eQU_Codigo;
	}

	public String getEQU_Tipo() {
		return EQU_Tipo;
	}

	public void setEQU_Tipo(String eQU_Tipo) {
		EQU_Tipo = eQU_Tipo;
	}
	
}