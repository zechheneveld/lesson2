package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/api")
public class DataController {
	
	ListManager manager;

	@GetMapping("{name}")
	public String addName(@PathVariable String name) {
		manager.addItem(name);
		return "Hello "	+ name;
	}
	public String listName() {
		return "List of Items: " + manager.getItems().size();
	}
}
