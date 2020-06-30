package com.coursespring.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coursespring.course.entities.Product;
import com.coursespring.course.services.ProductService;

@RestController // recurso web, que é implementado por um controlador rest
@RequestMapping(value = "/products") // dar nome ao recurso
public class ProductResouce {

	@Autowired
	private ProductService service;

	@GetMapping // metodo que responde um get do http
	public ResponseEntity<List<Product>> findAll() {
		List<Product> list = service.findAll();
		return ResponseEntity.ok().body(list); // para retornar o corpo do http.
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<Product> findById(@PathVariable Long id) {
		Product obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}
