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

import br.com.controlesedex.model.cadTipoEquipamento;
import br.com.controlesedex.repository.cadTipoEquipamentoRepository;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/tipoequipamento")
public class cadTipoEquipamentoController {
	public cadTipoEquipamentoController() {
		System.out.println("chamou CidadeController controller");
	}

	@Autowired
	private cadTipoEquipamentoRepository equRepository;

	@GetMapping
	public ResponseEntity<Iterable<cadTipoEquipamento>> get() {
		return ResponseEntity.ok(equRepository.findAll());
	}

	@GetMapping("/{id}")
	public ResponseEntity<cadTipoEquipamento> getById(@PathVariable("id") long id) {
		return equRepository.findById(id).map(record -> ResponseEntity.ok().body(record))
				.orElse(ResponseEntity.notFound().build());
	}

	@PutMapping("update/{id}")
	public ResponseEntity<cadTipoEquipamento> update(@PathVariable("id") long id, @RequestBody cadTipoEquipamento equ) {

		Optional<cadTipoEquipamento> equOptional = equRepository.findById(id);

		if (!equOptional.isPresent())
			return ResponseEntity.notFound().build();

		equ.setEQU_Codigo(id);

		equRepository.save(equ);

		return ResponseEntity.noContent().build();
	}

	@PostMapping
	public void post(@RequestBody cadTipoEquipamento equ) {
		equRepository.save(equ);
	}

	@DeleteMapping("delete/{id}")
	public void delete(@PathVariable("id") long id) {
		equRepository.deleteById(id);
	}
}
