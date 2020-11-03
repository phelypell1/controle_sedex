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
@Table(name = "cadMes")
public class cadMes {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "MES_Codigo")
	private long MES_Codigo;
	
	@Column(name = "MES_Sistema", nullable = false, length = 20)
	private String MES_Sistema;
	
	@Column(name = "MES_Texto", nullable = false, length = 20)
	private String MES_Texto;

	public long getMES_Codigo() {
		return MES_Codigo;
	}

	public void setMES_Codigo(long mES_Codigo) {
		MES_Codigo = mES_Codigo;
	}

	public String getMES_Sistema() {
		return MES_Sistema;
	}

	public void setMES_Sistema(String mES_Sistema) {
		MES_Sistema = mES_Sistema;
	}

	public String getMES_Texto() {
		return MES_Texto;
	}

	public void setMES_Texto(String mES_Texto) {
		MES_Texto = mES_Texto;
	}
	
}
