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
@Table(name = "cadremetente")
public class cadRemetente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "REM_Codigo")
	private long REM_Codigo;
	
	@Column(name = "REM_Remetente", nullable = true, length = 75)
	private String REM_Remetente;
	
	@Column(name = "REM_Abreviado", nullable = true, length = 20)
	private String REM_Abreviado;
	
	@Column(name = "REM_Fixo", nullable = true, length = 11)
	private String REM_Fixo;
	
	@Column(name = "REM_Movel", nullable = true, length = 12)
	private String REM_Movel;
	
	@OneToOne
	@JoinColumn(name = "EMP_Codigo", referencedColumnName = "EMP_Codigo")
	private cadEmpresa EMP_Codigo;
	
	@Column(name = "REM_Ativo", nullable = false)
	private boolean REM_Ativo;

	public long getREM_Codigo() {
		return REM_Codigo;
	}

	public void setREM_Codigo(long rEM_Codigo) {
		REM_Codigo = rEM_Codigo;
	}

	public String getREM_Remetente() {
		return REM_Remetente;
	}

	public void setREM_Remetente(String rEM_Remetente) {
		REM_Remetente = rEM_Remetente;
	}

	public String getREM_Abreviado() {
		return REM_Abreviado;
	}

	public void setREM_Abreviado(String rEM_Abreviado) {
		REM_Abreviado = rEM_Abreviado;
	}

	public String getREM_Fixo() {
		return REM_Fixo;
	}

	public void setREM_Fixo(String rEM_Fixo) {
		REM_Fixo = rEM_Fixo;
	}

	public String getREM_Movel() {
		return REM_Movel;
	}

	public void setREM_Movel(String rEM_Movel) {
		REM_Movel = rEM_Movel;
	}

	public cadEmpresa getEMP_Codigo() {
		return EMP_Codigo;
	}

	public void setEMP_Codigo(cadEmpresa eMP_Codigo) {
		EMP_Codigo = eMP_Codigo;
	}

	public boolean isREM_Ativo() {
		return REM_Ativo;
	}

	public void setREM_Ativo(boolean rEM_Ativo) {
		REM_Ativo = rEM_Ativo;
	}
	
	
}
