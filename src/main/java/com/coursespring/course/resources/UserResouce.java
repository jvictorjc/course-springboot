package com.coursespring.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coursespring.course.entities.User;
import com.coursespring.course.services.UserService;


@RestController //recurso web, que é implementado por um controlador rest
@RequestMapping(value = "/users") //dar nome ao recurso
public class UserResouce {
	
	@Autowired
	private UserService service;
	
	@GetMapping //metodo que responde um get do http
	public ResponseEntity<List<User>> findAll(){
		List<User> list = service.findAll();
		return ResponseEntity.ok().body(list); //para retornar o corpo do http. 
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<User> findById(@PathVariable Long id){
		User obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}
