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

import br.com.controlesedex.model.cadRemetente;
import br.com.controlesedex.repository.cadRemetenteRepository;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/remetente")
public class cadRemetenteController {
	
	@Autowired
	private cadRemetenteRepository remetenteRepository;
	
	@GetMapping
	public ResponseEntity<Iterable<cadRemetente>> get(){
		return ResponseEntity.ok(remetenteRepository.findAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<cadRemetente> getById(@PathVariable("id") long id){
		return remetenteRepository.findById(id).map(record -> ResponseEntity.ok().body(record))
				.orElse(ResponseEntity.notFound().build());
	}
	
	@PutMapping("update/{id}")
	public ResponseEntity<cadRemetente> update(@PathVariable("id") long id, @RequestBody cadRemetente remetente) {

		Optional<cadRemetente> remetenteOptional = remetenteRepository.findById(id);

		if (!remetenteOptional.isPresent())
			return ResponseEntity.notFound().build();

		remetente.setREM_Codigo(id);

		remetenteRepository.save(remetente);

		return ResponseEntity.noContent().build();
	}

	@PostMapping
	public void post(@RequestBody cadRemetente remetente) {
		remetenteRepository.save(remetente);
	}

	@DeleteMapping("delete/{id}")
	public void delete(@PathVariable("id") long id) {
		remetenteRepository.deleteById(id);
	}
	
	
}
