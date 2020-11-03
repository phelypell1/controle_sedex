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

import br.com.controlesedex.model.cadConfiguracoes;
import br.com.controlesedex.repository.cadConfiguracaoRepository;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/configuracao")
public class cadConfiguracaoController {
	public cadConfiguracaoController() {
		System.out.println("chamou ConfiguracaoController controller");
	}

	@Autowired
	private cadConfiguracaoRepository configRepository;

	@GetMapping
	public ResponseEntity<Iterable<cadConfiguracoes>> get() {
		return ResponseEntity.ok(configRepository.findAll());
	}

	@GetMapping("/{id}")
	public ResponseEntity<cadConfiguracoes> getById(@PathVariable("id") long id) {
		return configRepository.findById(id).map(record -> ResponseEntity.ok().body(record))
				.orElse(ResponseEntity.notFound().build());
	}

	@PutMapping("update/{id}")
	public ResponseEntity<cadConfiguracoes> update(@PathVariable("id") long id, @RequestBody cadConfiguracoes config) {

		Optional<cadConfiguracoes> configOptional = configRepository.findById(id);

		if (!configOptional.isPresent())
			return ResponseEntity.notFound().build();

		config.setCFG_Codigo(id);

		configRepository.save(config);

		return ResponseEntity.noContent().build();
	}

	@PostMapping
	public void post(@RequestBody cadConfiguracoes config) {
		configRepository.save(config);
	}

	@DeleteMapping("delete/{id}")
	public void delete(@PathVariable("id") long id) {
		configRepository.deleteById(id);
	}
}
