package com.example.daleel140Prototype.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.daleel140Prototype.models.Sentences;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface SentenceRepository extends JpaRepository<Sentences, Long>{
	
	 @Query(value = "CALL SemanticSearch(:term)", nativeQuery = true)
	//@Procedure(name = "SemanticSearch")
	List<Sentences> semanticSearch(@Param("term") String term);
 
	 @Query("SELECT DISTINCT s.arabic_sentence FROM Sentences s WHERE s.arabic_sentence LIKE %:term%")
	 List<String> findAutoCompleteSuggestions(@Param("term") String term);
	 
	/*@PersistenceContext
    private EntityManager entityManager;

    @Transactional(readOnly = true)
    public List<Object[]> semanticSearch(String searchTerm) {
        StoredProcedureQuery query = entityManager.createStoredProcedureQuery("SemanticSearch");
        query.registerStoredProcedureParameter(1, String.class, javax.persistence.ParameterMode.IN);
        query.setParameter(1, searchTerm);
        return query.getResultList();
    }*/
}
