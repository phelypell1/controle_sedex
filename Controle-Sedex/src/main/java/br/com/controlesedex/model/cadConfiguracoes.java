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
@Table(name = "cadConfiguracao")
public class cadConfiguracoes {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CFG_Codigo")
	private long CFG_Codigo;
	
	@Column(name = "CFG_Operador", nullable = false)
	private int CFG_Operador;
	
	@Column(name = "CFG_Sons", nullable = true)
	private boolean CFG_Sons;

	public long getCFG_Codigo() {
		return CFG_Codigo;
	}

	public void setCFG_Codigo(long cFG_Codigo) {
		CFG_Codigo = cFG_Codigo;
	}

	public int getCFG_Operador() {
		return CFG_Operador;
	}

	public void setCFG_Operador(int cFG_Operador) {
		CFG_Operador = cFG_Operador;
	}

	public boolean isCFG_Sons() {
		return CFG_Sons;
	}

	public void setCFG_Sons(boolean cFG_Sons) {
		CFG_Sons = cFG_Sons;
	}
	
	
	
}
