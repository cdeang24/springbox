package com.github.numbers24.springbox.springbox;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.numbers24.springbox.util.Anagrams;

import org.springframework.web.bind.annotation.RequestParam;



@RestController
public class HelloController {

	@GetMapping("/")
	public String index() {
		return "Greetings from Spring Boot!";
	}

	@GetMapping("/anagram")
	public List<String> requestMethodName(@RequestParam String word) throws URISyntaxException, IOException {
		return Anagrams.searchAnagrams(word);
	}
	
}