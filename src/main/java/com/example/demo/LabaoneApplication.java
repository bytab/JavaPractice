package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

		import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class LabaoneApplication {
	public static void main(String[] args) {
		SpringApplication.run(LabaoneApplication.class, args);
	}
}

@RestController
@RequestMapping("/api/laba")
class ItemController {
	private final List<String> items = new ArrayList<>();

	@GetMapping
	public List<String> getItems() {
		return items;
	}

	@PostMapping
	public String addItem(@RequestParam String item) {
		items.add(item);
		return "Done labs: " + item;
	}
}
