package br.com.controlesedex.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.controlesedex.model.cadEmpresa;

public interface cadEmpresaRepository extends JpaRepository<cadEmpresa, Long>{
	
	@Query(value = "select * from cadempresa where tem_codigo = 2", nativeQuery = true)
	Iterable<cadEmpresa> findAllEmpresasNative();
	
	@Query(value = "select * from cadempresa where tem_codigo = 3", nativeQuery = true)
	Iterable<cadEmpresa> findAllEmpresasTransp();

}
