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
@Table(name = "tmpImp")
public class tmpImp {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "SED_Codigo")
	private long SED_Codigo;
	
	@Column(name = "TMP_UserId")
	private int TMP_UserId;

	public long getSED_Codigo() {
		return SED_Codigo;
	}

	public void setSED_Codigo(long sED_Codigo) {
		SED_Codigo = sED_Codigo;
	}

	public int getTMP_UserId() {
		return TMP_UserId;
	}

	public void setTMP_UserId(int tMP_UserId) {
		TMP_UserId = tMP_UserId;
	}
	
	
}
