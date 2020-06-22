package com.coursespring.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coursespring.course.entities.User;


@RestController //recurso web, que é implementado por um controlador rest
@RequestMapping(value = "/users") //dar nome ao recurso
public class UserResouce {
	
	@GetMapping //metodo que responde um get do http
	public ResponseEntity<User> findAll(){
		User u = new User(1L, "Maria", "Maria@gmail.com", "9999999999", "12345");
		return ResponseEntity.ok().body(u); //para retornar o corpo do http. 
	}
}
