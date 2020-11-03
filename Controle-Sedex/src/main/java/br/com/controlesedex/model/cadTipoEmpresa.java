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
@Table(name = "cadtipoempresa")
public class cadTipoEmpresa {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "TEM_Codigo")
	private long TEM_Codigo;
	
	@Column(name = "TEM_tipoempresa", nullable = true, length = 15)
	private String TEM_TipoEmpresa;

	public long getTEM_Codigo() {
		return TEM_Codigo;
	}

	public void setTEM_Codigo(long tEM_Codigo) {
		TEM_Codigo = tEM_Codigo;
	}

	public String getTEM_TipoEmpresa() {
		return TEM_TipoEmpresa;
	}

	public void setTEM_TipoEmpresa(String tEM_TipoEmpresa) {
		TEM_TipoEmpresa = tEM_TipoEmpresa;
	}

}
