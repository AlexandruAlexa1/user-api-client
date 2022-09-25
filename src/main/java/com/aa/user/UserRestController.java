package com.aa.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserRestController {

	@Autowired
	private UserService service;
	
	@GetMapping()
	public List<User> listAll() {
		return service.listAll();
	}
	
	@GetMapping("/{id}")
	public User get(@PathVariable("id") Integer id) {
		return service.get(id);
	}
	
	@PostMapping()
	public User save(@RequestBody User user) {
		return service.update(user);
	}
	
	@PutMapping()
	public User update(@RequestBody User user) {
		return service.update(user);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") Integer id) {
		service.delete(id);
	}
	
}







