package com.example.daleel140Prototype.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.daleel140Prototype.models.Sentences;
import com.example.daleel140Prototype.services.SentenceService;


@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:8080")
public class SearchController {
	@Autowired
	private SentenceService sentenceService;


	    @GetMapping("/semantic-search")
	    public ResponseEntity<List<Sentences>> semanticSearch(@RequestParam("term") String searchTerm) {
	        // Implementation logic here
	        List<Sentences> results = sentenceService.semanticSearch(searchTerm);
	        return ResponseEntity.ok(results);
	    }
	    
	    @GetMapping("/autocomplete")
	    public ResponseEntity<List<String>> autocomplete(@RequestParam("term") String searchTerm) {
	        List<String> suggestions = sentenceService.getAutoCompleteSuggestions(searchTerm);
	        return ResponseEntity.ok(suggestions);
	    }
}
