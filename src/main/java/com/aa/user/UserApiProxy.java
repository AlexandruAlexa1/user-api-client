package com.aa.user;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "user-api")
public interface UserApiProxy {

	@GetMapping("/api/v1/users")
	public List<User> getAll();
	
	@GetMapping("/api/v1/users/{id}")
	public User getOne(@PathVariable("id") Integer id);
	
	@PostMapping("/api/v1/users")
	public User add(@RequestBody User user);
	
	@PutMapping("/api/v1/users")
	public User update(@RequestBody User user);
	
	@DeleteMapping("/api/v1/users/{id}")
	public void delete(@PathVariable("id") Integer id);
}
