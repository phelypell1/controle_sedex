package br.com.controlesedex.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.controlesedex.model.cadTipoEmpresa;
import br.com.controlesedex.repository.cadTipoEmpresaRepository;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/tipoempresa")
public class cadTipoEmpresaController {
	
	@Autowired
	private cadTipoEmpresaRepository cadTipoEmpresaRepository;
	
	@GetMapping
	public ResponseEntity<Iterable<cadTipoEmpresa>> get(){
		return ResponseEntity.ok(cadTipoEmpresaRepository.findAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<cadTipoEmpresa> getById(@PathVariable("id") long id){
		return cadTipoEmpresaRepository.findById(id).map(record -> ResponseEntity.ok().body(record))
				.orElse(ResponseEntity.notFound().build());
	}
	
	@PutMapping("update/{id}")
	public ResponseEntity<cadTipoEmpresa> update(@PathVariable("id") long id, @RequestBody cadTipoEmpresa tipoEmpresa) {

		Optional<cadTipoEmpresa> tipoEmpresaOptional = cadTipoEmpresaRepository.findById(id);

		if (!tipoEmpresaOptional.isPresent())
			return ResponseEntity.notFound().build();

		tipoEmpresa.setTEM_Codigo(id);

		cadTipoEmpresaRepository.save(tipoEmpresa);

		return ResponseEntity.noContent().build();
	}

	@PostMapping
	public void post(@RequestBody cadTipoEmpresa tipoEmpresa) {
		cadTipoEmpresaRepository.save(tipoEmpresa);
	}

	@DeleteMapping("delete/{id}")
	public void delete(@PathVariable("id") long id) {
		cadTipoEmpresaRepository.deleteById(id);
	}
	
	
}
