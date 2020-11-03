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
@Table(name = "cadRegiao")
public class cadRegiao {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "REO_Codigo")
	private long REO_Codigo;
	
	@Column(name = "REO_Regiao")
	private String REO_Regiao;

	public long getREO_Codigo() {
		return REO_Codigo;
	}

	public void setREO_Codigo(long rEO_Codigo) {
		REO_Codigo = rEO_Codigo;
	}

	public String getREO_Regiao() {
		return REO_Regiao;
	}

	public void setREO_Regiao(String rEO_Regiao) {
		REO_Regiao = rEO_Regiao;
	}

}
