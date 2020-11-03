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

import br.com.controlesedex.model.cadVersao;
import br.com.controlesedex.repository.cadVersaoRepository;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/versao")
public class cadVersaoController {
	public cadVersaoController() {
		System.out.println("chamou CidadeController controller");
	}

	@Autowired
	private cadVersaoRepository versaoRepository;

	@GetMapping
	public ResponseEntity<Iterable<cadVersao>> get() {
		return ResponseEntity.ok(versaoRepository.findAll());
	}

	@GetMapping("/{id}")
	public ResponseEntity<cadVersao> getById(@PathVariable("id") long id) {
		return versaoRepository.findById(id).map(record -> ResponseEntity.ok().body(record))
				.orElse(ResponseEntity.notFound().build());
	}

	@PutMapping("update/{id}")
	public ResponseEntity<cadVersao> update(@PathVariable("id") long id, @RequestBody cadVersao versao) {

		Optional<cadVersao>versaoOptional = versaoRepository.findById(id);

		if (!versaoOptional.isPresent())
			return ResponseEntity.notFound().build();

		versao.setVER_Codigo(id);

		versaoRepository.save(versao);

		return ResponseEntity.noContent().build();
	}

	@PostMapping
	public void post(@RequestBody cadVersao versao) {
		versaoRepository.save(versao);
	}

	@DeleteMapping("delete/{id}")
	public void delete(@PathVariable("id") long id) {
		versaoRepository.deleteById(id);
	}
}