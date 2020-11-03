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
@Table(name = "cadVersao")
public class cadVersao {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "VER_Codigo")
	private long VER_Codigo;
	
	@Column(name = "VER_Versao", nullable = false, length = 7)
	private String VER_Versao;

	public long getVER_Codigo() {
		return VER_Codigo;
	}

	public void setVER_Codigo(long vER_Codigo) {
		VER_Codigo = vER_Codigo;
	}

	public String getVER_Versao() {
		return VER_Versao;
	}

	public void setVER_Versao(String vER_Versao) {
		VER_Versao = vER_Versao;
	}

}
