package com.github.cdeang24.springbox.springbox;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.cdeang24.springbox.util.Anagrams;

import org.springframework.web.bind.annotation.RequestParam;


/**
 * 
 */
@RestController
public class HelloController {

	/**
	 * 
	 * @return
	 */
	@GetMapping("/")
	public String index() {
		return "Greetings from Spring Boot!";
	}

	/**
	 * 
	 * @param word
	 * @return
	 * @throws URISyntaxException
	 * @throws IOException
	 */
	@GetMapping("/anagram")
	public List<String> requestMethodName(@RequestParam String word) throws URISyntaxException, IOException {
		return Anagrams.searchAnagrams(word);
	}
}
