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

import br.com.controlesedex.model.cadEstado;
import br.com.controlesedex.repository.cadEstadoRepository;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/estado")
public class cadEstadoController {
	public cadEstadoController() {
		System.out.println("chamou CidadeController controller");
	}

	@Autowired
	private cadEstadoRepository estadoRepository;

	@GetMapping
	public ResponseEntity<Iterable<cadEstado>> get() {
		return ResponseEntity.ok(estadoRepository.findAll());
	}

	@GetMapping("/{id}")
	public ResponseEntity<cadEstado> getById(@PathVariable("id") long id) {
		return estadoRepository.findById(id).map(record -> ResponseEntity.ok().body(record))
				.orElse(ResponseEntity.notFound().build());
	}

	@PutMapping("update/{id}")
	public ResponseEntity<cadEstado> update(@PathVariable("id") long id, @RequestBody cadEstado estado) {

		Optional<cadEstado> estadoOptional = estadoRepository.findById(id);

		if (!estadoOptional.isPresent())
			return ResponseEntity.notFound().build();

		estado.setEST_Codigo(id);

		estadoRepository.save(estado);

		return ResponseEntity.noContent().build();
	}

	@PostMapping
	public void post(@RequestBody cadEstado estado) {
		estadoRepository.save(estado);
	}

	@DeleteMapping("delete/{id}")
	public void delete(@PathVariable("id") long id) {
		estadoRepository.deleteById(id);
	}
}