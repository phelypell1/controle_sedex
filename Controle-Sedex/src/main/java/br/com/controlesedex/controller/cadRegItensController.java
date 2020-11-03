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

import br.com.controlesedex.model.cadRegItens;
import br.com.controlesedex.repository.cadRegItensRepository;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/regitens")
public class cadRegItensController {
	public cadRegItensController() {
		System.out.println("chamou CidadeController controller");
	}

	@Autowired
	private cadRegItensRepository regItensRepository;

	@GetMapping
	public ResponseEntity<Iterable<cadRegItens>> get() {
		return ResponseEntity.ok(regItensRepository.findAll());
	}

	@GetMapping("/{id}")
	public ResponseEntity<cadRegItens> getById(@PathVariable("id") long id) {
		return regItensRepository.findById(id).map(record -> ResponseEntity.ok().body(record))
				.orElse(ResponseEntity.notFound().build());
	}

	@PutMapping("update/{id}")
	public ResponseEntity<cadRegItens> update(@PathVariable("id") long id, @RequestBody cadRegItens itens) {

		Optional<cadRegItens> itensOptional = regItensRepository.findById(id);

		if (!itensOptional.isPresent())
			return ResponseEntity.notFound().build();

		itens.setIPS_Codigo(id);

		regItensRepository.save(itens);

		return ResponseEntity.noContent().build();
	}

	@PostMapping
	public void post(@RequestBody cadRegItens itens) {
		regItensRepository.save(itens);
	}

	@DeleteMapping("delete/{id}")
	public void delete(@PathVariable("id") long id) {
		regItensRepository.deleteById(id);
	}
}