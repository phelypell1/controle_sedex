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

import br.com.controlesedex.model.cadCidade;
import br.com.controlesedex.repository.cadCidadeRepository;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/cidade")
public class cadCidadeController {
	public cadCidadeController() {
		System.out.println("chamou CidadeController controller");
	}

	@Autowired
	private cadCidadeRepository cadCidRepository;

	@GetMapping
	public ResponseEntity<Iterable<cadCidade>> get() {
		return ResponseEntity.ok(cadCidRepository.findAll());
	}

	@GetMapping("/{id}")
	public ResponseEntity<cadCidade> getById(@PathVariable("id") long id) {
		return cadCidRepository.findById(id).map(record -> ResponseEntity.ok().body(record))
				.orElse(ResponseEntity.notFound().build());
	}

	@PutMapping("update/{id}")
	public ResponseEntity<cadCidade> update(@PathVariable("id") long id, @RequestBody cadCidade cidade) {

		Optional<cadCidade> cidadeOptional = cadCidRepository.findById(id);

		if (!cidadeOptional.isPresent())
			return ResponseEntity.notFound().build();

		cidade.setCID_Codigo(id);

		cadCidRepository.save(cidade);

		return ResponseEntity.noContent().build();
	}

	@PostMapping
	public void post(@RequestBody cadCidade cidade) {
		cadCidRepository.save(cidade);
	}

	@DeleteMapping("delete/{id}")
	public void delete(@PathVariable("id") long id) {
		cadCidRepository.deleteById(id);
	}
}