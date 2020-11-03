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

import br.com.controlesedex.model.cadDestinatario;
import br.com.controlesedex.repository.cadDestinatarioRepository;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/destinatario")
public class cadDestinatarioController {
	
	@Autowired
	private cadDestinatarioRepository destinatarioRepository;
	
	@GetMapping
	public ResponseEntity<Iterable<cadDestinatario>> get(){
		return ResponseEntity.ok(destinatarioRepository.findAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<cadDestinatario> getById(@PathVariable("id") long id){
		return destinatarioRepository.findById(id).map(record -> ResponseEntity.ok().body(record))
				.orElse(ResponseEntity.notFound().build());
	}
	
	@PutMapping("update/{id}")
	public ResponseEntity<cadDestinatario> update(@PathVariable("id") long id, @RequestBody cadDestinatario destinatario) {

		Optional<cadDestinatario> destinatarioOptional = destinatarioRepository.findById(id);

		if (!destinatarioOptional.isPresent())
			return ResponseEntity.notFound().build();

		destinatario.setDES_Codigo(id);

		destinatarioRepository.save(destinatario);

		return ResponseEntity.noContent().build();
	}

	@PostMapping
	public void post(@RequestBody cadDestinatario destinatario) {
		destinatarioRepository.save(destinatario);
	}

	@DeleteMapping("delete/{id}")
	public void delete(@PathVariable("id") long id) {
		destinatarioRepository.deleteById(id);
	}
	
	
}
