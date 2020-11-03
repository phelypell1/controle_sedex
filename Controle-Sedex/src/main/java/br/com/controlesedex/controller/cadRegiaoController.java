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

import br.com.controlesedex.model.cadRegiao;
import br.com.controlesedex.repository.cadRegiaoRepository;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/regiao")
public class cadRegiaoController {
	
	@Autowired
	private cadRegiaoRepository regiaoRepository;
	
	@GetMapping
	public ResponseEntity<Iterable<cadRegiao>> get(){
		return ResponseEntity.ok(regiaoRepository.findAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<cadRegiao> getById(@PathVariable("id") long id){
		return regiaoRepository.findById(id).map(record -> ResponseEntity.ok().body(record))
				.orElse(ResponseEntity.notFound().build());
	}
	
	@PutMapping("update/{id}")
	public ResponseEntity<cadRegiao> update(@PathVariable("id") long id, @RequestBody cadRegiao regiao) {

		Optional<cadRegiao> regiaoOptional = regiaoRepository.findById(id);

		if (!regiaoOptional.isPresent())
			return ResponseEntity.notFound().build();

		regiao.setREO_Codigo(id);

		regiaoRepository.save(regiao);

		return ResponseEntity.noContent().build();
	}

	@PostMapping
	public void post(@RequestBody cadRegiao regiao) {
		regiaoRepository.save(regiao);
	}

	@DeleteMapping("delete/{id}")
	public void delete(@PathVariable("id") long id) {
		regiaoRepository.deleteById(id);
	}
	
	
}