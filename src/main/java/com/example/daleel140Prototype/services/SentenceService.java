package com.example.daleel140Prototype.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.daleel140Prototype.models.Sentences;
import com.example.daleel140Prototype.repository.SentenceRepository;

@Service
public class SentenceService {
	
	@Autowired
	   private SentenceRepository sentenceRepository;
	


   // @Transactional(readOnly = true)
	public List<Sentences> semanticSearch(String term) {
		return sentenceRepository.semanticSearch(term);
	}
	
	 
	   
	   // @Transactional(readOnly = true)
	    public List<String> getAutoCompleteSuggestions(String searchTerm) {
	        return sentenceRepository.findAutoCompleteSuggestions(searchTerm);
	    }
	 

}
