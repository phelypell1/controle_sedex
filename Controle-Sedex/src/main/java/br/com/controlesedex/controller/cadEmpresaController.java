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

import br.com.controlesedex.model.cadEmpresa;
import br.com.controlesedex.repository.cadEmpresaRepository;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/empresa")
public class cadEmpresaController {
	
	@Autowired
	private cadEmpresaRepository empresaRepository;
	
	@GetMapping
	public ResponseEntity<Iterable<cadEmpresa>> get(){
		return ResponseEntity.ok(empresaRepository.findAll());
	}
	
	@GetMapping("/destinatarios")
	public ResponseEntity<Iterable<cadEmpresa>> getAll(){
		return ResponseEntity.ok(empresaRepository.findAllEmpresasNative());
	}
	
	@GetMapping("/transportadora")
	public ResponseEntity<Iterable<cadEmpresa>> getAllTrans(){
		return ResponseEntity.ok(empresaRepository.findAllEmpresasTransp());
	}
	
	
	@GetMapping("/{id}")
	public ResponseEntity<cadEmpresa> getById(@PathVariable("id") long id){
		return empresaRepository.findById(id).map(record -> ResponseEntity.ok().body(record))
				.orElse(ResponseEntity.notFound().build());
	}
	
	
	@PutMapping("update/{id}")
	public ResponseEntity<cadEmpresa> update(@PathVariable("id") long id, @RequestBody cadEmpresa empresa) {

		Optional<cadEmpresa> empresaOptional = empresaRepository.findById(id);

		if (!empresaOptional.isPresent())
			return ResponseEntity.notFound().build();

		empresa.setEMP_Codigo(id);

		empresaRepository.save(empresa);

		return ResponseEntity.noContent().build();
	}

	@PostMapping
	public void post(@RequestBody cadEmpresa empresa) {
		empresaRepository.save(empresa);
	}

	@DeleteMapping("delete/{id}")
	public void delete(@PathVariable("id") long id) {
		empresaRepository.deleteById(id);
	}
	
	
}
