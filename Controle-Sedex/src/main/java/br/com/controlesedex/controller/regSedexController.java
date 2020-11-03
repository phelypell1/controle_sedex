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

import br.com.controlesedex.model.regSedex;
import br.com.controlesedex.repository.regSedexRepository;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/sedex")
public class regSedexController {
	
	@Autowired
	private regSedexRepository sedexRepository;
	
	@GetMapping
	public ResponseEntity<Iterable<regSedex>> get(){
		return ResponseEntity.ok(sedexRepository.findAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<regSedex> getById(@PathVariable("id") long id){
		return sedexRepository.findById(id).map(record -> ResponseEntity.ok().body(record))
				.orElse(ResponseEntity.notFound().build());
	}
	
	@PutMapping("update/{id}")
	public ResponseEntity<regSedex> update(@PathVariable("id") long id, @RequestBody regSedex sedex) {

		Optional<regSedex> sedexOptional = sedexRepository.findById(id);

		if (!sedexOptional.isPresent())
			return ResponseEntity.notFound().build();

		sedex.setSED_Codigo(id);

		sedexRepository.save(sedex);

		return ResponseEntity.noContent().build();
	}

	@PostMapping
	public void post(@RequestBody regSedex sedex) {
		sedexRepository.save(sedex);
	}

	@DeleteMapping("delete/{id}")
	public void delete(@PathVariable("id") long id) {
		sedexRepository.deleteById(id);
	}
	
	
}