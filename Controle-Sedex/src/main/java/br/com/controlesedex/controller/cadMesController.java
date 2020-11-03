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

import br.com.controlesedex.model.cadMes;
import br.com.controlesedex.repository.cadMesRepository;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/mes")
public class cadMesController {
	public cadMesController() {
		System.out.println("chamou mesController controller");
	}

	@Autowired
	private cadMesRepository mesRepository;

	@GetMapping
	public ResponseEntity<Iterable<cadMes>> get() {
		return ResponseEntity.ok(mesRepository.findAll());
	}

	@GetMapping("/{id}")
	public ResponseEntity<cadMes> getById(@PathVariable("id") long id) {
		return mesRepository.findById(id).map(record -> ResponseEntity.ok().body(record))
				.orElse(ResponseEntity.notFound().build());
	}

	@PutMapping("update/{id}")
	public ResponseEntity<cadMes> update(@PathVariable("id") long id, @RequestBody cadMes mes) {

		Optional<cadMes> mesOptional = mesRepository.findById(id);

		if (!mesOptional.isPresent())
			return ResponseEntity.notFound().build();

		mes.setMES_Codigo(id);

		mesRepository.save(mes);

		return ResponseEntity.noContent().build();
	}

	@PostMapping
	public void post(@RequestBody cadMes mes) {
		mesRepository.save(mes);
	}

	@DeleteMapping("delete/{id}")
	public void delete(@PathVariable("id") long id) {
		mesRepository.deleteById(id);
	}
}