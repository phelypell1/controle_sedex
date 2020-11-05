package br.com.controlesedex.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.controlesedex.model.cadRemetente;

public interface cadRemetenteRepository extends JpaRepository<cadRemetente, Long>{
	
	@Query(value = "select * from cadremetente where rem_ativo = 1 order by rem_abreviado", nativeQuery = true)
	Iterable<cadRemetente> findRemetenteAtivo();

}
