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
@Table(name = "cadTipoItem")
public class cadTipoItem {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "TIT_Codigo")
	private long TIT_Codigo;
	
	@Column(name = "TIT_TipoItem", nullable = true, length = 20)
	private String TIT_TipoItem;

	public long getTIT_Codigo() {
		return TIT_Codigo;
	}

	public void setTIT_Codigo(long tIT_Codigo) {
		TIT_Codigo = tIT_Codigo;
	}

	public String getTIT_TipoItem() {
		return TIT_TipoItem;
	}

	public void setTIT_TipoItem(String tIT_TipoItem) {
		TIT_TipoItem = tIT_TipoItem;
	}

	
}
