package com.aa.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

	@Autowired
	private UserApiProxy proxy;
	
	public List<User> listAll() {
		return proxy.getAll();
	}
	
	public User get(Integer id) {
		return proxy.getOne(id);
	}
	
	public User add(User user) {
		return proxy.add(user);
	}
	
	public User update(User user) {
		return proxy.update(user);
	}
	
	public void delete(Integer id) {
		proxy.delete(id);
	}
}
