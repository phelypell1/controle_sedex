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

import br.com.controlesedex.model.tmpImp;
import br.com.controlesedex.repository.tmpImpRepository;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/tmpimp")
public class tmpImpController {
	
	@Autowired
	private tmpImpRepository tmpRepository;
	
	@GetMapping
	public ResponseEntity<Iterable<tmpImp>> get(){
		return ResponseEntity.ok(tmpRepository.findAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<tmpImp> getById(@PathVariable("id") long id){
		return tmpRepository.findById(id).map(record -> ResponseEntity.ok().body(record))
				.orElse(ResponseEntity.notFound().build());
	}
	
	@PutMapping("update/{id}")
	public ResponseEntity<tmpImp> update(@PathVariable("id") long id, @RequestBody tmpImp tmp) {

		Optional<tmpImp> tmpOptional = tmpRepository.findById(id);

		if (!tmpOptional.isPresent())
			return ResponseEntity.notFound().build();

		tmp.setSED_Codigo(id);

		tmpRepository.save(tmp);

		return ResponseEntity.noContent().build();
	}

	@PostMapping
	public void post(@RequestBody tmpImp tmp) {
		tmpRepository.save(tmp);
	}

	@DeleteMapping("delete/{id}")
	public void delete(@PathVariable("id") long id) {
		tmpRepository.deleteById(id);
	}
	
	
}