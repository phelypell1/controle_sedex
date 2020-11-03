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

import br.com.controlesedex.model.cadTipoItem;
import br.com.controlesedex.repository.cadTipoItemRepository;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/tipo_item")
public class cadTipoItemController {
	public cadTipoItemController() {
		System.out.println("chamou CidadeController controller");
	}

	@Autowired
	private cadTipoItemRepository itemRepository;

	@GetMapping
	public ResponseEntity<Iterable<cadTipoItem>> get() {
		return ResponseEntity.ok(itemRepository.findAll());
	}

	@GetMapping("/{id}")
	public ResponseEntity<cadTipoItem> getById(@PathVariable("id") long id) {
		return itemRepository.findById(id).map(record -> ResponseEntity.ok().body(record))
				.orElse(ResponseEntity.notFound().build());
	}

	@PutMapping("update/{id}")
	public ResponseEntity<cadTipoItem> update(@PathVariable("id") long id, @RequestBody cadTipoItem item) {

		Optional<cadTipoItem> itemOptional = itemRepository.findById(id);

		if (!itemOptional.isPresent())
			return ResponseEntity.notFound().build();

		item.setTIT_Codigo(id);

		itemRepository.save(item);

		return ResponseEntity.noContent().build();
	}

	@PostMapping
	public void post(@RequestBody cadTipoItem item) {
		itemRepository.save(item);
	}

	@DeleteMapping("delete/{id}")
	public void delete(@PathVariable("id") long id) {
		itemRepository.deleteById(id);
	}
}