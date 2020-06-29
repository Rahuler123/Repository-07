package com.mobileApi;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/blog/details")
public class mobApi {
	private final mobService mobService;
	
	@Autowired
	public mobApi(mobService mobService) {
		this.mobService = mobService;
	}
	
	@GetMapping
	public ResponseEntity<List<mobile>> findAll() {
		return ResponseEntity.ok(mobService.findAll());
	}
	
	
	@GetMapping("/{id}")
	public ResponseEntity <mobile> findById(@PathVariable Long id){
		java.util.Optional<mobile> mob = mobService.findById(id);
		 return ResponseEntity.ok(mobService.findById(id).get());
		 
	}
	 @PostMapping("/create")
	 public ResponseEntity <mobile> create (@RequestBody mobile mob){
		 return ResponseEntity.status(HttpStatus.CREATED).body(mobService.save(mob));
		 }
	 
	@PutMapping("/{id}")
	public ResponseEntity <mobile> update (@PathVariable Long id, @RequestBody mobile mob){
	return ResponseEntity.accepted().body(mobService.save(mob));
	}
	
	
	@DeleteMapping("/{id}")
	public ResponseEntity delete(@PathVariable Long id) {
		mobService.deleteById(id);
		return ResponseEntity.accepted().build();
		
	}
	
	
}
